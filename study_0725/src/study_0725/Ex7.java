package study_0725;
//ch15-23 StringReader, StringWriter

import java.io.*;

class Ex7 {

	public static void main(String[] args) {
		String inputData = "ABCE";
		StringReader input = new StringReader(inputData);
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			while((data=input.read())!=-1) {
				output.write(data);
			}
		} catch (IOException e) {
			
		}
		System.out.println("Input Data	:" + inputData);
		System.out.println("Output Data	:" + output.toString());

	}

}
