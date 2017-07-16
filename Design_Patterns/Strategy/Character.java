public abstract class Character {
	
	WeaponType weaponType;
	
	public abstract void sayHello();	

	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}
	public WeaponType setWeaponType() {
		return this.weaponType;
	}

	public void attack() {
		this.weaponType.attack();
	}

	public void smile(){
		System.out.println("All character smiles");
	}
}