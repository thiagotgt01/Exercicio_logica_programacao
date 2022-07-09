/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Exercicio24 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        int num,numPositivo=0,numNegativo=0,numNeutro=0;
        Random random = new Random();
        float numRandom;
        
        System.out.print("Informe a quantidade de numero a serem analisados: ");
        num = leitor.nextInt();
        System.out.println("numeros positivos/negativos/neutro");
        for(int i=0;i<num;i++){
            numRandom = random.nextInt();
            
            if(numRandom > 0){
                numPositivo+=1; 
            }else if(numRandom < 0){
                numNegativo +=1;
            }else if(numRandom == 0){
                numNeutro +=1;
            }
            
        }
        System.out.println("Números contados positivos -> "+numPositivo);
        System.out.println("Números contados negativos -> "+numNegativo);
        System.out.println("Números contados Neutro -> "+numNeutro);
        
    }
}
