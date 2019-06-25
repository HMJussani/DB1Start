package db1startdesafioportugues;

/**
 *
 * @author Rick
 */
public class Portugues {

    private String letras[];

    public String testarVogal(String palavra) {
        letras = palavra.split("");
        String ret="";
        int vogal = 0;
        for (int i = 0; i < palavra.length(); i++) {
            switch (letras[i]) {
                case "a":
                    vogal++;
                    break;
                case "e":
                    vogal++;
                    break;
                case "i":
                    vogal++;
                    break;
                case "o":
                    vogal++;
                    break;
                case "u":
                    vogal++;
                    break;
            }
        }
        if (vogal <= 1) {
            ret = vogal + " vogal";
        }
        if (vogal > 1) {
            ret = vogal + " vogais";
        }
        return ret;
    }

    public String testarEspaco(String palavra) {
        int espaco = 0;
        String ret = "";
        letras = palavra.split("");
        for (int i = 0; i < palavra.length(); i++) {
            if (letras[i].equals(" ")) {
                espaco++;
            }
        }
        if (espaco <= 1) {
            ret = espaco + " espaço";
        } 
        if (espaco > 1) {
            ret = espaco + " espaços";
        }
        return ret;
    }
}
