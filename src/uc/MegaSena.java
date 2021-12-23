package uc;


import util.Ticket;

import java.io.Serializable;


public class MegaSena extends Ticket {

    private final String mName = "Mega sena";
    private final int mQtdNumeros = 6;
    private final int mStartRange = 1;
    private final int mEndRange = 60;

    public MegaSena() {
        super._setDefaultValues(mStartRange,mEndRange, mQtdNumeros, mName);
    }

    public MegaSena(int startRange,int endRange, int qtdNumeros, String nome) {
        super(startRange, endRange, qtdNumeros, nome);
    }

}
