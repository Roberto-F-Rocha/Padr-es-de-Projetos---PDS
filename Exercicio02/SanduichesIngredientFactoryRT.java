// Fábrica concreta para a Lanchonete RT
public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory {
    @Override
    public PaoIF criarPao() {
        return new Pao("Bola"); // Retorna pão bola
    }

    @Override
    public QueijoIF criarQueijo() {
        return new Queijo("Cheddar"); // Retorna queijo cheddar
    }

    @Override
    public PresuntoIF criarPresunto() {
        return new Presunto("Peru"); // Retorna presunto de peru
    }

    @Override
    public SaladaIF criarSalada() {
        return new Salada("Sem Verdura"); // Retorna salada sem verduras
    }
}
