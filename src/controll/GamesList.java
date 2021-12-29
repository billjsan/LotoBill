/**
 * Author: Willian J. Santos
 * Date 28/12/2021
 */
package controll;


import java.util.ArrayList;

/**
 * workaround to provide a list of games
 *
 */
public class GamesList {

    private final ArrayList<String> gamesList = new ArrayList<>();

    //Begin - willian J. Santos - 29-12-21 -
    //Adds a approach to avoid input inconsistencies
    public static final int CUSTOM = 4;
    public static final int UNIQUE_INTEGER = 5;
    //end 29-12-21

    /**
     * Main screen content
     */
    public GamesList(){
        gamesList.add("1 - Quina");
        gamesList.add("2 - Mega Sena");
        gamesList.add("3 - LotoFacil");
        gamesList.add("4 - Custom");
        gamesList.add("5 - Sortear um inteiro");
        gamesList.add("6 - Sair");
    }

    public ArrayList<String>  getList(){

        return gamesList;
    }




}
