/*
* Faça um programa que o usuário poderá inserir um texto. O programa deverá informar:
* quantidade de caracteres do texto
* quantidade de espaços em branco no texto
* quantidade de vogais digitadas

 */
package db1startdesafioportugues;

import java.util.Scanner;

/**
 *
 * @author Rick
 */
public class Db1StartDesafioPortugues {

    public static void main(String[] args) {
        Portugues port = new Portugues();
        Scanner tecl = new Scanner(System.in); //instancia scanner para o teclado;
        System.out.println("Digite uma palavra:");
        String palavra = tecl.nextLine();
        String vogal = port.testarVogal(palavra);
        String espaco = port.testarEspaco(palavra);
        System.out.print("A palavra " + palavra.toUpperCase() + " tem ");
        System.out.println(palavra.length() + " caracteres, sendo "+vogal+" e " +espaco+" em branco.");
    }

}
