package songManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLauncher {

	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList<String>();
		//list.add("string");
		//list.add("stringstring");
		//list.add("stringstringstring");
		
		/*for (String string : list) {
			System.out.println(string);
		}
		list.remove(1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		//String[] list = (String[]) list.length;
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//Integer number = new Integer(54);
		//Integer number = 54;
		//int numberValue = number;
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < 10 ; i++) {
			
			int a = ((int) (Math.random() * 10) +1);
			if(a == 5){
				count ++;
			}
		}System.out.println(count);
	}
}
