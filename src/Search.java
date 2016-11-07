package Search;

import java.util.Arrays;

/**
 * Created by Crow on 07.11.2016.
 *
 */

public class Search {

    private static final String line = "-----------------------------------";

    public static void main(String[] args) {

        System.out.println("Search for the min and max symbols and etc.\n" + line);

        char[] symbol = {'a', 'l', 'q', 'd', 't'};

        char symMax = ArrayUtils.maxChar(symbol);
        char symMin = ArrayUtils.minChar(symbol);

        System.out.println("Maximum: " + symMax);
        System.out.println("Minimum: " + symMin);

        System.out.println(line + "\n" + "The output of the array in reverse order.");
        System.out.println(line + "\n" + Arrays.toString(ArrayUtils.reverse(symbol)));
    }
}
/* Output:

Search for the min and max symbols and etc.
-----------------------------------
Maximum: t
Minimum: a
-----------------------------------
The output of the array in reverse order.
-----------------------------------
[t, d, q, l, a]

*/
