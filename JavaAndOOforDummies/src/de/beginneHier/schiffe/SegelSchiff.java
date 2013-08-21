package de.beginneHier.schiffe;

public class SegelSchiff implements Schiff {

	// das keyword private hat übrigens folgende (wichtige) Bedeutung:
	//
	// encapsulation oder information hiding ist ein wichtiges Konzept der
	// Programmierung. In unserem Fall hier wollen wir die Farbe nur innerhalb
	// dieser Klasse verändern können. Ausschliesslich das Abfragen (mithilfe
	// der getFarbe Methode) soll von aussen zugänglich sein! Aus diesem Grund
	// ist jene Methode auch public.
	private String meineFarbe;

	// Dies ist eine spezielle Methode. Nämlich ein sogenannter constructor. Wie
	// du siehst fehlt der Methodenname, der Rückgabewert (naja, auch nicht
	// wirklich, denn es fehlt ja ein return statement...) entspricht jedoch dem
	// Klassennamen.

	// Dieser constructor wird bei jedem
	// new Segelschiff("eine Farbe");
	// aufgerufen und sorgt dafür, dass eine neue Instanz (also quasi ein
	// Exemplar) dieser Klasse geschaffen wird.

	// Jede Klasse besitzt übrigens mindesten einen constructor. Wenn nicht
	// explizit einer angegeben wird, wird automatisch ein default constructor
	// verwendet.
	public SegelSchiff(String farbe) {

		// hier erfolgt die Zuweisung des Parameters "farbe" an die
		// Instanzvariable "meineFarbe"
		meineFarbe = farbe;
	}

	@Override
	public String getFarbe() {
		return meineFarbe;
	}

}
