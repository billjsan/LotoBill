package entity;


public class MegaSenaImpl extends Ticket {

    public MegaSenaImpl() {
        String mName = "Mega Sena";
        int mQtdNumbers = 6;
        int mStartRange = 1;
        int mEndRange = 60;
        super._setDefaultValues(mStartRange, mEndRange, mQtdNumbers, mName);
    }

    public MegaSenaImpl(int startRange, int endRange, int qtdNumbers, String nome) {
        super(startRange, endRange, qtdNumbers, nome);
    }

}
