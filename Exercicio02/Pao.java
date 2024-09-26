// Classe para representar o pão
public class Pao implements PaoIF {
    private String tipo; // Tipo de pão

    public Pao(String tipo) {
        this.tipo = tipo; // Construtor que recebe o tipo de pão
    }

    @Override
    public String getTipo() {
        return tipo; // Retorna o tipo de pão
    }
}
