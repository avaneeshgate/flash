import java.io.*;
import java.util.Scanner;
public class Scanner2 {

	public static void main(String[] args) {
		String str=" ";
		
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		System.out.println("hello " +str);
		//whenever you will have go to convert from string to integer then use 
		/*parseInt() method and this is the object of integer class
For example*/
	/*	either you use Integer.parseInt(); or nextInt() directly.*/
		int i;
		/*i= Integer.parseInt(sc.nextLine());*/
		i=sc.nextInt();
		System.out.println(i);
	}

}	
