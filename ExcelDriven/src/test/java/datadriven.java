import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public ArrayList<String> getData(String testCaseName) throws IOException {

		ArrayList<String> a = new ArrayList<String>();
		/*
		 * Agenda: Identify TestCases column by scanning the entire first row Once
		 * column is identified then scan entire testcase column to idebtify purchase
		 * testcase row After you grab purchase testcase row=pull all the data of that
		 * row and feed into test
		 */

		/*
		 * Create object for XSSFWorkbook class 
		 * Get Access to Sheet 
		 * Get Access to all rows of sheet 
		 * Access to specific row from all rows 
		 * Get Access to all cells ofRow 
		 * Access the Data from Excel into Arrays.
		 */

		// to get the location of excel sheet, below class accepts fileinputstream
		// argumnet(which stores the location of the excel)
		FileInputStream fis = new FileInputStream("C:\\Users\\peesa\\Downloads\\Book.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Identify TestCases column by scanning the entire first row

				// iterate through each and every row
				Iterator<Row> rows = sheet.iterator(); // sheet is a collection of rows

				// will give you first row which we need
				Row firstrow = rows.next();

				// iterate through each and every cell of row to find testCases

				Iterator<Cell> ce = firstrow.cellIterator();// row is a collection of cell
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);

				// Once column is identified then scan entire testcase column to idebtify
				// purchase testcase row

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {

						// After you grab purchase testcase row=pull all the data of that row and feed
						// into test

						Iterator<Cell> c = r.cellIterator();
						while (c.hasNext()) {
							Cell check=c.next();
							if(check.getCellType()==CellType.STRING) {
							a.add(check.getStringCellValue());
							}
							else {
								
								a.add(NumberToTextConverter.toText(check.getNumericCellValue()));
								
							}
						}
					}

				}
			}

		}

		return a;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}

}
