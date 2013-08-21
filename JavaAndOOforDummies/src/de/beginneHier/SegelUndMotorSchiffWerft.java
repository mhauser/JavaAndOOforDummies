package de.beginneHier;

import de.beginneHier.schiffe.MotorBoot;
import de.beginneHier.schiffe.Schiff;
import de.beginneHier.schiffe.SegelSchiff;
import de.beginneHier.werft.Werft;

public class SegelUndMotorSchiffWerft implements Werft {

	@Override
	public Schiff baueSchiff(int geld) {
		if (geld < 100) {
			return new MotorBoot();
		} else {
			return new SegelSchiff("gelb");
		}

		// Sowohl MotorBoot als auch SegelSchiff implementieren das interface
		// Schiff, weshalb beide return statements funktionieren (die Methode
		// verlangt ja ein Schiff).
	}

}
