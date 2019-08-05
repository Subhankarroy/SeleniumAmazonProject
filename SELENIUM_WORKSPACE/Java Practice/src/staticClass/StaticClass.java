package staticClass;
import java.io.IOException;

import staticClass.MasterClass;
import staticClass.MasterClass.AAnotherone;
import staticClass.MasterClass.intone;
import utilities.Usefulmethods;



public class StaticClass implements intone, Usefulmethods {

	public static void main(String[] args) throws IOException {
		
		
		MasterClass ob=new MasterClass();
		
		ob.printData();
		//System.out.println("So Trying to print the data value public:" + ob.restricteddata);
		
		MasterClass.AAnotherone.data();
		intone driver=new StaticClass();
		Usefulmethods Prints=new StaticClass();
		driver.Aone();
		Prints.printstatement();
		
		 
		// TODO Auto-generated method stub

	}

	public void Aone() {
		// TODO Auto-generated method stub
		System.out.println("I am an abstract method");
	}

	public void printstatement() {
		// TODO Auto-generated method stub
		System.out.println("I am Method One inside Usefulmethods Interface ");
	}

}
