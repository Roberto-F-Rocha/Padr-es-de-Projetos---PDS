import java.io.InputStream;
import java.io.IOException;
import org.xml.sax.ContentHandler;

public class XMLReaderImplA implements XMLReader {
    private ContentHandler handler;

    @Override
    public void setContentHandler(ContentHandler handler) {
        this.handler = handler;
        System.out.println("Handler definido em XMLReaderImplA");
    }

    @Override
    public void parse(InputStream is) throws IOException {
        if (is == null) {
            throw new IOException("InputStream não pode ser nulo");
        }
        System.out.println("Parsing em XMLReaderImplA");
        // Simulação de leitura
        int data = is.read();
        while (data != -1) {
            System.out.print((char) data);
            data = is.read();
        }
        System.out.println();
    }
}
