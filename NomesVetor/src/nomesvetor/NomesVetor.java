/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomesvetor;
import java.util.Scanner;
/**
 *
 * @author Junior
 */
public class NomesVetor {
    public static void main(String[] args) {        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount names: ");
        int amount = keyboard.nextInt();
        String names[] = new String[amount];
        for (int i = 0; i < amount; i++) {
            System.out.printf("Enter the names: ");
            names[i] = keyboard.next();
        }
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                int compare = names[i].compareTo(names[j]);
                if(compare<0){
                    String aux = names[i];
                    names[i]=names[j];
                    names[j]=aux;
                }                    
            }            
        }
        for (int i = 0; i < amount; i++) {
            System.out.println(names[i]);
        }
    }
    
}
