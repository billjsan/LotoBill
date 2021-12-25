package interfac;

import javax.swing.*;
import java.util.ArrayList;

public class UI {

    /**
     * Start point of application
     * @param list
     * @return
     */
    public static int chooseGame(ArrayList<String> list){
        Integer intValue= null;
        boolean done = false;

        while(!done){
            try{
                String userInput = JOptionPane.showInputDialog("Escolha um jogo:\n\n" + showMainScreen(list) );
                intValue = Integer.parseInt(userInput);
                done = true;
                System.out.println(intValue);
            }catch (NumberFormatException e){
                UI.showResult("Você não digitou um valor valido");
            }
        }
        return intValue;
       }

    /**
     * gets and returns an integer from user, a message is required
     * @param message
     * @return
     */
    public static Integer getIntFromUser(String message){

        Integer intValue= null;
        boolean done = false;

        while(!done){
            try{
                String userInput = JOptionPane.showInputDialog(message);
                intValue = Integer.parseInt(userInput);
                done = true;
                System.out.println(intValue);
            }catch (NumberFormatException e){
                UI.showResult("Você não digitou um valor valido");
            }
        }
        return intValue;
    }//needs try - catch procedure

    /**
     * show the content of an Integer array list
     * @param vector
     */

    public static void showResult(ArrayList<Integer> vector){


        StringBuilder text = new StringBuilder();
        for (Integer integer : vector) {
            text.append(integer).append(", ");
        }

        JOptionPane.showMessageDialog(null, text.toString());
    }

    /**
     * show int values receives formatted according to UI
     *
     * @param vector
     * @param message
     */

    public static void showResult(Integer[] vector, String message){

        StringBuilder text = new StringBuilder();
        text.append(message).append("\n");
        for (int i = 0; i < vector.length; i++){

            if(!(i+1 == vector.length)){
                text.append(vector[i]).append(", ");
            }
            else
            {
                text.append(vector[i]);
            }

        }
        JOptionPane.showMessageDialog(null, text);
    }

    public static void showResult(Integer integer){

        JOptionPane.showMessageDialog(null, integer);
    }

    /**
     * formats the string that must be shown in UI
     * @param list
     * @return
     */

    private static String showMainScreen(ArrayList<String> list){

        StringBuilder text = new StringBuilder();

        for (String string : list) {
            text.append(string).append("\n");
        }
        return text.toString();
    }

    /**
     * show the string passed as parameter in UI
     * @param message
     */

    public static void showResult(String message) {

        JOptionPane.showMessageDialog(null,message);
    }
}
