import java.util.Scanner;

public class at_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor digite a quantidade de vezes que quer digitar");
        int num = sc.nextInt();
        double soma = 0;
        int[] vert = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("digite um numero");
            vert[i]=sc.nextInt();
            soma=vert[i]+soma;
        }
        System.out.println("a soma total e: " +soma/num);
        sc.close();
    }
}
