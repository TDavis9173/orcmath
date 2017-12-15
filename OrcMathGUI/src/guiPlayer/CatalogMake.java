package guiPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogMake {
	private ArrayList<Countries> list;

	public CatalogMake() {
		list = new ArrayList<Countries>();
		list.add(new Countries("USA","USAflag.png","english"));
		
	}

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		CatalogMake test= new CatalogMake();
		System.out.println(test.getCSVContent());

	}
	public String getCSVContent() {
		String data = "Flag,Name,Language\n";
		for(Countries c:list) {
			data+=c+"\n";
		}
		return data;
	}
	public void addNewItem(String Flag,String Name,String Lang) {
		list.add(new Countries(Name,Flag,Lang));
		System.out.println("item added.");
		}
	public void getUserItem() {
		System.out.println("enter the name of your country");
		String a = n.nextString();
	}
}
