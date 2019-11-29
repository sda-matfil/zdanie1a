import java.util.Scanner;


public class pierwsze {

    public String first(){
        String napis = "dupa";
        int x;
        Scanner skan = new Scanner(System.in);
        System.out.println("\nIle zmiennych chcesz wprowadzić?: ");
        do{
            x = skan.nextInt();

            // System.out.println("\nwartość x : " + x);

            int ile[] = new int[x];

            for (int i = 0; i < x; i++) {
                System.out.println("\npodaj wartość " + (i+1)+ " zmiennej");
                ile[i] = skan.nextInt();
            }

            if (x > 1) {
                int y = 0;
                int z = Math.min(ile[y], ile[y + 1]);
                int c = Math.max(ile[y], ile[y + 1]);
                do {
                    z = Math.min(z, ile[y]);
                    c = Math.max(c, ile[y]);
                    y++;

                } while (y <= x - 1);
                System.out.println("\n Wartość minimalna wynosi: " + z+"\n Wartość maksymalna wynosi: " + c);
            }else
                System.out.println("\nProgram nie zadziała\n jeśli wprowadzisz mniej\n niż dwie wartości.\n\n DO WIDZENIA ");
            return napis;
        }while (x<2);



    }}