package test;

import save.Save;

public class Test {
	private Save save = new Save();
	
	public Save getSave() {
		return save;
	}
	
	public void setSave(Save Save) {
		this.save = Save;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.getSave().save();
	}
}
