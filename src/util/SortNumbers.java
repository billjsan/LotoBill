package util;


import java.security.SecureRandom;

import java.util.Objects;

abstract public class SortNumbers {

    /**
     * provides an Array of integers with random values
     *
     * @param game
     * @return
     */
    public static Integer[] uniqueNumbers(Ticket game) {

        Integer[] vector = new Integer[game._getQtdGameNumbers()];

        /**
         * repeats for each value of a ticket game
         */
            int count = 0;

            while(count < game._getQtdGameNumbers()) {

                int n = sortInt(game);

                if (isUnique(n, vector)) {
                    vector[itemsCount(vector)] = n;
                    count++;
                }
            }

            return orderUp(vector);
    }

    /**
     * return a new int number according the rules
     * of the game each time it was called
     * @param game
     * @return
     */
    public static int sortInt(Ticket game){

        SecureRandom num = new SecureRandom();

        return game._getStartRange() +
                num.nextInt(((game._getEndRange() +1) - (game._getStartRange())));

    }

    public static int sortInt(int startValue, int endValue){

        SecureRandom sr = new SecureRandom();
        return startValue + sr.nextInt(((endValue + 1) - (startValue)));
    }


    /**
     * verify if the value is unique
     *
     * @param searchNum
     * @param vec
     * @return
     */
    public static Boolean isUnique(int searchNum, Integer[] vec) {

        for (int i = 0; i < vec.length; i++) {

            if (Objects.equals(vec[i], searchNum)) {

                return false;
            }
        }

        return true;
    }

    /**
     * returns the number of valid items on array
     * @param vec
     * @return
     */
    public static int itemsCount(Integer[] vec) {

        int numberCount = 0;


        for(int i = 0; i< vec.length; i++){

            if(!(vec[i] == null)){
                numberCount++;
            }

        }

        return numberCount;
    }


    /**
     * precisa debugar
     * @param vec
     * @return
     */
    private static Integer[] orderUp(Integer[] vec) {

        for (int i = 0; i < vec.length; i++) {

            for (int j = 0; j < (vec.length - 1); j++) {
                if (vec[j] > vec[j + 1]) {
                    int aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;
                }
            }
        }

        return vec;
    }

}
