/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

import java.util.Scanner;

/**
 *
 * @author Junior
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1;
        int n2;
        int maior;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("N1: ");
        n1 = keyboard.nextInt();
        System.out.println("N2: ");
        n2 = keyboard.nextInt();
        maior = (n1>n2)?n1:n2;
        System.out.println(maior);    
        
    }
    
}
