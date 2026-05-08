import java.util.Scanner;

public class at_1 {
   public class at_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero por favor");
        double soma = 0;
        int[] vert = new int[10];
        for (int i = 0; i < 10; i++) {
            vert[i]=sc.nextInt();
            soma=vert[i]+soma;
            System.out.println("digite novamente");
        }
        System.out.println("a soma total e: " +soma/10);
        sc.close();
    }
}
}
