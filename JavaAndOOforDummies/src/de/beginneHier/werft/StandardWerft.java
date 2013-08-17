package de.beginneHier.werft;

import de.beginneHier.schiffe.MotorBoot;
import de.beginneHier.schiffe.Schiff;

/**
 * Hier haben wir nun eine Standard Werft. Um "gegen Aussen" bekannt zu geben,
 * dass es sich hierbei um nichts anderes als eine {@link Werft} handelt,
 * benutzen wir das keyword implements. Damit verpflichten wir uns sogleich
 * auch, die im interface definierte Methode zu implementieren.
 */
public class StandardWerft implements Werft {

	// dieses @Override dient v.a. der Lesbarkeit des Codes. Es sagt aus, dass
	// diese Methode vom Interface Werft stammt
	@Override
	public Schiff baueSchiff(int geld) {

		// Da dies eine Standard Werft ist, kann sie nur Motorboote bauen. Wie
		// viel Geld für das Schiff bezahlt wird, ist uns momentan noch egal.

		// Der Methodenkopf verlangt von uns einen Rückgabewert des Typs Schiff.
		// Weil aber Motorboot gegen Aussen bekannt gibt, dass es sich dabei um
		// ein Schiff handelt können wir hier getrost ein neues Motorboot bauen
		// und dieses dem Methodenaufrufer "zurückgeben" (return ...)
		return new MotorBoot();
	}

}
