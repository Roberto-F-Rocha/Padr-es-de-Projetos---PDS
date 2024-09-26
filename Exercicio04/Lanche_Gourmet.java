import java.util.List;

/*Decorator concreto*/

public class Lanche_Gourmet extends Lanche_Decorator {
    public Lanche_Gourmet(Lanche_Interface lanche) {
        super(lanche);
    }

    @Override
    public String getNome(){
        return (super.getNome() + " Gourmet");
    }

    @Override
    public double getPreco(){
        return (super.getPreco() + 5.0);
    }

    @Override
    public List<String> getIngredientes(){
        List<String> ingredientes = super.getIngredientes();
        ingredientes.add("Queijo");
        return (ingredientes);
    }
}
