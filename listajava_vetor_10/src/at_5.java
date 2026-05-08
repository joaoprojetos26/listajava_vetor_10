import java.util.Scanner;

import static java.lang.System.in;

public class at_5 {  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    boolean check = false;
    int num2 = 0;
    int num = 50;
    int[] vert = new int[num];
    int i;
    for (i = 0; i < num; i++) {
        vert[i] = num2 + 5;
    }
    System.out.println("Digite um número e veremos se ele está na lista");
    int num1 = sc.nextInt();
    for (i = 0; i < num; i++){

        if (vert[i]==num1) {
            System.out.println("Está presente na lista");
            check = true;
            break;
        }
    }
    if (!check){
        System.out.println("Não está na lista");
    }
    sc.close();
}
}
