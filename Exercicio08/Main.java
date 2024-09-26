public class Main {
    public static void main(String[] args) {
        Componente arquivo1 = new Arquivo("Diagrama de Classe PDS.pdf");
        Componente arquivo2 = new Arquivo("Documento de Requisito PDS.pdf");

        Pasta pasta1 = new Pasta("UFERSA");
        pasta1.adicionar(arquivo1);
        pasta1.adicionar(arquivo2);

        Componente arquivo3 = new Arquivo("Foto.png");
        Pasta pasta2 = new Pasta("PESSOAL");
        pasta2.adicionar(arquivo3);

        Pasta raiz = new Pasta("Meus Documentos");
        raiz.adicionar(pasta1);
        raiz.adicionar(pasta2);

        // Exibir detalhes da estrutura de arquivos e pastas
        raiz.exibirDetalhes();
    }
}
