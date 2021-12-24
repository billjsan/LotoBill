package entity;

/**
 * The type Custom.
 */
public class CustomImpl extends Ticket {

    /**
     * initialize the ticket rules with values passed
     * by the user
     *
     * @param startRange the start range
     * @param endRange   the end range
     * @param qtdNumbers the qtd numbers
     * @param nome       the nome
     */
    public CustomImpl(int startRange, int endRange, int qtdNumbers, String nome) {
        super(startRange, endRange, qtdNumbers, nome);
    }
}
