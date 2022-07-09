/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;

public class Exercicio20 {
        public static void main(String[] args){
            Scanner leitor = new Scanner(System.in);
            
            int anoCarro;
            float valorCarro,descontoCarro;
            String modeloCarro,opcao;
            
            
            do{
            
            System.out.println("-- Concessionária Carango Velho System --");
            System.out.println("Informe o modelo do carro:");
            modeloCarro = leitor.next();
            System.out.println("Informe o valor do carro: ");
            valorCarro = leitor.nextFloat();
            System.out.println("Informe o ano do carro: ");
            anoCarro = leitor.nextInt();
            
            if(anoCarro <= 2000){
                descontoCarro = valorCarro * 0.12f;
                System.out.println("Desconto do carro é de: "+descontoCarro);
                System.out.println("Valor de venda com desconto aplicado: "+(valorCarro-descontoCarro));
            }else if(anoCarro > 2000){
                descontoCarro = valorCarro * 0.07f;
                System.out.println("Desconto do carro é de: "+descontoCarro);
                System.out.println("Valor de venda com desconto aplicado: "+(valorCarro-descontoCarro));
            }
            System.out.println(" modelo do carro: "+modeloCarro);
            
            System.out.println("Deseja realizar outra operação ? 'S' ou 'N'");
            opcao = leitor.next();
            }while((opcao.equals("S"))|| (opcao.equals("s")));
            
            
            
        }
}
