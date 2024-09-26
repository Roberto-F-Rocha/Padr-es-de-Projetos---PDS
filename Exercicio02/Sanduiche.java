// Classe que representa um sanduíche
public class Sanduiche {
    private PaoIF pao;       // Tipo de pão do sanduíche
    private QueijoIF queijo;  // Tipo de queijo
    private PresuntoIF presunto;  // Tipo de presunto
    private SaladaIF salada;  // Tipo de salada

    // Construtor que recebe a fábrica de ingredientes
    public Sanduiche(SanduichesIngredientFactory factory) {
        this.pao = factory.criarPao(); // Cria o pão usando a fábrica
        this.queijo = factory.criarQueijo(); // Cria o queijo usando a fábrica
        this.presunto = factory.criarPresunto(); // Cria o presunto usando a fábrica
        this.salada = factory.criarSalada(); // Cria a salada usando a fábrica
    }

    // Método toString() para representar o sanduíche como uma string legível
    @Override
    public String toString() {
        return "Sanduiche{" +
                "pao='" + pao.getTipo() + '\'' +
                ", queijo='" + queijo.getTipo() + '\'' +
                ", presunto='" + presunto.getTipo() + '\'' +
                ", salada='" + salada.getDescricao() + '\'' +
                '}';
    }
}
