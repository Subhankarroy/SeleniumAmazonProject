package utilities;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class ExtractToText{
	
	Date date = new Date() ;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
	
	 FileWriter fw=null;
	public ExtractToText(){
		
	
	try{    
         fw=new FileWriter("C:\\Users\\Subhankar\\Desktop\\OutputFiles\\LogFile_"+dateFormat.format(date) +".txt");    
         
        }catch(Exception e){System.out.println(e);}    
        System.out.println("Success...");    
   }

	public void WriteTofile(String Content) throws IOException {
		
		// TODO Auto-generated method stub
		try {
		 fw.write(Content);    
         fw.close();   
		
	}  
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
	

	}
}