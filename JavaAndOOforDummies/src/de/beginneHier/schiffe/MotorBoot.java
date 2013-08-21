package de.beginneHier.schiffe;

public class MotorBoot implements Schiff {

	// wie wir alle wissen, sind Motorboote alle rot ;)

	// weil sich dies auch nicht ändern wird, können wir zusätzlich das keyword
	// final setzen. Eine spätere Änderung wie "meineFarbe = "grün";
	// schlägt somit fehl.
	private final String meineFarbe = "rot";

	@Override
	public String getFarbe() {
		return meineFarbe;
	}

}
