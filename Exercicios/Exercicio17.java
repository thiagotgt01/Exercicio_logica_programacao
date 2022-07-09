/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Random;

public class Exercicio17 {
    public static void main (String[] args){
       
        Random rand = new Random();
        int count=0;
        for(int num=0;num < 80; num++){
            
            int randomNumber = rand.nextInt(150);
            System.out.println("numero : "+randomNumber);
           
            if((randomNumber >= 10)&&(randomNumber <= 150)){
                count += 1;
            }
            
            
            
        }
        System.out.println("Quantidade de números no intervalo de 10 à 150: "+count);
    }
}
