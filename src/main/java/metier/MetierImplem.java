package metier;
import dao.Idao;

public class MetierImplem implements Imetier {
    //couplage faible
    private Idao dao ;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*560/Math.cos(tmp*Math.PI);
        return res;
    }
    /*Injecter dans la variable dao un object
     d'une classe qui va implementer Idao
     */
    public void setDao(Idao dao){
        this.dao= dao;
    }
}
