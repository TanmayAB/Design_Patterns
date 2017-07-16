public class MyObserver implements Observer {

	private Subject mySubject;
	private String info;

	public String getInfo() {
		return this.info;	
	}
	public MyObserver(Subject mySubject, String info) {
		this.mySubject = mySubject;
		this.info = info;
		System.out.println("Registering : " + info);
		mySubject.addObserver(this);
	}
	public void update(int currState){
		System.out.println("State changed to " + currState);
	}

	public void deRegister(){
		System.out.println("DeRegistering : " + info);
		mySubject.removeObserver(this);
	}
}