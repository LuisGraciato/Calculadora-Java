package aula01;

import java.util.Scanner;
public class CALCULADOROFICIAL {

    
    public static void main(String[] args) {
       double n1,n2;
       double soma, subtracao, multiplicacao, divisao, quadrado;
       int op, cont=0;
       Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("ESCOLHA UMA OPCAO");
            System.out.println("(0) SAIR ");
            System.out.println("(1) SOMA ");
            System.out.println("(2) SUBTRACAO ");
            System.out.println("(3) MULTIPLICACAO");
            System.out.println("(4) DIVISAO ");
            System.out.println("(5) QUADRADO ");
            System.out.println("DIGITE SUA OPCAO");
            op = entrada.nextInt();
            
            if (op == 0) {
                System.out.println("Programa Finalizado");
                cont = 1;
                return;
            }
            if (op == 1) {
                System.out.println("Digite o primeiro valor: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = entrada.nextDouble();
                soma = n1+n2;
                System.out.println(" A soma e : "+soma);
            }
            if (op == 2) {
                System.out.println("Digite o primeiro valor: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = entrada.nextDouble();
                subtracao = n1-n2;
                 System.out.println(" A subtração e : "+subtracao);
                }
            if (op == 3) {
                System.out.println("Digite o primeiro valor: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = entrada.nextDouble();
                multiplicacao = n1*n2;
                 System.out.println(" A multiplicação e : "+multiplicacao);
            }
            if (op == 4) {
                System.out.println("Digite o primeiro valor: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = entrada.nextDouble();
                if(n1<n2){
                    System.out.println(" Impossivel realizar calculo" );

                    } 
                    else{
                        divisao = n1/n2;
                        System.out.println(" A divisão e "+divisao );   
                }
            }
            if (op == 5) {
                System.out.println("Digite o valor: ");
                n1 = entrada.nextDouble();
                n2 = 0;
                quadrado = n1 * n1;
                System.out.println(" O quadrado e : "+quadrado);
            }
        } while (cont == 0) ;  
    } 
}