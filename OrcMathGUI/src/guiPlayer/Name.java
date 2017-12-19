package guiPlayer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Name {

	public Name() {
		
	}
	public static void main(String[]args) {
		Name main = new Name();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter content:");
		String content = main.getInput(in);
		main.testSaveContent("input.txt", content + "\n");
	}
	private String getInput(Scanner in) {
		String input = in.nextLine();
		return input;
		
	}
	private void testSaveContent(String fileName, String content) {

		try{    

			FileWriter fw=new FileWriter(fileName);    

			fw.write(content);    

			fw.close();    

			System.out.println("Success! File \""+fileName+"\" saved!");

		}catch(IOException e){

			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");

		}



	}


}
