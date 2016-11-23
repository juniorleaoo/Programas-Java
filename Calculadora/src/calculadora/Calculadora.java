/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;
public class Calculadora {   
    
    public static void main(String[] args){
        double a,b;
        double resultado = 0.0;
        Operacoes obj = new Operacoes();
        int op;
        Scanner operacao = new Scanner(System.in);       
        do{
        System.out.println("CALCULADORA");
        System.out.println("Selecione uma das opções abaixo: \n 1-SOMA \n 2-SUBTRACAO \n 3-MULTIPLICACAO \n 4-DIVISAO  \n 0-SAIR");
        op = operacao.nextInt();
            switch(op){
                case 1:
                    System.out.println("Digite A:");
                    a=operacao.nextDouble();
                    System.out.println("Digite B:");
                    b=operacao.nextDouble();
                    System.out.println("Resultado: "+obj.soma(a, b));                    
                    break;
                case 2:
                    System.out.println("Digite A:");
                    a=operacao.nextDouble();
                    System.out.println("Digite B:");
                    b=operacao.nextDouble();
                    System.out.println("Resultado: "+obj.subtrair(a, b));
                    break;
                case 3:
                    System.out.println("Digite A:");
                    a=operacao.nextDouble();
                    System.out.println("Digite B:");
                    b=operacao.nextDouble();
                    System.out.println("Resultado: "+obj.multiplicacao(a, b));
                    break;
            case 4:
                    System.out.println("Digite A:");
                    a=operacao.nextDouble();
                    System.out.println("Digite B:");
                    b=operacao.nextDouble();
                    System.out.println("Resultado: "+obj.divisao(a, b));
                    break;
            }
        }while(op!=0);        
    }
}
