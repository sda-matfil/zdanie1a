import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int najmniejsza;
        int najwieksza;
        int[] tablica = new int[3];

        Scanner wejscie = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        tablica[0] = wejscie.nextInt();
        System.out.print("Podaj drugą liczbę całkowitą: ");
        tablica[1] = wejscie.nextInt();
        System.out.print("Podaj trzecią liczbę całkowitą: ");
        tablica[2] = wejscie.nextInt();

        najmniejsza = najwieksza = tablica[0];

        for (int i=0 ; i<3 ; i++){
            if (najmniejsza > tablica[i]) najmniejsza = tablica[i];
            if (najwieksza < tablica[i]) najwieksza = tablica[i];
        }

        System.out.println("Najmniejsza liczba to: "+najmniejsza);
        System.out.println("Największa liczba to: "+najwieksza);

    }
}
