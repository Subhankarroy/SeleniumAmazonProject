package array;

public class StringArray {
	
	public static void main(String[] args) {
		
		String Country[]= {"India","Australia","Italia","New-Zealand"};
		
		for(String A:Country)
		
		System.out.println("The county name is :"+ A.toUpperCase().replaceAll("-", ""));
		
	}

}
