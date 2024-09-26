// Classe Sanduiche base que define os ingredientes de um sanduíche
public class Sanduiche {
    private String pao;       // Tipo de pão do sanduíche
    private String queijo;    // Tipo de queijo
    private String presunto;  // Tipo de presunto
    private String salada;    // Indicação se o sanduíche tem ou não salada

    // Construtor que recebe os ingredientes e monta o sanduíche
    public Sanduiche(String pao, String queijo, String presunto, String salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
    }

    // Método toString() para representar o sanduíche como uma string legível
    @Override
    public String toString() {
        return "Sanduiche{" +
                "pao='" + pao + '\'' +
                ", queijo='" + queijo + '\'' +
                ", presunto='" + presunto + '\'' +
                ", salada='" + salada + '\'' +
                '}';
    }
}
