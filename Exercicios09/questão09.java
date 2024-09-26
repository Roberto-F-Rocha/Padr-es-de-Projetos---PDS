abstract class Agua {
    // Método template
    public final void preparar() {
        filtrar();
        engarrafar();
        adicionarElemento();
    }

    protected void filtrar(){
      System.out.println("Filtrando água.");
    }

    protected void engarrafar(){
      System.out.println("Engarrafando água.");
    }

    abstract void adicionaElemento();

}

class AguaGas extends Agua {
    
    protected void filtrar() {
        System.out.println("Filtrando água");
    }

    protected void engarrafar() {
        System.out.println("Engarrafando água");
    }

    @Override //unico metodo que subscreve
    protected void adicionaElemento() {
        System.out.println("adicionar gás.");
    }
}

class AguaSabor extends Agua {

    protected void filtrar() {
        System.out.println("Filtrando água.");
    }

    protected void engarrafar() {
        System.out.println("Engarrafando.");
    }

    @Override //mesma coisa aqui
    protected void adicionaElemento() {
        System.out.println("Adicionando sabor.");
    }
  
}
