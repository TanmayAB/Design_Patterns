import java.util.List;
import java.util.ArrayList;
import java.util.Observable;


public class  MySubject extends Observable {

	private int currState;


	public int getState() { return currState;}

	public void setState(int currState){
		setChanged();
		this.currState = currState;
		notifyObservers();
	}
}
