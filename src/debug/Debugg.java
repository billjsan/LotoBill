package debug;

import util.SortNumbers;
import util.Ticket;

import java.util.Arrays;

public class Debugg {

    public static void showArrayIntInfo(Integer[] vec){

        for(int i =0; i<vec.length; i++){
            System.out.println(vec[i]);
        }
    }

    /**
     * emulates how random generated numbers are
     */
    public static void tryRandom(int loop, Ticket game){

        int delta = game._getEndRange() - game._getStartRange();

        Integer[] val = new Integer[delta + 1 ];
        Arrays.fill(val, 0);

        if (game._getStartRange() == 0){

            for (int i = 0; i< loop; i++){

                int n = SortNumbers.sortInt(game);

                val[n]++;

            }

            showIntArrayInfoFormated(val,loop);

        }else{

            for(int i = 0; i < loop; i++){
                int n = SortNumbers.sortInt(game);
                val[(n - game._getStartRange())] ++;
            }

            showIntArrayInfoFormated(val,game,loop);
        }
    }

    private static void showIntArrayInfoFormated(Integer[] vector, Ticket game, int loop){

            int index = game._getStartRange() ;

        for(int i = 0; i < vector.length; i++){
            System.out.println("value "+ index + " count: " + vector[i]);
            index++;
        }

        System.out.println("generated numbers: " + loop);
    }

    private static void showIntArrayInfoFormated(Integer[] vector, int loop){

            int index = 0;

            for(int i = 0; i < vector.length; i++){
                System.out.println("value "+ index + " count: " + vector[i]);
                index++;
            }

        System.out.println("generated numbers: " + loop);
    }
}
