import java.io.*;

public class test{
	public static void main(String[] args){
		try{
			BufferedReader in=new BufferedReader(new FileReader(new File("categories.txt")));
		}
		catch (FileNotFoundException e){
			System.out.println("File not found");
		}
		catch (IOException e){
		}	
	}
}