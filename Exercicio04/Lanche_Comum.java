import java.util.List;

/*Classe concreta*/

public class Lanche_Comum implements Lanche_Interface{
    private String nome; 
    private double preco;
    private List<String> ingredientes;

    public Lanche_Comum(String nome, double preco, List<String> ingredientes){
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }

    @Override
    public String getNome(){
        return (nome);
    }

    @Override
    public double getPreco(){
        return (preco);
    }

    @Override
    public List<String> getIngredientes(){
        return (ingredientes);
    }
}