public class XMLReaderFactoryB extends XMLReaderFactory {
    @Override
    public XMLReader createXMLReader() {
        return new XMLReaderImplB();
    }
}
