public abstract class XMLReaderFactory {
    public abstract XMLReader createXMLReader();

    // Método estático para obter a fábrica certa com base em um parâmetro.
    public static XMLReaderFactory getFactory(String type) {
        if (type.equalsIgnoreCase("A")) {
            return new XMLReaderFactoryA();
        } else if (type.equalsIgnoreCase("B")) {
            return new XMLReaderFactoryB();
        } else {
            throw new IllegalArgumentException("Tipo desconhecido");
        }
    }
}
