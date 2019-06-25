package db1startdesafiogeoografia;

import java.text.Normalizer;

/**
 *
 * @author Rick
 */
public class Geografia {

    private static final String capital = " sendo sua capital.";
    private static final String nCapital = " mas não é sua capital.";
    private static final String pr = " pertence ao estado do Paraná";
    private static final String rs = " pertence ao estado do Rio Grande do Sul";
    private static final String sc = " pertence ao estado de Santa Catarina";

    private static String removerAcentos(String palavra) {    //função que retira os acentos
        palavra = Normalizer.normalize(palavra, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
       return palavra;
    }

    public static String retornarCidades(String cidade) { //função que retorna as cidades

        String tratado = removerAcentos(cidade); //função que retira os acentos
        String ret = "";
        switch (tratado) {
            case "CURITIBA": {
                ret = "A cidade de Curitiba" + pr + capital;
                break;
            }
            case "MARINGA": {
                ret = "A cidade de Maringá" + pr + nCapital;
                break;
            }
            case "MARING": {
                ret = "A cidade de Maringá" + pr + nCapital;
                break;
            }
            case "LONDRINA": {
                ret = "A cidade de Londrina" + pr + nCapital;
                break;
            }
            case "PINHAIS": {
                ret = "A cidade de Pinhais" + pr + nCapital;
                break;
            }
            case "CHAPECO": {
                ret = "A cidade de Chapecó" + sc + nCapital;
                break;
            }
            case "CHAPEC": {
                ret = "A cidade de Chapecó" + sc + nCapital;
                break;
            }
            case "JOINVILE": {
                ret = "A cidade de Joinvile" + sc + nCapital;
                break;
            }
            case "BLUMENAU": {
                ret = "A cidade de Blumenal" + sc + nCapital;
                break;
            }
            case "FLORIANOPOLIS": {
                ret = "A cidade de Florianópolis" + sc + capital;
                break;
            }
            case "FLORIANPOLIS": {
                ret = "A cidade de Florianópolis" + sc + capital;
                break;
            }
            case "PORTO ALEGRE": {
                ret = "A cidade de Porto Alegre" + rs + capital;
                break;
            }
            case "GRAMADO": {
                ret = "A cidade de Gramado" + rs + nCapital;
                break;
            }
            default: {
                ret = "Cidade não encontrada ou digitada errado.";
                break;
            }
        }

        return ret;

    }

}
