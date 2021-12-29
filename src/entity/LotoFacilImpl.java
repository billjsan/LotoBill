/**
 * Author: Willian J. Santos
 * Date 28/12/2021
 */
package entity;

/**
 * The type Loto facil.
 */
public class LotoFacilImpl extends Ticket {

    /**
     * creates a defaul instance of a
     * Lotofacil game
     */
    public LotoFacilImpl() {
        String mName = "Loto facil";
        int mQtdNumbers = 15;
        int mStartRange = 1;
        int mEndRange = 25;
        super._setDefaultValues(mStartRange, mEndRange, mQtdNumbers, mName);
    }

    /**
     * creates a customized instance
     * of a Lotofacil game
     *
     * @param startRange the start range
     * @param endRange   the end range
     * @param qtdNumbers the qtd numbers
     * @param name       the name
     */
    public LotoFacilImpl(int startRange, int endRange, int qtdNumbers, String name) {
        super(startRange, endRange, qtdNumbers, name);
    }
}
