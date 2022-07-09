/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args){
        Scanner leitorInt = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);
        String nomeFuncionario,reajuste;
        float value,salarioFuncionario=0f,salarioMinimo,salarioAtualizado=0f;
        //dia 08/07/2022 -- salário minimo == 1.212,00 reais
        char opcao = 's';
        
        
        while(opcao == 'S' || opcao == 's'){
        System.out.println(" -- Sistema de reajuste salarial empresarial --");
        System.out.println("Informe o nome do funcionário: ");
        nomeFuncionario = leitorString.next();
        System.out.println("Informe o salário minimo atual");
        salarioMinimo = leitorInt.nextFloat();
        System.out.println("Informe o salário de "+nomeFuncionario);
        salarioFuncionario = leitorInt.nextFloat();
        if(salarioFuncionario < (salarioMinimo*3)){
            salarioAtualizado = salarioFuncionario + (salarioFuncionario*0.5f);
            value = salarioFuncionario*0.5f;
            reajuste = "50%";
        }else if(salarioFuncionario >= (salarioMinimo *3) && salarioFuncionario <= (salarioMinimo*10)){
            salarioAtualizado = salarioFuncionario + (salarioFuncionario*0.2f);
            value = salarioFuncionario*0.2f;
            reajuste = "20%";
        }else if(salarioFuncionario > (salarioMinimo * 10) && salarioFuncionario <= (salarioMinimo*20)){
             salarioAtualizado = salarioFuncionario + (salarioFuncionario*0.15f);
             value = salarioFuncionario*0.15f;
             reajuste = "15%";
        }else{
             salarioAtualizado = salarioFuncionario + (salarioFuncionario*0.1f);
             value = salarioFuncionario*0.1f;
             reajuste = "10%";
        }
        
        System.out.println("+-----------------");
        System.out.println("|      Dados      ");
        System.out.println("| Nome: "+nomeFuncionario);
        System.out.println("| Reajuste em "+reajuste+" em cima da antiga remuneração");
        System.out.println("| Remuneração atual: "+salarioAtualizado);
        System.out.println("| Será adicionado mais "+value+" reais a sua folha de pagamento");
        System.out.println("+--------------------");
        
        
        System.out.println("Deseja realizar outra operação ? (S/N) ");
        opcao = leitorInt.next().charAt(0);
        }
    }
}
