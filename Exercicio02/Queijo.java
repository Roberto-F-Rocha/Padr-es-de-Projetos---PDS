// Classe para representar o queijo
public class Queijo implements QueijoIF {
    private String tipo; // Tipo de queijo

    public Queijo(String tipo) {
        this.tipo = tipo; // Construtor que recebe o tipo de queijo
    }

    @Override
    public String getTipo() {
        return tipo; // Retorna o tipo de queijo
    }
}
