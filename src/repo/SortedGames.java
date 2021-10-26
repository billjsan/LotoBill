package repo;

import java.util.ArrayList;

public abstract class SortedGames {

    private static ArrayList<Integer[]> mSortedNumbers = null;

    public static ArrayList<Integer[]> getSortedNumbers() {
        return mSortedNumbers;
    }

    public static void addSortedNumbers(Integer[] vector) {

        mSortedNumbers.add(vector);
    }
}
