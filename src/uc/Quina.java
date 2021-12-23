package uc;

import util.Ticket;

import java.io.Serializable;


public class Quina extends Ticket {

    private final String mName = "Quina";
    private final int mQtdNumeros = 5;
    private final int mStartRange = 1;
    private final int mEndRange = 80;

    public Quina() {
        super._setDefaultValues(mStartRange,mEndRange, mQtdNumeros, mName);
    }

    public Quina(int startRange,int endRange, int qtdNumeros, String nome) {
        super(startRange, endRange, qtdNumeros, nome);
    }


}
