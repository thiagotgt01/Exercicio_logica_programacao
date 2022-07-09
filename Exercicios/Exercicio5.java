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
public class Exercicio5 {
    private static final DecimalFormat df = new DecimalFormat("0.0");
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float nota1,nota2,nota3;
        String nomeAluno;
        
        System.out.println("Informe o nome do aluno");
        nomeAluno = leitor.nextLine();
        System.out.println("Informe as 3 notas respectivamente");
        System.out.println("Prova 1");
        nota1 = leitor.nextFloat();
        System.out.println("Prova 2");
        nota2 = leitor.nextFloat();
        System.out.println("Prova 3");
        nota3 = leitor.nextFloat();
        
        System.out.println("--- Dados do aluno ---");
        System.out.println("Nome: "+nomeAluno);
        System.out.println("Média semestral: "+df.format(((nota1+nota2+nota3)/3)));
    }
}
