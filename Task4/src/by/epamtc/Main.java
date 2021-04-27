package by.epamtc;

import by.epamtc.view.SelectSource;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please select data source:");
		System.out.println("1 - Console");
		System.out.println("2 - File");
		
		String str = SelectSource.setSource();
		
		System.out.println(str);

	}

}
