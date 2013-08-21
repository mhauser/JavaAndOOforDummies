package de.beginneHier.schiffe;

/**
 * Was soll denn das?? Was bitte sch�n ist ein interface??<br>
 * <br>
 * Von einem Schiff wissen wir, dass es gewisse Eigenschaften hat. In einem
 * Interface k�nnen wir nun beliebige Methoden definieren, welche sp�ter f�r
 * jedes je gebaute Schiff auch vorhanden sein werden.
 */
public interface Schiff {

	/**
	 * Abfragemethoden f�r Eigenschaften (Felder oder Instanzvariablen) einer
	 * Klasse werden getter genannt. Der Name der Methode wiederum wird
	 * standardm�ssig so gebildet:<br>
	 * "get"+nameDesFeldes<br>
	 * bzw. f�r Wahrheitswerte (boolean):<br>
	 * "is"+nameDesFeldes [z.B. isValid]
	 * 
	 * @return einen String, der die Farbe des Schiffs enth�lt
	 */
	public String getFarbe();
	// Wie du siehst, fehlt dieser Methode der Body. Das ist in diesem Fall aber
	// sehr gut. So ist n�mlich definiert, dass ein spezielles Schiff (z.B. ein
	// Motorschiff) diese Methode implementieren MUSS, d.h. einen Body dazu zur
	// Verf�gung stellen muss.
}
