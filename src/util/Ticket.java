package util;

import java.io.Serializable;

public abstract class Ticket implements Serializable {

    private int _qtdGameNumbers = 0;
    private int _startRange = 0;
    private int _endRange = 0;
    private String _gameName = null;

    public Ticket() {

    }

    public Ticket(int startRange, int endRange,int qtdNumeros, String nome) {
        this._qtdGameNumbers = qtdNumeros;
        this._gameName = nome;
        this._startRange = startRange;
        this._endRange = endRange;
    }


    public int _getStartRange() {
        return _startRange;
    }

    public void _setStartRange(int _startRange) {
        this._startRange = _startRange;
    }

    protected void _setDefaultValues(int startRange, int endRange, int numberQtd, String name) {
        this._gameName = name;
        this._qtdGameNumbers = numberQtd;
        this._startRange = startRange;
        this._endRange = endRange;
    }

    public Integer[] _getBetNumbers(Ticket this) {

        return SortNumbers.uniqueNumbers(this);
    }

    public int _getQtdGameNumbers() {
        return _qtdGameNumbers;
    }

    public void _setQtdGameNumbers(int _qtdGameNumbers) {
        this._qtdGameNumbers = _qtdGameNumbers;
    }

    public String _getGameName() {
        return _gameName;
    }

    public void _setGameName(String _gameName) {
        this._gameName = _gameName;
    }

    public int _getEndRange() {
        return _endRange;
    }

    public void _SetEndRange(int endRange) {
        this._endRange = _qtdGameNumbers;
    }

}
