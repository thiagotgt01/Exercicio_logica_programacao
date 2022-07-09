/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String [] args){
        
        Scanner leitor = new Scanner(System.in);
        
        float  celsius,fahrenheit;
        
        System.out.println("Digite a temperatura em celsius");
        celsius = leitor.nextFloat();
        
        fahrenheit = (9*celsius+160)/5;
        
        System.out.println("Conversao de Fahrenheit -> "+fahrenheit);
        
    }
}
