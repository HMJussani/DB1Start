/*
*Faça um programa que o usuário poderá inserir um nome de cidade. O programa deverá informar:
* Qual o estado que a cidade pertence
* Se é capital ou não
* O conjunto de cidades permitidas devem ser as seguintes: Curitiba, Maringá, Londrina, Pinhais,
*  Chapecó, Joinvile, Blumenau, Florianópolis, Porto Alegre, Gramado.
*/
package db1startdesafiogeoografia;

import java.util.Scanner;

/**
 *
 * @author Rick
 */
public class Db1StartDesafioGeoografia {
  
    public static void main(String[] args) {
        Geografia geo = new Geografia();
         Scanner tecl = new Scanner(System.in); //instancia scanner para o teclado;
        System.out.println("Digite uma cidade:");
        String cidade = geo.retornarCidades(tecl.nextLine().toUpperCase());
        
        System.out.println(cidade);
       
    }
    
}
