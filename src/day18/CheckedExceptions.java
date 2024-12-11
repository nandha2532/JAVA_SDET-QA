package day18;

import java.io.FileInputStream;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Prpgram is started ...");
		System.out.println("Program is In  Progress...");
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\vnand\\NK\\API\\doc\\Java.docx");
		
		
		try {
			Thread.sleep(1000);  //intimated by Java to add try,catch or ,throws 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.sleep(1000);
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
	}

}
