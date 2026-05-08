import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class at_6 {public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    System.out.println("por favor digite 10 numeros inteiros");
    int num= 10;
    int num1=10;
    int i=0;
    int [] verts2=new int[10];
    int[] verts=new int[num];
    for (;i<num;i++) {
        verts[i] = sc.nextInt();
        verts2[i]= verts[i]*num1;
        System.out.println("digite novamente");
    }
    System.out.println("A multiplicaçao dos vetores ");
    System.out.println(Arrays.toString(verts2));
    sc.close();
}
}
