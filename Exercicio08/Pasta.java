import java.util.ArrayList;
import java.util.List;

// Objetos Compostos
public class Pasta implements Componente {
    private String nome;
    private List<Componente> filhos = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pasta: " + nome);
        for (Componente filho : filhos) {
            filho.exibirDetalhes();
        }
    }

    public void adicionar(Componente componente) {
        filhos.add(componente);
    }

    public void remover(Componente componente) {
        filhos.remove(componente);
    }
}
