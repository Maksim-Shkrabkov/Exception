package by.htp.exp;

public class IllegalActionException extends Exception {

	//Свое исключение, а потом выкидываем и обрабатываем его
	
	//Если хотим чтобы исключение было:
	//проверяемое исключение наследуем от Exception;
	//непроверяемые наследуем от RunTimeException
	
	public IllegalActionException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalActionException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public IllegalActionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public IllegalActionException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
  
	
	
}
