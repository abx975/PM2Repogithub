package aufgabenblatt2;

import java.util.HashMap;

import java.util.function.BinaryOperator;
import aufgabenblatt2.Operation;

public class Rechner {

	private HashMap<Operation, BinaryOperator<Double>> operMap;
			
			
	public Rechner(){
		operMap = new HashMap<Operation, BinaryOperator<Double>>();
		operMap.put(Operation.ADDIERE, (x, y) -> x + y);
		operMap.put(Operation.SUBTRAHIERE, (x, y) -> x - y);
		operMap.put(Operation.MULTIPLIZIERE, (x, y) -> x * y);
		operMap.put(Operation.DIVIDIERE, (x, y) -> x / y);
	}

	public double berechne(Operation oper, double zahl1, double zahl2) {
		return operMap.get(oper).apply(zahl1, zahl2);
	}
}
