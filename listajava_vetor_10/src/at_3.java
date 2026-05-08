import java.util.Scanner;

public class at_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int soma=0;
        int cont=0;
        int[] vert=new int[num];
        for (int i=0;i<num;i++) {
            vert[i] = sc.nextInt();
            if (vert[i]%2==0) {
                cont++;
            }


        }
        System.out.println(cont);
    }
}
