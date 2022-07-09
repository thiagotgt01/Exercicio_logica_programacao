/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;
/**
 *
 * @author thiag
 */
public class Exercicio4 {
    
    public static void main (String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        String nomeVendedor;
        float salarioFixo,totalVendaMensal;
        System.out.println("Informe o nome do vendedor");
        nomeVendedor = leitor.nextLine();
        System.out.println("Informe o salário fixo ");
        salarioFixo = leitor.nextFloat();
        System.out.println("Informe o faturamento das vendas");
        totalVendaMensal = leitor.nextFloat();
        
        System.out.println("--- Dados do vendedor ---");
        System.out.println("Nome: "+nomeVendedor);
        System.out.println("Salário fixo: "+salarioFixo);
        System.out.println("Salário com comissão: "+(salarioFixo+(totalVendaMensal*0.15)));
        
        
    }
}
