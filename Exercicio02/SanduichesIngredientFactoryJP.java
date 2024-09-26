// Fábrica concreta para a Lanchonete JP
public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory {
    @Override
    public PaoIF criarPao() {
        return new Pao("Francês"); // Retorna pão francês
    }

    @Override
    public QueijoIF criarQueijo() {
        return new Queijo("Mussarela"); // Retorna queijo mussarela
    }

    @Override
    public PresuntoIF criarPresunto() {
        return new Presunto("Frango"); // Retorna presunto de frango
    }

    @Override
    public SaladaIF criarSalada() {
        return new Salada("Com Verdura"); // Retorna salada com verduras
    }
}
