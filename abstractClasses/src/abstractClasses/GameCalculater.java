package abstractClasses;

public abstract class GameCalculater {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyununuz Bitti.");
	}

}
