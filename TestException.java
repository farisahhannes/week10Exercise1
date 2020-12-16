public class TestException {
	
	public static void main (String [] args) {
	method1();
	}

	public static void method1(){
		System.out.println("method1");
//		try {
		method2();
//	} catch (ArrayIndexOutOfBoundsException e) {
//		System.out.println("Catch here " + e);
//	}
}

	public static void method2()
	{
		System.out.println("method2");
		method3();
	}

	public static void method3() {
		System.out.println("method3");
		int [] nombor = {1,2,3};
		System.out.println(nombor[3]);
	}
}