package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        try {
        String [] result = new String[endingIndex - startingIndex];
        Integer counter = 0;

            for (int i = startingIndex; i < endingIndex; i++) {
                result[counter] = arrayToBeSpliced[i];
                counter++;
            }

            return result;
        }catch (NegativeArraySizeException e){
            throw new IllegalArgumentException();
        }
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        try {
            String[] end = new String[arrayToBeSpliced.length - startingIndex];
            Integer counter = 0;
            Integer length = end.length;
            if(startingIndex != 0)
                length++;
            for (int i = startingIndex; i < length; i++) {
                end[counter] = arrayToBeSpliced[i];
                counter++;
            }
            return end;
        }catch (NegativeArraySizeException e){
            throw new IllegalArgumentException();
        }
    }
}
