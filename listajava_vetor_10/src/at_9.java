import java.util.Scanner;

public class at_9 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 Scanner sc = new Scanner(System.in);
    int letra=15;
    int cont=0;
    String[] vert= new String[letra];
    for (int i=0;i<letra;i++){
        vert[i]=sc.next();
        if (i==letra) {
        }else if (vert[i].equals("A") || vert[i].equals("a")) {
                cont++;
            } else if (vert[i].equals("E") || vert[i].equals("e")) {
                cont++;
            } else if (vert[i].equals("I") || vert[i].equals("i")) {
                cont++;
            } else if (vert[i].equals("O") || vert[i].equals("o")) {
                cont++;
            } else if (vert[i].equals("U") || vert[i].equals("u")) {
                cont++;

            }

    }
    System.out.println("a quantidade de vogais e:" +cont);
sc.close();
}

}
//obs qual for usar .equals usa || enves de &&

