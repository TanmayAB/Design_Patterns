public class DemoMain{

	public static void main(String[] a){
		
		Character swordsman = new SwordsMan();
		Character woodcutter = new WoodCutter();
		Character knight = new Knight();


		swordsman.sayHello();
		knight.sayHello();
		woodcutter.sayHello();

		swordsman.attack();
		knight.attack();
		woodcutter.attack();

		System.out.println("Giving woodcutter a sword");
		woodcutter.setWeaponType(new Sword());
		woodcutter.attack();


	}	
}
