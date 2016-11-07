package Search;

/**
 * Created by Crow on 07.11.2016.
 *
 */

class ArrayUtils {

        static char[] reverse(char[] symbol) {

            for (int i = 0; symbol.length / 2 > i; i++) {
                char z = symbol[i];
                symbol[i] = symbol[symbol.length - i - 1];
                symbol[symbol.length - i - 1] = z;
            }

            return symbol;
        }

        static char maxChar(char[] array1) {

            char max = array1[0];

            for (int i = 0; i < array1.length; i++) {
                if (max < array1[i]) {
                    max = array1[i];
                }
            }

            /*  for (char anArray1 : array1) {
                if (max < anArray1) {
                    max = anArray1;
                }
            } */

            return max;
        }

        static char minChar(char[] array2) {

            char min = array2[0];

            for (int i = 0; i < array2.length; i++) {

                if (min > array2[i]) {
                    min = array2[i];
                }
            }

            /*      for (char anArray2 : array2) {

                if (min > anArray2) {
                    min = anArray2;
                }
            } */

            return min;
        }
}
