/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        float precoCusto,precoVenda,acrescimo;
        System.out.println(" -- Cadastro de inventario loja TecRio -- ");
        System.out.println("Informe o custo do produto");
        precoCusto = leitor.nextFloat();
        System.out.println("Informe o porcentagem para venda");
        acrescimo = leitor.nextFloat();
        precoVenda = precoCusto+(precoCusto*(acrescimo/100));
        System.out.println("O valor de venda do produto é de "+precoVenda);
        
        
    }
}
