package FunctionalInterfaces;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		FunctionalIfaces f = new FunctionalIfaces()
//		{
//			public void doSomething()
//			{
//				System.out.println("hello");
//			}
//		};
		
		FunctionalIfaces f;
		f = () -> System.out.println("hello");
		f.doSomething();
		f.myDefaultMethod();
		FunctionalIfaces.myStaticMethod();

	}

}
