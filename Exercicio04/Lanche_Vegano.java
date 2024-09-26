import java.util.List;

/*Decorator concreto*/

public class Lanche_Vegano extends Lanche_Decorator{
    public Lanche_Vegano(Lanche_Interface lanche){
        super(lanche);
    }

    @Override
    public String getNome(){
        return (super.getNome() + " Vegano");
    }

    @Override
    public double getPreco(){
        return (super.getPreco() + 3.0);
    }

    @Override
    public List<String> getIngredientes(){
        List<String> ingredientes = super.getIngredientes();
        ingredientes.remove("Carne");
        ingredientes.add("Tofu");
        return (ingredientes);
    }
}
