package chapter05;

//这段代码看不懂，不过书上也直接说了，先给你用一下，以后再慢慢深入理解诶。 简单理解就是getUserInput这个方法，将用户输入打印出来了
import java.io.*;

public class GameHelper {
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		 try {
			 BufferedReader is  = new BufferedReader(
					 new InputStreamReader(System.in));
			 inputLine = is.readLine();
			 if(inputLine.length() == 0) return null;			 
		 }catch (IOException e) {
			 System.out.println("IOException: " + e);
		 }
		 return inputLine;
	}

}
