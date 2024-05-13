package ADS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConversorData {

    
    public static String converterData(String dataAmericana) {
        String padrao = "(\\d{4})-(\\d{2})-(\\d{2})";

        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(dataAmericana);

        if (matcher.find()) {
            String ano = matcher.group(1);
            String mes = matcher.group(2);
            String dia = matcher.group(3);

            String dataBrasileira = dia + "/" + mes + "/" + ano;
            return dataBrasileira;
        } else {
            return "Data no formato incorreto";
        }
    }

    public static void main(String[] args) {
        String dataAmericana = "2022-11-30";
        String dataBrasileira = converterData(dataAmericana);
        System.out.println("Data americana: " + dataAmericana);
        System.out.println("Data brasileira: " + dataBrasileira);
    }
}
