import java.util.ArrayList;
import java.util.List;

/*Classe base do decorato*/

public abstract class Lanche_Decorator implements Lanche_Interface{
    protected Lanche_Interface lanche;

    public Lanche_Decorator(Lanche_Interface lanche){
        this.lanche = lanche;
    }

    @Override
    public String getNome(){
        return lanche.getNome();
    }

    @Override
    public double getPreco(){
        return lanche.getPreco();
    }

    @Override
    public List<String> getIngredientes(){
        return (new ArrayList<>(lanche.getIngredientes()));
    }
}
