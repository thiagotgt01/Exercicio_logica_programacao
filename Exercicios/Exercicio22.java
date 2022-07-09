/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.lang.Math;
import java.text.DecimalFormat;
public class Exercicio22 {
    public static void main (String[] args){
        DecimalFormat df = new DecimalFormat("0.00");
        float precoCusto, precoVenda;
        float mediaCusto = 0,mediaVenda = 0;
        int min=20,max=100,intervalo= max - min +1;
        
        for(int i=0;i<40;i++){
            
            float randomCusto = (float)(Math.random()*intervalo)+min;
            System.out.print("Valor de custo: "+df.format(randomCusto));
            
            float randomVenda = (float)(Math.random()*intervalo)+min;
            System.out.print("Valor de venda: "+df.format(randomVenda));
            if(randomCusto < randomVenda){
                System.out.println(" -- O produto tem lucro de: "+df.format((randomVenda - randomCusto)));
            }else if(randomCusto == randomVenda){
                System.out.println("O produto não tem lucros e prejuízos");
            }else if(randomCusto > randomVenda){
                System.out.println(" -- O produto tem prejuízo de: "+df.format((randomVenda - randomCusto)));
            }
            mediaCusto += randomCusto;
            mediaVenda += randomVenda;

            
        }
        System.out.println("Media do custo dos produtos: "+df.format(mediaCusto/40));
        System.out.println("Media de lucro dos produtos: "+df.format(mediaVenda/40));
        
        
    }
}
