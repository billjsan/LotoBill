package controll;


import java.util.ArrayList;

/**
 * workaround to provide a list of games
 *
 */
public class GamesList {

    private final ArrayList<String> gamesList = new ArrayList<>();

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
