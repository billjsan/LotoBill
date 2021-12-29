package userinterface;

import controll.GamesList;

import java.util.ArrayList;

public class Play {

    public static void main(String[] args) {

        GamesList gamesList = new GamesList();
        ArrayList<String> listGames = gamesList.getList();
        boolean play = true;

        /**
         * user must choose a game to play
         */
        while(play){

            String title ="Números sorteados: ";
            int choice = UI.chooseGame(listGames);

            switch (choice){
                //Begin - willian J. Santos - 29-12-21 -
                //Adds a approach to avoid input inconsistencies
                case 1 :
                    UI.showResultForCase(1, title);
                    break;
                case 2:
                    UI.showResultForCase(2, title);
                    break;
                case 3:
                    UI.showResultForCase(3, title);
                    break;
                case 4:
                    UI.showResultForCase(4, title);
                    break;
                case 5:
                    UI.showResultForCase(5, title);
                    break;
                //end - 29-12-21
                case 6:
                    play = false;
                    break;
                default:
                    UI.showMessage("Você não digitou um valor válido!");
                    break;
            }
        }
    }
}




