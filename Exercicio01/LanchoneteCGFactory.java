// Fábrica concreta para criar sanduíches da Lanchonete CG
public class LanchoneteCGFactory implements SanduicheFactory {
    // Implementação do método de criação específica para Lanchonete CG
    @Override
    public Sanduiche criarSanduiche() {
        // A Lanchonete CG faz sanduíches com pão integral, queijo prato, presunto de frango e com verdura
        return new Sanduiche("Integral", "Prato", "Frango", "Com Verdura");
    }
}
