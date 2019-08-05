package staticClass;

import java.io.IOException;

import utilities.ExtractToText;

public class  MasterClass {

	private int restricteddata=402;
	public int data=201;
	String datatake="HereI am";
	final String MY_NAME="Subhankar";
	
private void secret() {
	System.out.println("I am inside a Private method");
}
		public  void printData() {
			// TODO Auto-generated method stub
			
			System.out.println("I am inside a Static Method");
			System.out.println("Lets Access the Private data:"+ restricteddata );
			secret();
			
		}
		
		interface intone{
			 void Aone();
		}
		//public abstract void absrcttry();

		static class AAnotherone {
			final static String MY_NAME="I have been written in the text file Successfully!";
			static void data() throws IOException {
			System.out.println("I am inside a Staticclass, and my name id :  " + MY_NAME);
			ExtractToText write=new ExtractToText();
			try {
			write.WriteTofile(MY_NAME);
			}
			catch (IOException e) {
				write.WriteTofile(e.getMessage());
			}
			
		}

}}
