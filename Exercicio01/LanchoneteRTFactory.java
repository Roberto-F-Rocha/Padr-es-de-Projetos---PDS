// Fábrica concreta para criar sanduíches da Lanchonete RT
public class LanchoneteRTFactory implements SanduicheFactory {
    // Implementação do método de criação específica para Lanchonete RT
    @Override
    public Sanduiche criarSanduiche() {
        // A Lanchonete RT faz sanduíches com pão bola, cheddar, presunto de peru e sem verdura
        return new Sanduiche("Bola", "Cheddar", "Peru", "Sem Verdura");
    }
}
