/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author thiag
 */
public class Exercicio3 {
    
    private static final DecimalFormat df = new DecimalFormat("0.000");
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        float distancia,gastoCombustivel;
        System.out.println("Informe a distancia percorrida em Km");
        distancia = leitor.nextFloat();
        System.out.println("Informe o total de combustível utilizado em L");
        gastoCombustivel = leitor.nextFloat();
       
        
        
        System.out.println("O Consumo medio do veiculo e de: "+df.format((distancia/gastoCombustivel))+" Km/L");
          
        
    }
}
