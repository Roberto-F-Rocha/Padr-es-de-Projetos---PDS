// Fábrica concreta para criar sanduíches da Lanchonete JP
public class LanchoneteJPFactory implements SanduicheFactory {
    // Implementação do método de criação específica para Lanchonete JP
    @Override
    public Sanduiche criarSanduiche() {
        // A Lanchonete JP faz sanduíches com pão francês, mussarela, presunto de frango e com verdura
        return new Sanduiche("Francês", "Mussarela", "Frango", "Com Verdura");
    }
}
