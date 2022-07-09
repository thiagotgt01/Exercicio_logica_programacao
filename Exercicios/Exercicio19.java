/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Random;
public class Exercicio19 {
    
    public static void main(String[] args){
    Random random = new Random();
    
    
    
    for(int i=0;i<75;i++){
        
        int numRandom = random.nextInt(100);
        if(numRandom >= 18){
            System.out.println("Pessoa maior de idade");
        }else if(numRandom < 18){
            System.out.println("Pessoa menor de idade");
        }
    }
    
    }
}
