//primeiro subsystema
class Subsystem1 {
    public void operation1() {
        System.out.println("Subsystem1: Realizando a operação 1");
    }
}

//segundo subsystema
class Subsystem2 {
    public void operation2() {
        System.out.println("Subsystem2: Realizando a operação 2");
    }
}

// aqui está a classe facade que atua como a interface simples que os clientes utilizam para interagir
// com o sistema. Ela oculta as interações complexas com os subsistemas e oferece métodos simplificados.
class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    // aqui é onde inicia e gerencia os subsistemas
    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }

    // primeiro Método simplificado que chama os subsistemas
    public void OperationA() {
        System.out.println("Facade: Iniciando a operação A");
        subsystem1.operation1();  // Chama a operação do Subsystem1
        subsystem2.operation2();  // Chama a operação do Subsystem2
        System.out.println("Facade: Operação A completa");
    }

    // segundo método do Facade que chama operações de múltiplos subsistemas
    public void OperationB() {
        System.out.println("Facade: Iniciando a operação B");
        subsystem2.operation2();  // Chama apenas a operação do Subsystem2
        System.out.println("Facade: Operação B completa");
    }
}

