/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);
        float valorCompra;
        
        System.out.println(" --- Loja mamão com açúcar --- ");
        System.out.println("Informe o valor da compra realizada");
        
        valorCompra = leitor.nextFloat();
        System.out.println("Deverão ser realizado pagamentos mensais fixos de "+valorCompra / 5+" reais cada");
        
    }
}
