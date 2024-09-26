// Interface para a fábrica de ingredientes de sanduíches
public interface SanduichesIngredientFactory {
    PaoIF criarPao();        // Método para criar o tipo de pão
    QueijoIF criarQueijo();  // Método para criar o tipo de queijo
    PresuntoIF criarPresunto(); // Método para criar o tipo de presunto
    SaladaIF criarSalada();  // Método para criar o tipo de salada
}
