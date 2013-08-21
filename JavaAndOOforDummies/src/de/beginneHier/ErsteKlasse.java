package de.beginneHier;

import de.beginneHier.schiffe.Schiff;
import de.beginneHier.werft.StandardWerft;
import de.beginneHier.werft.Werft;

/**
 * Herzlich willkommen zu dieser kleinen Einführung zum Thema Java und
 * Objektorientieres Programmieren (OO)! <br>
 * <br>
 * Ein kleiner Tipp und eine Anmerkung gleich zu Beginn: ein sehr
 * empfehlenswertes Buch zu diesem Thema findest du auf
 * http://openbook.galileocomputing.de/javainsel<br>
 * Ein paar Sätze können von dort kopiert sein, weshalb ich dieses Buch hiermit
 * ein für alle Mal als Quelle referenziere und im Folgenden darauf verzichten
 * werde ;) <br>
 * <br>
 * Was hier steht ist ein sogenannter Javadoc Kommentar. Falls du mit Eclipse
 * arbeitest, kann ein solcher ganz einfach erstellt werden: Die Klasse oder die
 * Methode (Zwischenbemerkung für diejenigen, die schon mal in einer anderen
 * Sprache programmiert haben: in Java heissen Funktionen Methoden, sind aber
 * mehr oder weniger das selbe) anwählen und Alt-Shift-J drücken. Fährst du dann
 * mit der Maus über die Klasse oder Methode, erscheint dieser Text hier in
 * einem kleinen Feld. Das ist oft sehr nützlich, wenn du Klassen oder Methoden
 * brauchst, welche dir eine Library (z.B. was von Java mitgeliefert wird, oder
 * Drittcode) zur Verfügung steht. Meistens stehen dort wertvolle Informationen
 * zum Umgang damit. <br>
 * <br>
 * Übrigens: ich werde hier sehr viel in Kommentaren beschreiben, was ein
 * gewisser Codeteil genau macht. Das ist eigentlich schlecht :D ein guter
 * Programmierer schreibt Code, der solche Kommentare nicht braucht. Kommentare
 * sollten höchstens erklären, WARUM etwas genau so gemacht wurde, und nicht
 * WIE. Solle ein erklärendes WIE nötig sein, sollte eher der Code überarbeitet
 * werden, so dass der Kommentar überflüssig wird! Das erhöht die Les- und
 * Wartbarkeit des Codes.<br>
 * <br>
 * So, aber jetzt legen wir mal los...
 * 
 * @author Matthias
 * @version 0.1
 */
public class ErsteKlasse {

	/**
	 * Aufgrund der strikten Objektorientierung von Java muss ALLES in einer
	 * Klasse (fortan class genannt, weils auch so heisst) stehen, was
	 * ausführbarer Code ist. Das kann bisweilen mühsam sein, aber man gewöhnt
	 * sich dran. <br>
	 * <br>
	 * Hier sehen wir die erste Methode, welche von der Java Virtual Machine
	 * (JVM) aufgerufen wird, wenn das Programm startet. <br>
	 * <br>
	 * Eine class besteht aus Methoden und Feldern, Methoden wiederum aus einem
	 * keyword, welches die Sichtbarkeit angibt (hier public), einem
	 * Rückgabewert, einem Namen, Methodenargumenten (0..*) und dem Body.
	 * 
	 * @param args
	 *            der Name der Argumente kann frei gewählt werden, beim main hat
	 *            sich 'args' einfach eingebürgert. args bezeichnet hier ein
	 *            Array von Strings, welches die Argumente enthält, die beim
	 *            Aufruf von der Konsole mitgegeben wurden (also ohne den
	 *            Programmnamen wie bei C/C++).
	 */
	public static void main(String[] args) {
		// nach diesen Klammern beginnt der Body. Hier kommt der ausführbare
		// Code dieser Methode hin. Was du hier liest ist aber immer noch ein
		// Kommentar. =)

		// Für das bessere Verständnis von OO wollen wir Schiffe bauen. Schau
		// dir dazu jetzt das File Schiff.java an. In eclipse kannst du den
		// Cursor auf ein Stück Code setzen und mit F3 zu dessen Deklaration
		// springen

		// Vielleicht ist dir ganz oben in diesem File die Zeile
		// "import de.beginneHier.schiffe.Schiff;" aufgefallen. Diese ist nötig,
		// damit wir hier ein Schiff haben können, da sich dieses File in einem
		// anderen Package (Ordner) befindet.
		Schiff meinSchiff;

		// Diese Codezeile ist erst eine sogenannte Deklaration eines Schiffes.
		// D.h. wir haben noch nicht wirklich eines gebaut. Dafür wollen wir nun
		// eine Werft erstellen.

		Werft werft = new StandardWerft();
		// mit "= new StandardWerft();" wird sozusagen eine neue Werft gebaut.
		// Es ist NICHT möglich "= new Werft();" zu schreiben, da Werft ja "nur"
		// ein interface ist und somit auch nur die Definitionen liefert, aber
		// für sich alleine stehend nichts macht.

		// Schau dir die Klasse StandardWerft an und komm dann hier her
		// zurück..

		// Jetzt können wir uns endlich ein Schiff bauen! Und das mit nur 150
		// Geld...
		meinSchiff = werft.baueSchiff(150);
		// Zur Erinnerung: Das interface Werft versichert uns, dass mit der
		// StandartWerft auch wirklich ein Schiff gebaut werden kann, d.h. dass
		// die Methode "baueSchiff(int geld)" auch wirklich existiert.

		// Uns könnte nun interessieren, welche Farbe unser neues Schiff hat
		System.out.println("Mein erstes Schiff hat die Farbe "
				+ meinSchiff.getFarbe());
		// das "System.out.println(String s)" gibt einen beliebigen String auf
		// der Konsole aus. In unserem Fall
		// "Mein erstes Schiff hat die Farbe rot"

		// Jetzt wollen wir eine etwas ausgereiftere Werft. Da bekommt man auch
		// noch Segelschiffe, welche ja bekanntlich teurer sind als Motorboote.
		// Dafür erstellen wir jetzt noch eine Klasse Segelschiff. Schau sie dir
		// an...

		// Und jetzt bauen wir unsere neue Werft
		Werft ausgereiftereWerft = new SegelUndMotorSchiffWerft();

		// Wir haben noch etwas geld und bauen uns ein Schiff..
		Schiff meinZweitesSchiff = ausgereiftereWerft.baueSchiff(180);

		// Nach diesem Schiff bleibt nicht mehr so viel Geld übrig..
		Schiff meinDrittesSchiff = ausgereiftereWerft.baueSchiff(50);

		// Die folgenden Ausgaben sollten nun nicht mehr erstaunen (hoffe ich):
		System.out.println("Mein zweites Schiff hat die Farbe "
				+ meinZweitesSchiff.getFarbe()); // grün
		System.out.println("Mein drittes Schiff hat die Farbe "
				+ meinDrittesSchiff.getFarbe()); // rot

		// Was wir hier erarbeitet haben ist ein kleines Beispiel des
		// sogenannten Factory method pattern.
		// Zitat Wikipedia:
		// "Entwurfsmuster (englisch design patterns) sind
		// bewährte Lösungsschablonen für wiederkehrende Entwurfsprobleme sowohl
		// in der Architektur als auch in der Softwarearchitektur und
		// -entwicklung."
		// Die meisten Patterns werden erst in einer objektorientierten Sprache
		// möglich und bilden, meiner Meinung nach, den Hauptvorteil einer
		// ebensolchen.
	}

}
