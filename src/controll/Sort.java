/**
 * Author: Willian J. Santos
 * Date 28/12/2021
 */

package controll;
import entity.*;

import java.security.SecureRandom;
import java.util.Objects;

abstract public class Sort  {

    /**
     * provides an Array of integers with random values
     * according to the rules of each game type
     *
     * @param game
     * @return
     */
    public static Integer[] getSortedUniqueNumbersByTicket(Ticket game)
            throws IllegalArgumentException{

        Integer[] vector = new Integer[game._getQtdGameNumbers()];

        int count = 0;
        while(count < game._getQtdGameNumbers()) {

            int n = getSortedIntValueByTicket(game);
            if (isUnique( vector, n)) {
                vector[itemsCount(vector)] = n;
                count++;
            }
        }
        return orderUp(vector);
    }

    /**
     * creates an instance of a Ticket element >> CustomImpl with the values
     * passed from caller and return the result
     * @param startRange
     * @param endRange
     * @param qtdNumbers
     * @param name
     * @return
     */
    public static Integer[] getSortUniqueNumbersByValues(int startRange, int endRange,
                                                         int qtdNumbers, String name )
            throws IllegalArgumentException{
        CustomImpl custom = new CustomImpl(startRange, endRange, qtdNumbers, name);
        return Sort.getSortedUniqueNumbersByTicket(custom);
    }

    /**
     * workaround to solve the problem of working with bilateral dataflow
     * between layers. The Interface layer shouldn't know about entity layer.
     * @param keyCase
     * @return
     */
    public static Integer[] getSortedUniqueNumbersByCase(int keyCase)
            throws IllegalArgumentException {

        switch (keyCase){
            case 1:
                //quina
                QuinaImpl quina = new QuinaImpl();
                return  Sort.getSortedUniqueNumbersByTicket(quina);
            case 2:
                // mega sena
                MegaSenaImpl megaSena = new MegaSenaImpl();
                return Sort.getSortedUniqueNumbersByTicket(megaSena);
            case 3:
                // lotofacil
                LotoFacilImpl lotoFacil = new LotoFacilImpl();
                return Sort.getSortedUniqueNumbersByTicket(lotoFacil);
        }
        return null;
    }

    /**
     * return a new int number according the rules
     * of the game each time it was called
     * @param game
     * @return
     */
    public static int getSortedIntValueByTicket(Ticket game)
            throws IllegalArgumentException{

        //Begin - willian J. Santos - 29-12-21 -
        //Adds a approach to avoid input inconsistencies

        //better to visualize
        int start, end, count;
        start = game._getStartRange();
        end = game._getEndRange();
        count = game._getQtdGameNumbers();

        if((start > end) || ((start == end) && (count > 0)) ||
                ((end - start) < count -1)) {
            throw new IllegalArgumentException();
        }
        //end - 29-12-21

        SecureRandom num = new SecureRandom();
        return game._getStartRange() +
                num.nextInt(((game._getEndRange() +1) - (game._getStartRange())));
    }

    /**
     * sort a integer number between range values received
     * @param startValue
     * @param endValue
     * @return
     */
    public static int getSortedIntValueByRange(int startValue, int endValue)
            throws IllegalArgumentException{

        //Begin - willian J. Santos - 29-12-21 -
        //Adds a approach to avoid input inconsistencies
        if(!(startValue <= endValue )){
            throw new IllegalArgumentException("Valor inicial " +
                    "maior que valor final");
        }
        //end - 29-12-21

        SecureRandom sr = new SecureRandom();
        return startValue + sr.nextInt(((endValue + 1) - (startValue)));
    }

    /**
     * verify if the value is unique in the array
     *
     * @param searchNum
     * @param vector
     * @return
     */
    private static Boolean isUnique( Integer[] vector, int searchNum) {

        for (Integer integer : vector) {
            if (Objects.equals(integer, searchNum)) {
                return false;
            }
        }
        return true;
    }// change de approach

    /**
     * returns the number of valid items on array
     * @param vec
     * @return
     */
    private static int itemsCount(Integer[] vec) {

        int numberCount = 0;
        for (Integer integer : vec) {
            if (!(integer == null)) {
                numberCount++;
            }
        }
        return numberCount;
    }// change de approach

    /**
     *
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
    }// change de approach, complexity O(N2)
}
