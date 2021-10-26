package ui;

import debug.Debugg;
import uc.LotoFacil;
import uc.MegaSena;
import uc.Outra;
import uc.Quina;


public class Play {

    public static void main(String[] args) {

        Quina quina = new Quina();
        MegaSena sena = new MegaSena();
        LotoFacil lfacil = new LotoFacil();
        Outra other = new Outra(25,30,5,"other");

        Debugg.showArrayIntInfo(other._getBetNumbers());

        }
}