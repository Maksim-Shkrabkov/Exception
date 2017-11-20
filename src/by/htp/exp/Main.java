package by.htp.exp;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		try {
			Main main  = new Main();
			main.doSmth();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception ex in catch block");
		} finally {
			System.out.println("abcdef");
		}
		System.out.println("ghij");
		
		
		
//		Exception ex = new Exception();
//		
//		Error er = new Error();
//		
//		//checked
//		IOException ioEx = new IOException();
//		
//		//unchecked
//		
//		NullPointerException nullPointerEx = new NullPointerException();

	}
	
	public void doSmth() throws Exception {
		throw new Exception();
		//throw new IllegalActionException("smth happend"); //свое исключение
	}

}
