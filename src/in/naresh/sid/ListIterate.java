package in.naresh.sid;

import java.util.ArrayList;
import java.util.List;



public class ListIterate {
	
	public static void main(String[] args) {
		List<String> ColourList = new ArrayList<String>();
		
		ColourList.add("Violate");
		ColourList.add("Red");
		ColourList.add("Green");
		ColourList.add("Blue");
		ColourList.add("orange");
		ColourList.add("yellow");
		
//		System.out.println(ColourList);
		
		for(String colour: ColourList) {
			System.out.println("colour list are "+ colour);
			
		}
	}

}
