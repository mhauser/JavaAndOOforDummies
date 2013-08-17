package de.beginneHier.werft;

import de.beginneHier.schiffe.Schiff;

/**
 * Auch hier erstellen wir zuerst wieder ein Interface. Es wird später noch
 * etwas klarer, weshalb.
 */
public interface Werft {

	/**
	 * @param geld
	 *            Ein Schiff zu bauen ist natürlich nicht gratis. Deshalb haben
	 *            wir hier einen Parameter vom Typ einer Ganzzahl (int)
	 * @return Der Rückgabewert ist, wie erwartet, ein Schiff
	 */
	public Schiff baueSchiff(int geld);
}
