import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // Escolhe qual fábrica usar (A ou B)
            XMLReaderFactory factory = XMLReaderFactory.getFactory("A");

            // Cria o XMLReader correspondente
            XMLReader reader = factory.createXMLReader();

            // Configura o handler (simulado, sem implementação real)
            reader.setContentHandler(null);

            // Cria um InputStream de exemplo
            String xmlData = "<xml>Exemplo A</xml>";
            InputStream is = new ByteArrayInputStream(xmlData.getBytes());

            // Faz o parsing do InputStream
            reader.parse(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
