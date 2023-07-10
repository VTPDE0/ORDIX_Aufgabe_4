public class main {
    public static void main(String[] args) {
        Einkaufsliste einkaufsliste = new Einkaufsliste(); // Erstellen eines Objekts der Klasse Einkaufsliste

        // Beispielaufrufe der verschiedenen Methoden
        einkaufsliste.hinzufuegen_produkt_zur_einkaufsliste("Apfel");
        einkaufsliste.hinzufuegen_produkt_zur_einkaufsliste("Banane");
        einkaufsliste.hinzufuegen_produkt_zur_einkaufsliste("Milch");
        einkaufsliste.einkaufsliste_anzeigen();
        System.out.println("Anzahl der Produkte: " + einkaufsliste.anzahl_produkte_in_einkaufsliste());
        System.out.println("Aktueller Einkaufspreis: " + einkaufsliste.berechnen_aktueller_einkaufspreis());

        einkaufsliste.entfernen_produkt_aus_der_einkaufsliste("Apfel");
        einkaufsliste.hinzufuegen_produkt_zur_einkaufsliste("Brot");
        einkaufsliste.hinzufuegen_produkt_zur_einkaufsliste("Eier");
        einkaufsliste.einkaufsliste_anzeigen();
        System.out.println("Anzahl der Produkte: " + einkaufsliste.anzahl_produkte_in_einkaufsliste());
        System.out.println("Aktueller Einkaufspreis: " + einkaufsliste.berechnen_aktueller_einkaufspreis());
    }
}