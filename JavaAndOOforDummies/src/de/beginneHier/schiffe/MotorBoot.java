package de.beginneHier.schiffe;

public class MotorBoot implements Schiff {

	// wie wir alle wissen, sind Motorboote alle rot ;)
	private String meineFarbe = "rot";

	@Override
	public String getFarbe() {
		return meineFarbe;
	}

}
