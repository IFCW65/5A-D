import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);
        int hoofdletter = 1, kleineLetters= 0, cijfers = 0, spaties = 1, teller = 0;
        char begin, einde;
        boolean beginLetter, leesteken;
        String zin, zinCopy = "";

        do {
            System.out.print("Geef een zin die begint met een hoofdletter en eindigt met een punt, vraagteken of uitroepteken: ");
            zin = toetsenbord.nextLine();
            begin = zin.charAt(0);
            einde = zin.charAt(zin.length() - 1);
            beginLetter = begin >= 'A' && begin <= 'Z';
            leesteken = einde == '?' ^ einde == '.' ^ einde == '!';
        } while (beginLetter != leesteken);
            while (teller < zin.length() - 1){
                if (zin.charAt(teller) >= 'A' && zin.charAt(teller) <= 'Z'){
                    hoofdletter = hoofdletter + 1;
                }else if(zin.charAt(teller) <= '9' && zin.charAt(teller) >= '0'){
                    cijfers++;
                }else if(zin.charAt(teller) == ' '){
                    spaties++;
                }else {
                    kleineLetters++;
                }
                teller++;
            }
            teller = 0;

        while(teller < zin.length()){
            if(zin.charAt(teller) <= '9' && zin.charAt(teller) >= '0'){
                zinCopy = zinCopy + '*';
            } else {
                zinCopy = zinCopy + zin.charAt(teller);
            }
            teller++;
        }

        System.out.println("Aantal hoofdletter: " + hoofdletter);
        System.out.println("Aantal kleine letters: " + kleineLetters);
        System.out.println("Aantal cijfers: " + cijfers);
        System.out.println("Aantal spaties: "+ spaties);
        System.out.println(zinCopy);

    }
}
