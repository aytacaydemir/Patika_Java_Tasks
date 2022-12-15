import java.util.Random;

public class Snake extends Obstacle {

	public Snake() {
		super("Snake", 3, 12, "Rastgele Hediye", 5); // damage 3 ve 6 arasý olmalý, default 3 tanýmladýk.
	}

	public void setRandDamage() {
		Random n = new Random();
		int result = n.nextInt(3) + 3;
		this.setDamage(result);
	}

}
