package utils;

import java.util.Date;
import java.util.GregorianCalendar;

public interface ParseStringToDate {

    public static Date parseStringToDate(String text) {
        String subString[] = text.split("/");
        int dia = Integer.parseInt(subString[0]);
        int mes = Integer.parseInt(subString[1]) - 1;
        int ano = Integer.parseInt(subString[2]);
        return new GregorianCalendar(ano, mes, dia).getTime();
    }
}
