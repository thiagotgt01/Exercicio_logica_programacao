/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String [] args){
        Scanner leitor = new  Scanner (System.in);
        
        float custoFabrica,custoConsumidor;
        System.out.println(" -- simulador de custos automotivo --");
        System.out.println("Informe o custo de fabrica do automóvel");
        custoFabrica = leitor.nextFloat();
        
        custoConsumidor = custoFabrica + custoFabrica * 0.45f;
        custoConsumidor = custoConsumidor + (custoConsumidor*0.28f);
        
        
        System.out.println("Custo ao consumidor final é de "+custoConsumidor);
        
        
        
    }
}
