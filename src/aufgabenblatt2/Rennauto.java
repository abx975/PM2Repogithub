package src.aufgabenblatt2;

import java.io.PrintStream;

/**
 * @author Eduard veit, Nils Eggebrecht
 *
 */
public class Rennauto extends Thread implements Comparable<Rennauto> {

	private double vMeterProSekunde;
	private double streckeMeter;
	private int wagennummer;
	private double renndauerSekunden = 0;

	/**
	 * Konstruktor zum erstellen von Rennautos
	 */
	public Rennauto(int wagennummer) {
		this(1, 10, wagennummer);
	}

	/**
	 * 
	 * Initalisiert ein Rennauto.
	 * 
	 * @param geschwindigkeit
	 * @param streckenlaenge
	 * @param wagennummer
	 */
	public Rennauto(double geschwindigkeit, double streckenlaenge, int wagennummer) {
		this.vMeterProSekunde = geschwindigkeit;
		this.streckeMeter = streckenlaenge;
		this.wagennummer = wagennummer;
	}

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		for (double i = 0; i < streckeMeter; i = i + vMeterProSekunde) {
			try {
				Thread.sleep(800 + (int) (Math.random() * 400));
				System.out.printf("Wagen " + wagennummer + ": %.1f / %.1f \n", i, streckeMeter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		renndauerSekunden = (((double) (System.currentTimeMillis() - start)) / 1000);
	}

	public double getRenndauerSekunden() {
		return renndauerSekunden;
	}

	public int getWagennummer() {
		return wagennummer;
	}

	/**
	 * 
	 * Vergleicht zwei Rennautos nach der gefahrenen Zeit
	 */
	@Override
	public int compareTo(Rennauto other) {
		if (getRenndauerSekunden() > other.getRenndauerSekunden()) {
			return 1;
		} else if (getRenndauerSekunden() < other.getRenndauerSekunden()) {
			return -1;
		} else {
			return 0;
		}
	}
/**
 * Gibt ein Rennauto auf der Konsole aus.
 * @return String
 */
	public PrintStream toPrintStream() {

		return System.out.printf("Wagen " + wagennummer + ": %.1f Sekunden \n", renndauerSekunden);
	}

}
