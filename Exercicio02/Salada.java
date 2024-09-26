// Classe para representar a salada
public class Salada implements SaladaIF {
    private String descricao; // Descrição da salada

    public Salada(String descricao) {
        this.descricao = descricao; // Construtor que recebe a descrição da salada
    }

    @Override
    public String getDescricao() {
        return descricao; // Retorna a descrição da salada
    }
}
