package Collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class TC08_HashMap1 {

	public static void main(String[] args) {
		
		Map<String,Integer> s1=new HashMap<String,Integer>();
		s1.put("Kiran",10);
		s1.put("Ravi",20);
		s1.put("Venkat",30);
		s1.put("Kiran",100);
		s1.put(null,800);
		s1.put(null,900);  
		s1.put("ABC",null);
		s1.put("DEF",null);
		//s1.put("Kiran",5);

		System.out.println(s1); //  null=900,ABC=null,DEF=null;
		
		
		Map<Integer,String> s2=new HashMap<Integer,String>();
		s2.put(10,"Kiran");
		s2.put(20,"Ravi");
		s2.put(30,"Venkat");
		s2.put(40,"Venkat");
		s2.put(40,"Meghana");
		System.out.println(s2);
	}

}
