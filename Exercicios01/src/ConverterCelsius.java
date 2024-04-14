//exercicios para fortalecimento de conceito
//Exercicio para conversão de temperatura celsius > K, Re, Ra e F
//chamar classe scanner para entrada de dados
import java.util.Scanner;
public class ConverterCelsius {
    public static void main(String[] args) {
    
        //cria o obejto scanner para receber o valor da temperatura
        Scanner sc1 = new Scanner(System.in);
    
        //criando variaveis
        double  f, ra, re, k;
        
        System.out.println("Digite o valor da temperatura em graus celsius: ");
        double c = sc1.nextDouble();
        
        f = c * 1.8 + 32;
        ra = c * 1.8 + 32 + 459.67;
        re = c * 0.8;
        k = c + 273.15;

        System.out.println("A temperatura em Fahrenheit é: " + f);
        System.out.println("A temperatura em Rankine é: " + ra);
        System.out.println("A temperatura em Réaumur é:" + re);
        System.out.println("A temperatura em Kelvin é: " + k);

        sc1.close();
        
    }  
    
}
