public class Basic {

	public static void main(String[] args) throws ArithmeticException {
		System.out.println(10/0);   // --> means that whenever you use throws, flow will disrupt and end the program
		exception1();   // --> means that try catch block will allow for the flow to run smoothly after handling the exception but here also, within method, the flow will stop
		exception2();  //--> Means that throw new exception also disrupts the flow of program and will not allow for things to run
	}

	public static void exception1(){
		System.out.println("in exception1() ");
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}

	public static void exception2(){
		System.out.println("In exception2()");
		throw new ArithmeticException("Throwing an explicit exception to disrupt flow of program");
	}
}
