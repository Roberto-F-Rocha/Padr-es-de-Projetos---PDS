// Classe principal para testar a criação de sanduíches usando o padrão Abstract Factory
public class CantinaUFERSA {
    public static void main(String[] args) {
        // Instancia uma fábrica de ingredientes para a Lanchonete CG
        SanduichesIngredientFactory cgFactory = new SanduichesIngredientFactoryCG();
        // Cria o sanduíche usando a fábrica de ingredientes e imprime o resultado
        Sanduiche cgSanduiche = new Sanduiche(cgFactory);
        System.out.println("Lanchonete CG: " + cgSanduiche);

        // Instancia uma fábrica de ingredientes para a Lanchonete JP
        SanduichesIngredientFactory jpFactory = new SanduichesIngredientFactoryJP();
        // Cria o sanduíche usando a fábrica de ingredientes e imprime o resultado
        Sanduiche jpSanduiche = new Sanduiche(jpFactory);
        System.out.println("Lanchonete JP: " + jpSanduiche);

        // Instancia uma fábrica de ingredientes para a Lanchonete RT
        SanduichesIngredientFactory rtFactory = new SanduichesIngredientFactoryRT();
        // Cria o sanduíche usando a fábrica de ingredientes e imprime o resultado
        Sanduiche rtSanduiche = new Sanduiche(rtFactory);
        System.out.println("Lanchonete RT: " + rtSanduiche);
    }
}
