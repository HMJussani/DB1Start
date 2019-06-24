package db1start;

/**
 *
 * @author Rick
 */
public class Matematica  {

    public boolean testarPar(long x)  { //função retorna verdadeiro ou falso;
        boolean par = false;  //inicializa a variavel de retorno falso;
        if (x % 2 == 0) {      //se o resto for "0" ;
            par = true;         //é par, muda o valor para verdadadeiro;
        }
        return par;
    }

    public boolean testarPrimo(long x) { //retorna verdadeiro ou falso;
        boolean primo = false;
        int num = 0;
        for (int i = 1; i <= x; i++) { //divide o numero em análise por todos numeros inteiros menores e por ele mesmo;
            if (x % i == 0) {          //sempre que resto for "0" ;
              //  System.out.println("O número " + x + " é divisível por: " + i); // imprime;
                num++; //incrementa a contagem;
            }
        }
        if (num == 2) { //se for exatamente igual a "2";
            primo = true; //é primo,altera variável de retorno;
        }
        return primo;
    }

}
