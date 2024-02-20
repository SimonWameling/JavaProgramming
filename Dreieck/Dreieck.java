/**
 * Methoden fuer Berechnungen in rechtwinkligen Dreiecken
 */
public class Dreieck {
    /**
     * diese Methode berechnet die Laenge der Hypothenuse in einem
     * rechtwinkligen Dreieck aus den gegebenen Seitenlaengen 
     * 
     * @param a Laenge der Kathete a
     * @param b Laenge der Kathete b
     * @return Laenge der Hypothenuse
     */
    public static double hypothenuse(double a, double b) {
        double c;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

    /**
     * berechnet den Umfang eines Dreiecks mit den Seitenlaengen a, b und c
     * 
     * @param a erste Seite
     * @param b zweite Seite
     * @param c dritte Seite
     * @return Umfang des Dreiecks mit den Seitenlaengen a, b und c;
     *         wenn a, b und c kein Dreieck ergeben koennen, wird ihre Summe
     *         zurueckgeliefert
     */
    public static double umfang(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * berechnet den Umfang eines rechtwinkligen Dreiecks mit den Katheten a
     * und b
     * 
     * @param a erste Kathete
     * @param b zweite Kathete
     * @return Umfang des rechtwinkligen Dreiecks mit den Katheten a und b
     */
    public static double umfang(double a, double b) {
        double seiteC = Dreieck.hypothenuse(a, b);
        return Dreieck.umfang(a, b, seiteC);
    }

    /**
     * prueft, ob die drei Werte a, b und c die Seiten eines Dreiecks sein
     * koennen
     * 
     * @param a erste Seite
     * @param b zweite Seite
     * @param c dritte Seite
     * @return true, wenn die drei Zahlen Seiten eines Dreiecks sein koennen;
     *         false, wenn das nicht moeglich ist.
     */
    public static boolean istDreieckMoeglich(double a, double b, double c) {
        boolean ungleichung1 = a + b > c;
        boolean ungleichung2 = b + c > a;
        boolean ungleichung3 = a + c > b;
        boolean allePositiv = a > 0 && b > 0 && c > 0;
        return ungleichung1 && ungleichung2 && ungleichung3 && allePositiv;
    }

    /**
     * Rundet einen double-Wert auf eine bestimmte Nachkommastellenzahl und
     * gibt den gerundeten Wert zurueck.
     * 
     * @param wert,    der Wert, der gerundet werden soll
     * @param stellen, die Anzahl der gewuenschten Nachkommastellen
     * @return den gerundeten Wert
     */
    public static double rundeDouble(double wert, int stellen) {
        double x = Math.pow(10, stellen);
        return Math.round(wert * x) / x;
    }

    /**
     * testet, ob die drei uebergebenen Zahlen gemeinsam die Seitenlaengen
     * eine rechtwinkligen Dreiecks ergeben koennen
     * 
     * @param seiteA Kathete a
     * @param seiteB Kathete b
     * @param seiteC Hypothenuse
     * @return true, wenn seiteA, seiteB und seiteC ein rechtwinkliges Dreieck
     *         ergeben koennen
     */
    public static boolean istRechtwinklig(double seiteA, double seiteB,
            double seiteC) {
        double x = Dreieck.rundeDouble(Math.pow(seiteC, 2), 5);
        seiteA = Dreieck.rundeDouble(Math.pow(seiteA, 2), 5);
        seiteB = Dreieck.rundeDouble(Math.pow(seiteB, 2), 5);
        return seiteA + seiteB == x;
    }

    /**
     * prüft, ob die Seiten eines Dreiecks gleich sind
     * 
     * @param a erste Seite
     * @param b zweite Seite
     * @param c dritte Seite
     * @return true, wenn die drei Seiten gleich sind, ansonsten false
     */
    public static boolean istGleichseitig(double a, double b, double c){
        if(a==b){
            if(a==c){
                return true;
            }
        }
        return false;
    }
/**
 * berechnet die Flaeche des rechtwinkligen Dreiecks mit den Katheten a und b 
 * 
 * @param a Kathete a
 * @param b Kathete b
 * @return Flaeche des rechtwinkligen Dreiecks
 */
    public static double flaeche(double a, double b){
        return ((a*b)/2);
    }

/**
 * berechnet die Hoehe des rechtwinkligen Dreiecks mit den Katheten a und b
 * 
 * @param a Kathete a
 * @param b Kathete b 
 * @return Hoehe des rechtwinkligen Dreiecks
 */
    public static double hoehe(double a, double b){
        double c = hypothenuse(a, b);
        return ((a*b)/c);
    }
}
