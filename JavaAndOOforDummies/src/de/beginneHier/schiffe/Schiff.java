package de.beginneHier.schiffe;

/**
 * Was soll denn das?? Was bitte schön ist ein interface??<br>
 * <br>
 * Von einem Schiff wissen wir, dass es gewisse Eigenschaften hat. In einem
 * Interface können wir nun beliebige Methoden definieren, welche später für
 * jedes je gebaute Schiff auch vorhanden sein werden.
 */
public interface Schiff {

	/**
	 * Abfragemethoden für Eigenschaften (Felder oder Instanzvariablen) einer
	 * Klasse werden getter genannt. Der Name der Methode wiederum wird
	 * standardmässig so gebildet:<br>
	 * "get"+nameDesFeldes<br>
	 * bzw. für Wahrheitswerte (boolean):<br>
	 * "is"+nameDesFeldes [z.B. isValid]
	 * 
	 * @return einen String, der die Farbe des Schiffs enthält
	 */
	public String getFarbe();
	// Wie du siehst, fehlt dieser Methode der Body. Das ist in diesem Fall aber
	// sehr gut. So ist nämlich definiert, dass ein spezielles Schiff (z.B. ein
	// Motorschiff) diese Methode implementieren MUSS, d.h. einen Body dazu zur
	// Verfügung stellen muss.
}
