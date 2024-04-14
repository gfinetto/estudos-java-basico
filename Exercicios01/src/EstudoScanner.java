import java.util.Scanner;
public class EstudoScanner {

    public static void main(String[] args) {
        Scanner teste01 = new Scanner(System.in);
        System.out.print("Digite um numero de 0 a 100: ");
        int numero1 = teste01.nextInt();
        System.out.println("Digite um segundo número de 0 a 100 ");
        int numero2 = teste01.nextInt();
        int numero = numero1 + numero2;


        System.out.println("A soma dos dois numero são: " + numero);
        teste01.close();
    }
}