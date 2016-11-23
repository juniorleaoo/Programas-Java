package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota:");
        float nota = teclado.nextFloat();
        System.out.printf("Sua nota de %s é %.1f \n" , nome, nota);
        
        int idade = 21;
        String valor = Integer.toString(idade);
        System.out.println("O valor é: " +valor);
        
        String valor2 = "22";
        float idade2 = Float.parseFloat(valor2);
        System.out.println("O valor2 é: " + idade2);
    }
}
