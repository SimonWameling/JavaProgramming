/** 
 * @author Simon Wameling
 * @version openjdk version "17.0.10" 2024-01-16
 */

public class BerechnungImRechtwinkligenDreieck{
    public static void main(String[] args){
        /* Deklaration der Variablen */
        double a;
        double b;
        double flaeche;
        double hoehe;

        /* Eingabe */
        EinAusgabe.schreibeBegruessung();
        a = EinAusgabe.eingabeKommazahl("Gib die Kathete a ein! "); 
        b = EinAusgabe.eingabeKommazahl("Gib die Kathete b ein! "); 

        /* Berechnung */
        flaeche = Dreieck.flaeche(a, b); 
        hoehe = Dreieck.hoehe(a, b); 

        /* Ausgabe */
        System.out.println(String.format("Die Flaeche ist: %.3f", flaeche));
        System.out.println(String.format("Die Hoehe ist: %.3f", hoehe));
        
        /* Test der Methode Dreieck.istGleichseitig()
        double c = a;
        if(Dreieck.istGleichseitig(a, b, c)){
            System.out.println("Juhu!");
        }
        */
    }
}
