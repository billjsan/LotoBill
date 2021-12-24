package interfac;

import controll.GamesList;
import controll.Sort;

import java.util.ArrayList;

import static java.util.Objects.*;

public class Play {

    public static void main(String[] args) {

        GamesList gamesList = new GamesList();
        ArrayList<String> listGames = gamesList.getList();
        boolean play = true;

        /**
         * user must choose a game to play
         */
        while(play){

            String title ="Números sorteados:";
            int choice = UI.chooseGame(listGames);
            switch (choice){
                case 1 :
                    //quina
                    UI.show(requireNonNull(Sort.sortUniqueNumbers(1)), title);
                    break;
                case 2:
                    //mega sena
                    UI.show(requireNonNull(Sort.sortUniqueNumbers(2)), title);
                    break;
                case 3:
                    //lotofacil
                    UI.show(requireNonNull(Sort.sortUniqueNumbers(3)), title);
                    break;
                case 4:
                    //custom
                    UI.show(Sort.sortUniqueNumbers(UI.getIntFromUser("texto"),
                            UI.getIntFromUser("0"), UI.getIntFromUser("2"), "alice"), title);
                    break;
                case 5:
                    // inteiro
                    UI.show(Sort.sortIntValue(UI.getIntFromUser("Entre com o range inteiro inicial"),
                            UI.getIntFromUser("Entre com o range inteiro final")));
                    break;
                case 6:
                    play = false;
                    break;
                default:
                    UI.show("Você não digitou um valor válido!");
                    break;
            }
        }
    }
}




