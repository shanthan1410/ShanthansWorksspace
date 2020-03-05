import java.io.IOException;
import java.util.ArrayList;

public class sampleTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		datadriven d =new datadriven();
		ArrayList data=d.getData("purchase");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

}
