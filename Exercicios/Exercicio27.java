/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float valorVeiculo,descontoVeiculo=0,totalDesconto=0,totalPago=0;
        int opcao=0;
        
        System.out.println("Carango veículos");
        System.out.println("Venda de veículos");
        do{
        System.out.print("Informe o valor do veículo: ");
        valorVeiculo = leitor.nextFloat();
            if(valorVeiculo == 0){
                break;
            }
            
        System.out.println("+-------------------------+");
        System.out.println("| Combustível do ve�culo  |");
        System.out.println("| 1 - Gasolina            |");
        System.out.println("| 2 - Álcool              |");
        System.out.println("| 3 - Diesel              |");
        System.out.println("+-------------------------+");
        opcao = leitor.nextInt();
        switch(opcao){
            
            case 1:
                System.out.println(" Gasolina selecionado");
                System.out.println(" Desconto de 25% aplicado");
                descontoVeiculo = valorVeiculo * 0.25f;
                System.out.println(" Valor do desconto: "+descontoVeiculo);
                System.out.println(" Valor a ser pago: "+(valorVeiculo - descontoVeiculo));
                break;
            case 2:
                System.out.println(" Álcool selecionado");
                System.out.println(" Desconto de 21% aplicado");
                descontoVeiculo = valorVeiculo * 0.21f;
                System.out.println(" Valor do desconto: "+descontoVeiculo);
                System.out.println(" Valor a ser pago: "+(valorVeiculo - descontoVeiculo));
                break;
            case 3:
                System.out.println(" Diesel selecionado");
                System.out.println(" Desconto de 14% aplicado");
                descontoVeiculo = valorVeiculo * 0.14f;
                System.out.println(" Valor do desconto: "+descontoVeiculo);
                System.out.println(" Valor a ser pago: "+(valorVeiculo - descontoVeiculo));
                break;
            default:
                System.out.println("Informe uma opção válida!");
        }
        totalPago += valorVeiculo;
        totalDesconto += descontoVeiculo;
        }while(valorVeiculo != 0);
        
        System.out.println("Desconto total para os clientes: "+totalDesconto);
        System.out.println("Valor total pago pelos clientes: "+totalPago);
        
        
    }
}
