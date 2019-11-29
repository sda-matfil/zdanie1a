import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float waga;
        float wzrost;
        float BMI;
        Scanner wejscie = new Scanner (System.in);
        System.out.print("Podaj wagę w kg:  ");
        waga = wejscie.nextFloat();
        System.out.print("Podaj wzrost w cm:  ");
        wzrost = (wejscie.nextFloat() / 100);
        BMI = waga / (wzrost * wzrost);
        float itemsNumberFloat = BMI;
        System.out.println("BMI = " + itemsNumberFloat);
        if (BMI < 18.5) {
            System.out.println("Niedowaga");
        }
        if (BMI > 24.9) {
            System.out.println("Nadwaga");
        }
        else{
            if (BMI >= 18.5 && BMI <= 24.9) {
                System.out.println("Norma");
            }
        }
    }
}