
import java.util.Scanner;


public class Exercicio4 {
   
    public static void main(String[] args) {
        String nome;
        double n1,n2;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno(a): ");
        nome = ler.nextLine();
        
        System.out.println("Digite a nota 1: ");
        n1 = ler.nextDouble();
        System.out.println("Digite a nota 2: ");
        n2 = ler.nextDouble();
        
        System.out.println("A média do aluno: " + (n1 + (n2 * 2)) / 3);
        
        
    }
}