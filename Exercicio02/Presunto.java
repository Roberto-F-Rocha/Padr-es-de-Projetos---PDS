// Classe para representar o presunto
public class Presunto implements PresuntoIF {
    private String tipo; // Tipo de presunto

    public Presunto(String tipo) {
        this.tipo = tipo; // Construtor que recebe o tipo de presunto
    }

    @Override
    public String getTipo() {
        return tipo; // Retorna o tipo de presunto
    }
}
