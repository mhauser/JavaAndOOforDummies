package de.beginneHier.schiffe;

public class MotorBoot implements Schiff {

	// wie wir alle wissen, sind Motorboote alle rot ;)

	// weil sich dies auch nicht �ndern wird, k�nnen wir zus�tzlich das keyword
	// final setzen. Eine sp�tere �nderung wie "meineFarbe = "gr�n";
	// schl�gt somit fehl.
	private final String meineFarbe = "rot";

	@Override
	public String getFarbe() {
		return meineFarbe;
	}

}
