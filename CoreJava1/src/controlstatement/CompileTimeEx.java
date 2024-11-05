package exceptionex;
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class CompileTimeEx {

	public static void main(String[] args) throws ClassNotFoundException, NumberFormatException, IOException {
//	try {
//			Class.forName("basic.Demo45678");
//			System.out.println("Class Found");
//		}catch(ClassNotFoundException e) {
//		   System.out.println(e.getMessage());
//	   System.out.println("Class not Found");
//			System.out.println(e);

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter ur name:");
		 String name = br.readLine();
		 System.out.println("Name:"+name);
		 System.out.println("Enter ur percentage:");
		 float per=Float.parseFloat(br.readLine());
		
 		 System.out.println("Percentage:"+per);
}


		 
		
				

}

