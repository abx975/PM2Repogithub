package aufgabenblatt2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringArray {

	/**
	 * Array von Woertern
	 */
	private String[] woerter = new String[200];

	{
		woerter[0] = "Eingabe ";
		woerter[1] = "Äußeres ";
		woerter[2] = null;
		woerter[3] = "Strassen-Feger";
		woerter[4] = " ein Haus";
	}

	/**
	 * Liste von Woertern
	 */

	List<String> woerterliste = Arrays.asList(woerter);

	/**
	 * Stream erstellen von Liste von Woertern
	 */
	Stream<String> woerterStream = woerterliste.stream();
	
	
	Stream<String> woerterStreamAusgemustert = woerterStream
			// Entfernen von null- Eingaben
			.filter(string->string != null)
			// Kürzen des Strings auff maximal 8 Zeichen
			.filter(string->string.length() <= 8)
			// Konvertierung von Klein- zu Großbuchstaben
			.map(String::toUpperCase)
			// Ersetzen Ä→AE, Ö→OE, Ü→UE, ß→SS 
			.map(string->string.replace("Ä", "AE"))
			.map(string->string.replace("Ö", "OE"))
			.map(string->string.replace("Ü", "UE"))
			.map(string->string.replace("ß", "SS"));
	
	
	
}