import java.util.Scanner;

public class at_7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        String [] vert2 = new String[10];
        String [] vert = new String[10];
        int i=0;
        System.out.println("professor digite aqui as respostas corretas");
        for (i=0;i<10;i++){
            vert[i]=sc.next();
            System.out.println("digite novamente");
        }
        System.out.println("agora digite as respostas do seu aluno");
        for (i=0;i<10;i++){
            vert2[i]=sc.next();
            System.out.println("digite novamente");
           if (vert[i].equals(vert2[i]))
               cont++;

        }
        System.out.println("quantidade de acertos do seu aluno " +cont);
    }

}
