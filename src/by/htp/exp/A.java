package by.htp.exp;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A {
	
	public void doSmth() throws IOException {
		throw new IOException();
	}
	
	class B extends A {
		//��� ������������ ������� ������� ����� ��������� ��������� , �� ������ � ������� �������� �� protected ������� public
		
		public void doSmth() throws FileNotFoundException {
			throw new FileNotFoundException();
		}
		
		
		//������ ��������� ������� ��������� Exception!!!!!!!!!!!!!!!!!! �� throw FileNotFoundException � �������� �������������� � throw Exception
	//������ ������ �� exception � �������� � fileExcption ��� ���������������
	}
}
