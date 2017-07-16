public class WoodCutter extends Character {
	
	public WoodCutter() {
		this.weaponType = new Axe();
	}

	public void sayHello(){
		System.out.println("Hello from WoodCutter");
	}
}