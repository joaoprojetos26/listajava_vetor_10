import java.util.Scanner;

public class at_4 {   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira 10 nomes e diremos a ordem inversa dele");
    int num=10;
    String[] vert=new String[num];
    for (int i=0;i<num;i++){
        vert[i]=sc.next();
        if (i+1==num){
            System.out.println("A ordem inversa dos nomes é:");
            for (;i>=0;i--){
                System.out.println(vert[i]);
            }break;
        }
    }
    sc.close();
}

    }

//O string.value() trnsforma priticamente qualquer tipo de dado(int,
//double, boolean,char,ou ate um objeto) em uma STRING.