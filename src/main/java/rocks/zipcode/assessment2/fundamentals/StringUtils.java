package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String padding = "";
        for (int i = 0; i < amountOfPadding - stringToBePadded.length() ; i++) {
            padding += " ";
        }


        return padding += stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String basic = stringToBePadded;
        String space = "";
        for (int i = 0; i <Math.abs(stringToBePadded.length() - amountOfPadding); i++) {
            space += " ";
        }


        return basic + space;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String basic = stringToBeRepeated;
        for (int i = 1; i < numberOfTimeToRepeat ; i++) {
            stringToBeRepeated += basic;
        }
        return stringToBeRepeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        return string.matches("^[a-z A-Z]+$");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        return string.matches("[0-9 ]+");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return string.matches("^[!@$%^&()*]+");
    }
}
