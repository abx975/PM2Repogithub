package aufgabenblatt4;

/**
 * Klasse repräsentiert die Punkte
 * 
 * @author Nils Egge, Eduard Veit
 *
 */
public class Punkt {
	private double x, y;

	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Getter
	 * 
	 * @return liefert die X-Koordinate des Punktes zurueck
	 */
	public double getX() {
		return x;
	}

	/**
	 * Getter
	 * 
	 * @return liefert die Y-Koordinate des Punktes zurueck
	 */
	public double getY() {
		return y;
	}

}