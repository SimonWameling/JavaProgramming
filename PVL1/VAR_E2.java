/**
 * @author Simon Wameling
 * @version openjdk version "17.0.10" 2024-01-16
 */

import java.util.Scanner;

import javax.swing.JLabel;

public class VAR_E2 {
    public static void main(String[] args)
    {
        /* Festlegen von Pi und den Variablen */
        final double pi = 3.141592;
        double radius = 1;
        double hoehe = 1;
        double durchmesser;
        double umfang; 
        double flaeche;
        double volumen; 
        double mantelflaeche; 
        double oberflaeche;
        int nachkommastellen = 1;

        /* Input */
        // Tastatureingabe initialisieren
        Scanner tastatur = new Scanner(System.in);
        // Try-catch zum Abfangen von Eingabefehlern
        try
        {
            System.out.println("Bitte gib den Radius ein: (z.B. 1,2)");
            radius = tastatur.nextDouble(); 
            System.out.println("Bitte gib die Hoehe ein: (z.B. 1,2)");
            hoehe = tastatur.nextDouble(); 
            System.out.println("Wie Nachkommastellen moechstest du ausgegeben bekommen? ");
            nachkommastellen = tastatur.nextInt();
            System.out.println();
            // Betrag von nachkommastellen, falls negative Zahl eingegeben wurde
            if(nachkommastellen<0)
            {
            nachkommastellen *= -1;
            }
        } catch (Exception e) 
        { 
            // Wenn Eingabe ungültig, Meldung ausgeben und beenden
            System.out.println("Fehler bei der Eingabe, bitte beachte die Formatierung!");
            System.exit(0);
        }
        // Tastatureingabe schließen
        tastatur.close();
        

        /* Berechnungen */
        // Kreis
        durchmesser = 2*radius;
        umfang = durchmesser*pi;
        flaeche = (radius*radius)*pi;
        // Zylinder
        volumen = flaeche*hoehe;
        mantelflaeche = umfang*hoehe;
        oberflaeche = 2*flaeche + mantelflaeche;
        
        /* Output */
        System.out.println(String.format("Hoehe: %." + nachkommastellen + "f", hoehe));
        System.out.println(String.format("Radius: %." + nachkommastellen + "f", radius));
        System.out.println(String.format("Durchmesser: %." + nachkommastellen + "f", durchmesser));
        System.out.println(String.format("Umfang: %." + nachkommastellen + "f", umfang));
        System.out.println(String.format("Flaeche: %." + nachkommastellen + "f", flaeche));
        System.out.println(String.format("Volumen: %." + nachkommastellen + "f", volumen));
        System.out.println(String.format("Mantelflaeche: %." + nachkommastellen + "f", mantelflaeche));
        System.out.println(String.format("Oberflaeche: %." + nachkommastellen + "f", oberflaeche));
    }
}
