package Assignments.Factory.Assignment3;

public class Spreadsheetfactory extends Documentfactory {
    @Override
    public DocumentProcessor createprocesor(String document) {
        return new Spreadsheetprocessor(document);
    }

    @Override
    public DocumentParser createparser(String path) {
        return new SpreadsheetDocumentparser(path);
    }

    @Override
    public DocumentPrinter createprinter(DocumentProcessor documentProcessor) {
        return new SpreadsheetPrinter(documentProcessor);
    }
}
