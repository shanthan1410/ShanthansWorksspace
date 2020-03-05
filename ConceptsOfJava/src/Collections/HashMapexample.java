package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Key=Integer; Value=String
		HashMap<Integer, String> hm =new HashMap<Integer, String>();
        hm.put(1, "Hello");
        hm.put(2, "GoodMorning");
        hm.put(3, "GoodNight");
        hm.put(4, "GoodBye");
        System.out.println(hm);
        
        //Will remove string having key 3
        hm.remove(3);
        System.out.println(hm);
        
        //will fetch string having key 1
        System.out.println(hm.get(1));
        
        
        //???? Interview create a hashtable- pass table into set and extract key and values using iterator
        //Converting Hashmap into a set
        Set sn=hm.entrySet();
        Iterator it=sn.iterator();
        
        while(it.hasNext()) {
        	//System.out.println(it.next());
        	//  In first index,it will point towards "key" and finds "value" also in same box
        	// it will confuse which one to pick key or value and fails
        	
			/*
			 *  By casting Map.entry we are saying this is a map kind of structure please separate in
			 * the form of  keys and value and provide us in two diff format
			 */        	
        	Map.Entry mp=(Map.Entry)it.next();
        	System.out.println(mp.getKey());
        	System.out.println(mp.getValue());
        }
	}

}
