/**
 * Author: Willian J. Santos
 * Date 28/12/2021
 */
package data;

import java.util.ArrayList;

/**
 * The type Sorted games.
 */
public abstract class SortedGames {

    private static ArrayList<Integer[]> mSortedNumbers = null;

    /**
     * Gets sorted numbers.
     *
     * @return the sorted numbers
     */
    public static ArrayList<Integer[]> getSortedNumbers() {
        return mSortedNumbers;
    }

    /**
     * Add sorted numbers.
     *
     * @param vector the vector
     */
    public static void addSortedNumbers(Integer[] vector) {

        mSortedNumbers.add(vector);
    }
}
