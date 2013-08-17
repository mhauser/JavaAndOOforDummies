package de.beginneHier;

import de.beginneHier.schiffe.Schiff;
import de.beginneHier.werft.StandardWerft;
import de.beginneHier.werft.Werft;

/**
 * Herzlich willkommen zu dieser kleinen Einf�hrung zum Thema Java und
 * Objektorientieres Programmieren (OO)! <br>
 * <br>
 * Ein kleiner Tipp und eine Anmerkung gleich zu Beginn: ein sehr
 * empfehlenswertes Buch zu diesem Thema findest du auf
 * http://openbook.galileocomputing.de/javainsel<br>
 * Ein paar S�tze k�nnen von dort kopiert sein, weshalb ich dieses Buch hiermit
 * ein f�r alle Mal als Quelle referenziere und im Folgenden darauf verzichten
 * werde ;) <br>
 * <br>
 * Was hier steht ist ein sogenannter Javadoc Kommentar. Falls du mit Eclipse
 * arbeitest, kann ein solcher ganz einfach erstellt werden: Die Klasse oder die
 * Methode (Zwischenbemerkung f�r diejenigen, die schon mal in einer anderen
 * Sprache programmiert haben: in Java heissen Funktionen Methoden, sind aber
 * mehr oder weniger das selbe) anw�hlen und Alt-Shift-J dr�cken. F�hrst du dann
 * mit der Maus �ber die Klasse oder Methode, erscheint dieser Text hier in
 * einem kleinen Feld. Das ist oft sehr n�tzlich, wenn du Klassen oder Methoden
 * brauchst, welche dir eine Library (z.B. was von Java mitgeliefert wird, oder
 * Drittcode) zur Verf�gung steht. Meistens stehen dort wertvolle Informationen
 * zum Umgang damit. <br>
 * <br>
 * �brigens: ich werde hier sehr viel in Kommentaren beschreiben, was ein
 * gewisser Codeteil genau macht. Das ist eigentlich schlecht :D ein guter
 * Programmierer schreibt Code, der solche Kommentare nicht braucht. Kommentare
 * sollten h�chstens erkl�ren, WARUM etwas genau so gemacht wurde, und nicht
 * WIE. Solle ein erkl�rendes WIE n�tig sein, sollte eher der Code �berarbeitet
 * werden, so dass der Kommentar �berfl�ssig wird! Das erh�ht die Les- und
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
	 * ausf�hrbarer Code ist. Das kann bisweilen m�hsam sein, aber man gew�hnt
	 * sich dran. <br>
	 * <br>
	 * Hier sehen wir die erste Methode, welche von der Java Virtual Machine
	 * (JVM) aufgerufen wird, wenn das Programm startet. <br>
	 * <br>
	 * Eine class besteht aus Methoden und Feldern, Methoden wiederum aus einem
	 * keyword, welches die Sichtbarkeit angibt (hier public), einem
	 * R�ckgabewert, einem Namen, Methodenargumenten (0..*) und dem Body.
	 * 
	 * @param args
	 *            der Name der Argumente kann frei gew�hlt werden, beim main hat
	 *            sich 'args' einfach eingeb�rgert. args bezeichnet hier ein
	 *            Array von Strings, welches die Argumente enth�lt, die beim
	 *            Aufruf von der Konsole mitgegeben wurden (also ohne den
	 *            Programmnamen wie bei C/C++).
	 */
	public static void main(String[] args) {
		// nach diesen Klammern beginnt der Body. Hier kommt der ausf�hrbare
		// Code dieser Methode hin. Was du hier liest ist aber immer noch ein
		// Kommentar. =)

		// F�r das bessere Verst�ndnis von OO wollen wir Schiffe bauen. Schau
		// dir dazu jetzt das File Schiff.java an. In eclipse kannst du den
		// Cursor auf ein St�ck Code setzen und mit F3 zu dessen Deklaration
		// springen

		// Vielleicht ist dir ganz oben in diesem File die Zeile
		// "import de.beginneHier.schiffe.Schiff;" aufgefallen. Diese ist n�tig,
		// damit wir hier ein Schiff haben k�nnen, da sich dieses File in einem
		// anderen Package (Ordner) befindet.
		Schiff meinSchiff;

		// Diese Codezeile ist erst eine sogenannte Deklaration eines Schiffes.
		// D.h. wir haben noch nicht wirklich eines gebaut. Daf�r wollen wir nun
		// eine Werft erstellen.

		Werft werft = new StandardWerft();
		// mit "= new StandardWerft();" wird sozusagen eine neue Werft gebaut.
		// Es ist NICHT m�glich "= new Werft();" zu schreiben, da Werft ja "nur"
		// ein interface ist und somit auch nur die Definitionen liefert, aber
		// f�r sich alleine stehend nichts macht.

		// Schau dir die Klasse StandardWerft an und komm dann hier her
		// zur�ck..

		// Jetzt k�nnen wir uns endlich ein Schiff bauen! Und das mit nur 12
		// Geld...
		meinSchiff = werft.baueSchiff(12);

		// Uns k�nnte nun interessieren, welche Farbe unser neues Schiff hat
		System.out.println(meinSchiff.getFarbe());
		// das "System.out.println()" gibt einen beliebigen String auf der
		// Konsole aus. In unserem Fall "rot"
	}

}
