package Application;

import dao.DaoImplem;
import metier.MetierImplem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DaoImplem dao = new DaoImplem();
        MetierImplem metier = new MetierImplem();
       metier.setDao(dao);
        System.out.println("Résultat="+metier.calcul());

    }
}