import java.util.Scanner;

import static java.lang.System.out;

public class at_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        out.println("digite a quantidades de numeros que vc quer digitar");
        int num=sc.nextInt();
        int maior=0;
        int menor=0;
        int soma=0;
        int[] vert=new int[num];
        for (int i=0;i<num;i++){
            out.println("digite um numero");
            vert[i]=sc.nextInt();
            menor=vert[0];
            if (vert[i]>maior){
                maior=vert[i];
            }
            if (vert[i]<menor){
                menor=vert[i];
            }
        }
        System.out.println("o numero maior: " +maior);
        out.println("o numero menor;" +menor);
        sc.close();
    }
}
