package interview;

import java.util.UUID;

public class JavaRandom {
	
	public static void main (String agrs[]){
		
		String string = UUID.randomUUID().toString().replace("-", "").substring(0, 5);
		System.out.println(string);
	}
	    
	

}
