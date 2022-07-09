/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String [ ] args){
    
        Scanner leitor = new Scanner (System.in);
        
        float dolar,cotacao,realBrasileiro;
        
        System.out.println("Informe a cotacao atual dolar para real(BR)");
        cotacao = leitor.nextFloat();
        
        System.out.println("Informe a quantidade de dolares para a conversao");
        dolar = leitor.nextFloat();
        realBrasileiro = cotacao*dolar;
        System.out.println("Conversao baseado na cotacao atual e equivalente ao total de "+realBrasileiro);
        
    }
}
