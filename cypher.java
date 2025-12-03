import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);
        String woord;
        int teller = 0;
        char karakter;
        int key;
        String cypher = "";

        System.out.print("Geef een woord: ");
        woord = toetsenbord.nextLine();
        System.out.print("Geef de key: ");
        key = Integer.parseInt(toetsenbord.nextLine());

        while (teller < woord.length()) {
            karakter = woord.charAt(teller);
            karakter += key;
            cypher += karakter;
            teller++;
        }
        System.out.println("Cypher: " + cypher);
    }
}
