package by.htp.exp;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A {
	
	public void doSmth() throws IOException {
		throw new IOException();
	}
	
	class B extends A {
		//при преопределии обычных методов можно расширять видимость , но только в большую величину из protected сделать public
		
		public void doSmth() throws FileNotFoundException {
			throw new FileNotFoundException();
		}
		
		
		//нельзя расширять область видимости Exception!!!!!!!!!!!!!!!!!! Из throw FileNotFoundException в родителе переопределить в throw Exception
	//только сужать из exception в родителе к fileExcption при переопределении
	}
}
