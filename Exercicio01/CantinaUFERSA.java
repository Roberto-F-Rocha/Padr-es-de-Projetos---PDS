// Classe principal para testar a criação de sanduíches usando o Factory Method
public class CantinaUFERSA {
    public static void main(String[] args) {
        // Instancia uma fábrica para a Lanchonete CG
        SanduicheFactory cgFactory = new LanchoneteCGFactory();
        // Cria o sanduíche usando a fábrica e imprime o resultado
        Sanduiche cgSanduiche = cgFactory.criarSanduiche();
        System.out.println("Lanchonete CG: " + cgSanduiche);

        // Instancia uma fábrica para a Lanchonete JP
        SanduicheFactory jpFactory = new LanchoneteJPFactory();
        // Cria o sanduíche usando a fábrica e imprime o resultado
        Sanduiche jpSanduiche = jpFactory.criarSanduiche();
        System.out.println("Lanchonete JP: " + jpSanduiche);

        // Instancia uma fábrica para a Lanchonete RT
        SanduicheFactory rtFactory = new LanchoneteRTFactory();
        // Cria o sanduíche usando a fábrica e imprime o resultado
        Sanduiche rtSanduiche = rtFactory.criarSanduiche();
        System.out.println("Lanchonete RT: " + rtSanduiche);
    }
}
