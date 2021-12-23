package uc;

import util.Ticket;

import java.io.Serializable;


public class LotoFacil extends Ticket {

    private final String mName = "Loto facil";
    private final int mQtdNumeros = 15;
    private final int mStartRange = 1;
    private final int mEndRange = 25;

    public LotoFacil() {
        super._setDefaultValues(mStartRange,mEndRange, mQtdNumeros, mName);
    }

    public LotoFacil(int startRange,int endRange, int qtdNumeros, String nome) {
        super(startRange, endRange, qtdNumeros, nome);
    }


}
