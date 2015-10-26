package aufgabenblatt1;

/**
 * Klasse die Prüft ob das erste Element eine zahl ist.
 * 
 * @author Nils Eggebrecht, Eduard Veit
 *
 */
public class ErstesElementPruefer {

	/**
	 * Prueft eine Liste, ob das erste Element eine Zahl ist.
	 * 
	 * @param liste, die geprueft wird.
	 * @return true, falls das erste Element in der Liste eine Zahl ist.
	 */

	public static <Typ extends Comparable<Typ>> boolean istErstesElementZahl(Liste<Typ> liste) {
		if (liste == null || liste.getAnzahlElemente() == 0) {
			return false;
		}
		return (liste.get(0) instanceof Number);
	}
}