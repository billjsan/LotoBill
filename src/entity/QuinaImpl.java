/**
 * Author: Willian J. Santos
 * Date 28/12/2021
 */
package entity;


public class QuinaImpl extends Ticket {

    public QuinaImpl() {
        String mName = "Quina";
        int mQtdNumbers = 5;
        int mStartRange = 1;
        int mEndRange = 80;
        super._setDefaultValues(mStartRange, mEndRange, mQtdNumbers, mName);
    }

    public QuinaImpl(int startRange, int endRange, int qtdNumbers, String name) {
        super(startRange, endRange, qtdNumbers, name);
    }


}
