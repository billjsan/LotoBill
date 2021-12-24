package entity;


import java.io.Serializable;

/**
 * defines the behavior and attributes of a Ticket
 */
public abstract class Ticket  implements Serializable {

    /**
     * tickets parameters
     */
    private int _qtdGameNumbers = 0;
    private int _startRange = 0;
    private int _endRange = 0;
    private String _gameName = null;

    /**
     * review this user case
     */
    public Ticket() {
    }

    /**
     * initialize the Ticket with their rules
     * @param startRange
     * @param endRange
     * @param qtdNumbers
     * @param nome
     */
    public Ticket(int startRange, int endRange,int qtdNumbers, String nome) {
        this._qtdGameNumbers = qtdNumbers;
        this._gameName = nome;
        this._startRange = startRange;
        this._endRange = endRange;
    }

    public int _getStartRange() {
        return _startRange;
    }

    /**
     * analyze this user case
     *
     * @param startRange
     * @param endRange
     * @param qtdNumbers
     * @param name
     */
    protected void _setDefaultValues(int startRange, int endRange, int qtdNumbers, String name) {
        this._gameName = name;
        this._qtdGameNumbers = qtdNumbers;
        this._startRange = startRange;
        this._endRange = endRange;
    }

    public int _getQtdGameNumbers() {
        return _qtdGameNumbers;
    }

   public int _getEndRange() {
        return _endRange;
    }
}
