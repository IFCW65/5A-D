import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);
        String code, resultaat = "";
        int teller =0;
        char karakter;

        System.out.print("geef een code: ");// is je print voor de tekst//
        code = toetsenbord.nextLine();
        while (teller < code.length()){//checkt de lengte van het woord//
            karakter = code.charAt(teller);//gaat naar de letter dat de teller opzit//
            karakter--;//doet dat karakter 1 karakter minder op de ascii tabel//
            resultaat += karakter; //steekt het karakter dat veranderd is op de plaats van het oud karakter//
            teller++;// telt +1 bij de teller//
        }
        System.out.println("nieuwe code: " + resultaat);// geeft je resultaat
    }
}