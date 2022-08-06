package study_0801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//파일 읽어 들이기 실습

public class Ex2_2 {
	public static List<String> fileLineRead(String name) throws IOException {
		List<String> retStr = new ArrayList<String>();
		String filepath = "C:\\\\Users\\\\YEJI\\\\eclipse-workspace\\\\study_0801\\\\item.txt";;
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filepath),"UTF8"));
		String s;
		while ((s = in.readLine()) != null) {
			retStr.add(s);
		}
		in.close();
		return retStr;
	}

	public static void main(String[] args) throws IOException {
		 List<String> ret = fileLineRead("item.txt");
		  for(int i = 0;i<ret.size();i++){
		   System.out.println("Line("+i+")"+ret.get(i));
		
		
	
		

	}
	}
}
