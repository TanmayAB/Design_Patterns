import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

	private Observable observable;
	private String info;

	public String getInfo() {
		return this.info;	
	}
	public MyObserver(Observable observable, String info) {
		this.observable = observable;
		this.info = info;
		System.out.println("Registering : " + info);
		observable.addObserver(this);
	}
	public void update(Observable observable, Object arg){

		if (observable instanceof MySubject) {
			MySubject mySubject = (MySubject) observable;
			System.out.println("Answer : " + mySubject.getState());
		}
	}

	public void deRegister(){
	 	System.out.println("DeRegistering : " + info);
	 	observable.deleteObserver(this);
	}
}