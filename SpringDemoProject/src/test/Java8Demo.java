package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Java8Demo {
	FileReader fileReader;
	BufferedReader buffReader;
	
	public Java8Demo() {
		// TODO Auto-generated constructor stub
	}
	
	Java8Demo(FileReader fReader, BufferedReader bReader){
		this.fileReader=fReader;
		this.buffReader=bReader;
	}
	public static void main(String[] args) throws IOException {
		String path = "D:/java_programs/emails.txt";
		FileReader fReader = new FileReader(path);
		BufferedReader bReader = new BufferedReader(fReader);
		Java8Demo test1 = new Java8Demo(fReader, bReader);
		List<String> resList = test1.readEmails(bReader);
		for(String res : resList) {
			System.out.println(res);
		}
	}
	
	public static List<String> readEmails(BufferedReader buffReader) throws IOException{
		List<String> list = new ArrayList<>();
		String line = "";
		while(line!=null) {
			line = buffReader.readLine();
			if(line!=null && line.startsWith("sam"))
			list.add(line);
		}
		return list;
		
	}
}
