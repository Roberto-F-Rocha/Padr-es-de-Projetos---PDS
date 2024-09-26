public class XMLReaderFactoryA extends XMLReaderFactory {
    @Override
    public XMLReader createXMLReader() {
        return new XMLReaderImplA();
    }
}
