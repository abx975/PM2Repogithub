package aufgabenblatt2;

import java.util.HashMap;

import java.util.function.BinaryOperator;
import aufgabenblatt2.Operation;

/**
 * Diese Klasse implementiert die vier Rechenarten.
 * 
 * @author Nils Eggebrecht, Eduard Veit
 * @version 1.0
 */
public class Rechner {

	private HashMap<Operation, BinaryOperator<Double>> operMap;

	/**
	 * Der Konstructor beinhaltet die 4 Rechenoperationen
	 */
	public Rechner() {
		operMap = new HashMap<Operation, BinaryOperator<Double>>();
		operMap.put(Operation.ADDIERE, (x, y) -> x + y);
		operMap.put(Operation.SUBTRAHIERE, (x, y) -> x - y);
		operMap.put(Operation.MULTIPLIZIERE, (x, y) -> x * y);
		operMap.put(Operation.DIVIDIERE, (x, y) -> x / y);
	}

	/**
	 * 
	 * Die Methode fuehrt die Rechnung aus.
	 * 
	 * @param oper
	 * @param zahl1
	 * @param zahl2
	 * @return Ergebnis der Rechenoperation.
	 */
	public double berechne(Operation oper, double zahl1, double zahl2) throws IllegalArgumentException {
		double epsilion = 0.0001;
		double epsilion1 = 0.0001;

		if ((Math.abs(0.0 + zahl2) < epsilion) && (Math.abs(0.0 - zahl2) < epsilion1)) {
			throw new ArithmeticException();
		} else {
			return operMap.get(oper).apply(zahl1, zahl2);
		}		
	}
}
