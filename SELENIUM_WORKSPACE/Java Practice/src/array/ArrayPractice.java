package array;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
		int school [][]=new int [4][3];
		
		school [0][0]=10;
		school [0][1]=20;
		school [1][0]=30;
		school [1][1]=40;
		school [2][0]=50;
		school [2][1]=60;
		school [2][2]=70;
		school [3][0]=80;
		school [3][1]=90;
		school [3][2]=100;
		
		//System.out.println("Students"+ school[3][2]);
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<school[i].length;j++) {
				System.out.println("Students"+ school[i][j]);
			}
		}
		
	}

}
