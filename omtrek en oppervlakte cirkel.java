import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);

        String voornaam;
        int leeftijdInJaren, gewichtInKg, lengteInCm;
        char eersteLetterVoornaam, laatsteLetterVoornaam;


        System.out.print("Voornaam: ");
        voornaam = toetsenbord.nextLine();
        System.out.print("Leeftijd (in jaren): ");
        leeftijdInJaren = Integer.parseInt(toetsenbord.nextLine());
        System.out.print("Gewicht (in kilogram): ");
        gewichtInKg = Integer.parseInt(toetsenbord.nextLine());
        System.out.print("Lengte (in cm): ");
        lengteInCm = Integer.parseInt(toetsenbord.nextLine());
        eersteLetterVoornaam = voornaam.trim().charAt(0);
        laatsteLetterVoornaam = voornaam.trim().charAt(voornaam.length() - 1);

        if (leeftijdInJaren >= 18 && leeftijdInJaren <= 80) {
            System.out.println("Je hebt een geschikte leeftijd (" + leeftijdInJaren + " jaar) " +
                    "om de Javatoren te beklimmen.");
            if ((leeftijdInJaren < lengteInCm / 2) && (leeftijdInJaren > gewichtInKg / 5)) {
                System.out.println("Je voldoet aan alle voorwaarden om op de Cork Screw te mogen.");
            } else if (((eersteLetterVoornaam >= 'A') && (eersteLetterVoornaam <= 'Z')) &&
                    ((laatsteLetterVoornaam >= 'a') && (laatsteLetterVoornaam <= 'z'))
                    && (Character.toUpperCase(eersteLetterVoornaam)
                    == Character.toUpperCase(laatsteLetterVoornaam))) {
                System.out.println("Je voornaam begint en eindigt met een "
                        + voornaam.trim().toUpperCase().charAt(0) +
                        ". Daarom mag je plaatsnemen in de Nameride.");
            } else {
                System.out.println("Je mag weliswaar niet in de Cork Screw en de Nameride, " +
                        "maar er zijn nog heel wat andere leuke attracties.");
            }
        } else {
            System.out.println("Je bent " + leeftijdInJaren +
                    " jaar oud. Je hebt een geschikte leeftijd om een spaghetti te eten in ons restaurant.");
            if ((Character.toUpperCase(eersteLetterVoornaam) == 'P') && (voornaam.trim().length() >= 5)) {
                System.out.println("Je voornaam begint met een P en is "
                        + voornaam.trim().length() + " karakters lang. " +
                        "Daarom mag je een pizza eten in ons restaurant.");
            }
        }
    }
}
