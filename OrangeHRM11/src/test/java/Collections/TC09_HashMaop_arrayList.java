package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TC09_HashMaop_arrayList {
	
	
	public static void main(String[] args) {
		
		Map<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
		
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		List.add(18);
		List.add(10);
	    map.put("mango",List);
	    
		ArrayList<Integer> List1 = new ArrayList<Integer>();
		
		List1.add(30);
		List1.add(40);

		map.put("Orange",List1);
		
		
		System.out.print(map);
	}

}
