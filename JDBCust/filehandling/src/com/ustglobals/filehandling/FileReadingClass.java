package com.ustglobals.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {

	public static void main(String[] args) {

		String path = "C:\\Users\\MEGHANA P M\\Desktop\\text.txt";
		
		FileReader  reader= null;
		try 
		{
			reader = new FileReader(path);
			int i;
			while((i=reader.read()) !=-1)
			{
				char ch = (char) i;
				System.out.print(ch);

			}
						
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
