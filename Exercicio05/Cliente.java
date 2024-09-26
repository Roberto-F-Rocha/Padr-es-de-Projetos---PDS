// interação apenas com o Facade, sem precisar saber dos subsistemas internos
public class Cliente {
    public static void main(String[] args) {
        //criação de uma instância do Facade e usa seus métodos simplificados
        Facade facade = new Facade();

        // aqui é a chamada das operações no Facade, que gerencia os subsistemas
        facade.OperationA();
        System.out.println();
        facade.OperationB();
    }
}