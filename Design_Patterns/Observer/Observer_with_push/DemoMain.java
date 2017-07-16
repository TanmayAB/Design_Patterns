public class DemoMain{

	public static void main(String[] a){
		MySubject mySubject = new MySubject();
		MyObserver myObserver = new MyObserver(mySubject,"Ob1");
		MyObserver myObserver2 = new MyObserver(mySubject,"Ob2");

		mySubject.setState(5);
		myObserver2.deRegister();
		mySubject.setState(7);
		

	}
}