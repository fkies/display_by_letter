import java.util.Scanner;

public class Split_word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int licznik = word.length();
        int licznik2 = licznik;
        for (int j = 0; j < licznik; j++){
            for (int i = 0; i < licznik2; i++) {
                System.out.print(word.charAt(licznik2 - 1));
            }
            licznik2--;
            System.out.print("\n");
            }

        licznik2=1;
        for(int i=0;i<licznik;i++)
        {
            for(int j=0;j<licznik2;j++)
            {System.out.print(word.charAt(i));}
            licznik2++;
            System.out.print("\n");
        }
    }
}
