import java.util.List;
import java.util.ArrayList;


public class  MySubject implements Subject {

	private int currState;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer){
		if(observer != null){
			observers.add(observer);
		}
	}

	public void removeObserver(Observer observer){
		MyObserver temp = (MyObserver) observer;

		int index = observers.indexOf(observer);
		if(index >= 0){			
			System.out.println("Removed : " + temp.getInfo() + " with index : " + index);
			observers.remove(index);
		}
	}

	public void notifyObservers(){
		for (Observer observer : observers){
			MyObserver temp = (MyObserver) observer;
			System.out.println("Notifying : " + temp.getInfo());
			observer.update(currState);
		}
	}

	public void setState(int currState){
		this.currState = currState;
		notifyObservers();
	}
}
