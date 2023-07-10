import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Einkaufsliste {
    private Set<String> einkaufsliste_HashSet; // Das Set, das die Produkte auf der Einkaufsliste enthält
    //Ein Set ist eine Datenstruktur (Andere Datenstrukturen: z.B. Arrays und Listen usw.), die eine Sammlung von eindeutigen Elementen speichert.
    //!!!!  !!!!
    // Es erlaubt keine Duplikate. Die Elemente in einem Set sind in der Regel nicht geordnet.
    //!!!!  !!!!
    private Map<String, Double> produkte_HashMap; // Die Map, die die verfügbaren Produkte und ihre Preise enthält
    //!!!!  !!!!
    //Eine Map ist eine Datenstruktur, die eine Sammlung von Schlüssel-Wert-Paaren speichert. (wie Wörterbuch)
    //!!!!  !!!!
    // jeder Schlüssel in der Map ist eindeutig und wird mit einem entsprechenden Wert verknüpft.
    // Maps ermöglichen effizienten Zugriff auf Werte anhand des Schlüssels.

    public Einkaufsliste() { //Konstruktor
        einkaufsliste_HashSet = new HashSet<>(); // Initialisierung des Einkaufslisten-Sets
        produkte_HashMap = new HashMap<>(); // Initialisierung der Produkt-Map

        // Hinzufügen der vordefinierten Produkte und ihrer Preise zur Produkt-Map (Hashmap)
        // durch Aufrufen der put()-Methode wird ein Schlüssel-Wert-Paar zur Map hinzugefügt. (Also Zwei Variablen sofort)
        produkte_HashMap.put("Apfel", 0.5);
        produkte_HashMap.put("Banane", 0.3);
        produkte_HashMap.put("Milch", 1.2);
        produkte_HashMap.put("Brot", 2.0);
        produkte_HashMap.put("Eier", 1.5);
    }

    // Methode zum Hinzufügen eines Produkts zur Einkaufsliste einkaufsliste_HashSet
    public void hinzufuegen_produkt_zur_einkaufsliste(String produkt) {
        if (produkte_HashMap.containsKey(produkt)) { // containsKey überprüfe, ob das Produkt in der Map der verfügbaren Produkte vorhanden ist (Wird nur Name überprüft, Preis muss nicht geprüft sein)
            //add(element)
            //Adds the specified element to this set if it is not already present
            einkaufsliste_HashSet.add(produkt); // Hinzufügen des Produkts zur Einkaufsliste
            System.out.println(produkt + " wurde zur Einkaufsliste hinzugefügt.");
        } else {
            System.out.println(produkt + " ist nicht verfügbar."); //Wird ausgegeben, wenn Produkt ist nicht in Map
        }
    }

    // Methode zum Entfernen eines Produkts von der Einkaufsliste (funktioniert gleich wie add aber hier wird remove genutzt)
    public void entfernen_produkt_aus_der_einkaufsliste(String produkt) {
        if (einkaufsliste_HashSet.contains(produkt)) { // Überprüfen, ob das Produkt in der Einkaufsliste vorhanden ist
            //remove(object)
            //Removes the specified element from this set if it is present.
            einkaufsliste_HashSet.remove(produkt); // Entfernen des Produkts von der Einkaufsliste
            System.out.println(produkt + " wurde von der Einkaufsliste entfernt.");
        } else {
            System.out.println(produkt + " ist nicht auf der Einkaufsliste.");
        }
    }

    // Methode zur Rückgabe der Anzahl der Produkte auf der Einkaufsliste
    public int anzahl_produkte_in_einkaufsliste() {
        return einkaufsliste_HashSet.size();
    }

    // Methode zur Anzeige aller Produkte auf der Einkaufsliste zusammen mit ihren Preisen
    public void einkaufsliste_anzeigen() {
        System.out.println("Einkaufsliste:");
        for (String produkt : einkaufsliste_HashSet) {
            double preis = produkte_HashMap.get(produkt);
            // Wenn produkte_HashMap.get(produkt) aufgerufen wird, sucht die HashMap nach dem angegebenen Schlüssel (produkt) und
            // gibt den dazugehörigen Wert (also den Preis) zurück
            //so wird auch get(produkt) in berechnen_aktueller_einkaufspreis funktionieren
            System.out.println(produkt + " - Preis: " + preis);
        }
    }

    // Methode zur Berechnung und Rückgabe des aktuellen Einkaufspreises aller Produkte im Einkaufswagen
    public double berechnen_aktueller_einkaufspreis() {
        double gesamtpreis = 0.0; // Initialisierung des Gesamtpreises mit Startwert 0.0

        // Iteriere über jedes Produkt in der Einkaufsliste
        for (String produkt : einkaufsliste_HashSet) {
            double preis = produkte_HashMap.get(produkt); // Hole Preis des aktuellen Produkts aus der HashMap produkte_HashMap
            gesamtpreis += preis; // Addiere Preis des aktuellen Produkts zum Gesamtpreis
        }

        return gesamtpreis; // Gib den kumulativen Gesamtpreis als Ergebnis zurück
    }

}