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
                    UI.showResult(requireNonNull(Sort.sortUniqueNumbers(1)), title);
                    break;
                case 2:
                    //mega sena
                    UI.showResult(requireNonNull(Sort.sortUniqueNumbers(2)), title);
                    break;
                case 3:
                    //lotofacil
                    UI.showResult(requireNonNull(Sort.sortUniqueNumbers(3)), title);
                    break;
                case 4:
                    //custom
                        UI.showResult(Sort.sortUniqueNumbers(UI.getIntFromUser("Entre com o range inteiro inicial"),
                                UI.getIntFromUser("Entre com o range inteiro final"),
                                UI.getIntFromUser("Entre com a quantidade de numeros"), "gameName"), title);
                    break;
                case 5:
                    // inteiro
                    UI.showResult(Sort.sortIntValue(UI.getIntFromUser("Entre com o range inteiro inicial"),
                            UI.getIntFromUser("Entre com o range inteiro final")));
                    break;
                case 6:
                    play = false;
                    break;
                default:
                    UI.showResult("Você não digitou um valor válido!");
                    break;
            }
        }
    }
}




