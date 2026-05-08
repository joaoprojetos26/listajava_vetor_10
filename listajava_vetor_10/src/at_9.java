import java.util.Scanner;

public class at_9 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] letras = new char[15];
    int totalVogais = 0;

    System.out.println("Digite 15 letras:");

    for (int i = 0; i < 15; i++) {
        System.out.print((i + 1) + "ª letra: ");
        letras[i] = sc.next().toLowerCase().charAt(0);

        if (isVogal(letras[i])) {
            totalVogais++;
        }
    }

    System.out.println("\nTotal de vogais digitadas: " + totalVogais);
}

    public static boolean isVogal(char c) {
        return "aeiou".indexOf(c) != -1;
    }

}
