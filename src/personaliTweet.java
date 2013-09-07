import twitter4j.*;
import java.io.*;
import java.util.*;

public class personaliTweet {
	
	static class category{
		
		String[] words;
		int counter;
		String name;
		
		public category(String cat){
			try{
				BufferedReader in=new BufferedReader(new FileReader(new File(cat)));
				words=new String[Integer.parseInt(in.readLine())];
				for (int i=0; i<words.length; i++){
					words[i]=in.readLine();
				}
				in.close();
			}
			catch(FileNotFoundException e){
				System.out.println("File not found");
			}
			catch (IOException e){
				System.out.println("IO Exception motherfucker...");
			}
			name=cat;
		}
		
	}
	
	static class analyzer{
		category[] theCategories;
		
		public analyzer(String initialFile){
			try{
				BufferedReader in=new BufferedReader(new FileReader(new File(initialFile)));
				theCategories=new category[Integer.parseInt(in.readLine())];
				for (int i=0; i<theCategories.length; i++){
					theCategories[i]=new category(in.readLine());
				}
				in.close();
			}
			catch(FileNotFoundException e){
				System.out.println("File not found dumbass");
			}
			catch (IOException e){
				System.out.println("IO Exception motherfucker...");
			}
		}
	}
	
	public static void main(String[] args){
		analyzer test=new analyzer("categories.txt");
		for (int i=0; i<test.theCategories.length; i++){
			System.out.println(test.theCategories[i].name);
			for (int m=0; m<test.theCategories[i].words.length; m++){
				System.out.println(test.theCategories[i].words[m]);
				//this is a change
				//this is another change
			}
		}
	}

}
