
public class Scanner {

	public static void main(String[] args) throws Exception{
		// You can read the value from keyboard by scanner or Buffered Reader
		//Scanner
		
		//BuffredReader
		int i=System.in.read();
		System.out.println((char)i);
		String Str=" ";
		while((i=System.in.read())!=48)
		{
			Str=Str+(char)i;
		}
		System.out.println(Str);
	}

}