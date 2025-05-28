package br.com.felp.request.converters;

import br.com.felp.exception.UnsopportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber ==null || strNumber.isEmpty())
            throw new UnsopportedMathOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber ==null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", "."); //R$5,00 -> R$5.00
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

}
