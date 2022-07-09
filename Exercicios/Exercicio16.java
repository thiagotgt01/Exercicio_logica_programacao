/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        float nota1,nota2,nota3,media;
        String nome;
        
        System.out.println(" -- Colegio TechRio --");
        System.out.println("Cadastro de notas semestral");
        System.out.print("Nome do aluno: ");
        nome = leitor.nextLine();
        System.out.println("Informe as 3 notas obtidas por "+nome);
        System.out.print("Primeira nota: ");
        nota1 = leitor.nextFloat();
        System.out.print("Segunda nota: ");
        nota2 = leitor.nextFloat();
        System.out.print("Terceira nota: ");
        nota3 = leitor.nextFloat();
        media = (nota1+nota2+nota3)/3;
        if(media >= 7){
            System.out.print("O aluno "+nome+" foi aprovado com "+media+" na média");
        }else if((media > 5) && (media < 7)){
            System.out.print("O aluno "+nome+" está em recuperação com "+media+" na média");
        }else{
            System.out.print("O aluno "+nome+" foi reprovado com "+media+" na média");
        }
        
        
        
    }
}
