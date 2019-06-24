package db1start;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rick
 */
public class Db1StartDesafioMatematica {

    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in); //instancia scanner para o teclado;
        Matematica math = new Matematica(); //instancia classe com funçoes matematicas; 
        boolean numero = true;
        long num = 0; //
        System.out.println("Digite um número:");
        try {
            num = tecl.nextInt(); //recebe o numero digitado;
        } catch (InputMismatchException e) { //se não for numero;
            numero = false;
            System.out.println("Digite somente números.");
        };

        if (numero) { //só executa com numeros.
            boolean primo = math.testarPrimo(num); //testa se é primo
            boolean par = math.testarPar(num);
            System.out.println("O número " + num + " foi analisado e verificou-se que:");
            System.out.print("Segundo o Crivo de Eratóstenes, "+ num+" ");
            if (primo) {
                System.out.print("é um número primo,");
            } else {
                System.out.print("não é um número primo,");
            }
            if (par) {
                System.out.print(" é par,");
            } else {
                System.out.print(" é ímpar,");
            }
            if (num < 10) {
                System.out.print(" é menor que dez");
            } else if (num > 10) {
                System.out.print(" é maior que dez");
            } else if (num == 10) {
                System.out.print(" é igual que dez");
            }
            System.out.println(" e seu dobro é: " + 2 * num + "."); //realiza multiplicação
        }
    }
}
