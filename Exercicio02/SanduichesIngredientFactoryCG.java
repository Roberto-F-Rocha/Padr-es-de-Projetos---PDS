// Fábrica concreta para a Lanchonete CG
public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory {
    @Override
    public PaoIF criarPao() {
        return new Pao("Integral"); // Retorna um pão integral
    }

    @Override
    public QueijoIF criarQueijo() {
        return new Queijo("Prato"); // Retorna queijo prato
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
