import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        int najmniejsza;
        int najwieksza;

        Scanner wejscie = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        x1 = wejscie.nextInt();
        System.out.print("Podaj drugą liczbę całkowitą: ");
        x2 = wejscie.nextInt();
        System.out.print("Podaj trzecią liczbę całkowitą: ");
        x3 = wejscie.nextInt();

        if (x1 < x2){ // Poniższe warunki wybierają najmniejszą i największą wartość z pośród x1,x2 i x3
            najmniejsza = x1;
            if (x3 < x1){
                najmniejsza=x3;
            }
            najwieksza = x2;
            if (x3 > x2){
                najwieksza = x3;
            }
        } else {
            najmniejsza = x2;
            if (x3 < x2){
                najmniejsza = x3;
            }
            najwieksza = x1;
            if (x3 > x1){
                najwieksza = x3;
            }
        }
        System.out.println("Najmniejsza liczba to: "+najmniejsza);
        System.out.println("Największa liczba to: "+najwieksza);

    }
}
