/**
 * Author: Willian J. Santos
 * Date 28/12/2021
 */
package userinterface;

import controll.GamesList;
import controll.Sort;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

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
                String userInput = JOptionPane.showInputDialog("Escolha um jogo:\n\n"
                        + showMainScreen(list) );
                intValue = Integer.parseInt(userInput);
                done = true;
                System.out.println(intValue);
            }catch (NumberFormatException e){
                UI.showMessage("Você não digitou um valor valido");
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
                UI.showMessage("Você não digitou um valor valido");
            }
        }
        return intValue;
    }

    //Begin - willian J. Santos - 29-12-21 -
    //Adds a approach to avoid input inconsistencies
    /**
     * show in UI the result of sorting numbers for each
     * case the user asked
     * @param keycase
     * @param message
     */
    public static void showResultForCase(int keycase, String message){

        Integer[] vector = getResultForCase(keycase);
        if (vector == null){
            return;
        }
        StringBuilder finalText = new StringBuilder();
        finalText.append(message).append("\n");

        for (int i = 0; i < Objects.requireNonNull(vector).length; i++) {

            if (!(i + 1 == vector.length)) {
                finalText.append(vector[i]).append(", ");
            } else {
                finalText.append(vector[i]);
            }
        }
        JOptionPane.showMessageDialog(null, finalText);
    }

    /**
     * provides de result by building the Ticket objects
     * with customized information but following the game rules
     * @param keycase
     * @return
     */
    private static Integer[] getResultForCase(int keycase){
        Integer[] vector = {0};

        if(keycase == GamesList.CUSTOM){
            try {
                vector = Sort.getSortUniqueNumbersByValues(
                        UI.getIntFromUser("Entre com o range inteiro inicial"),
                        UI.getIntFromUser("Entre com o range inteiro final"),
                        UI.getIntFromUser("Entre com a quantidade de numeros"),
                        "gameName");
            }
            catch (IllegalArgumentException args){
                UI.showMessage("Você digitou uma combinação invalida");
                return null;
            }
        }
        else if (keycase == GamesList.UNIQUE_INTEGER){

            try {
                vector[0] = Sort.getSortedIntValueByRange(
                        UI.getIntFromUser("Entre com o range inteiro inicial"),
                        UI.getIntFromUser("Entre com o range inteiro final"));
            }
            catch (IllegalArgumentException args){
                UI.showMessage("Você digitou uma combinação invalida");
                return null;
            }
        }
        else {
            try {
                vector = Sort.getSortedUniqueNumbersByCase(keycase);
            }
            catch (IllegalArgumentException args) {
                UI.showMessage("Você digitou uma combinação invalida");
                return null;
            }
        }
       return vector;
    }
    //end - 29-12-21

    /**
     * show the string passed as parameter in UI
     * @param message
     */
    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null,message);
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
}
