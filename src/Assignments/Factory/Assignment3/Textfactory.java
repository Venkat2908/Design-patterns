package Assignments.Factory.Assignment3;

import Assignments.Factory.Assignment2.TextDocumentprocessor;

public class Textfactory extends Documentfactory {
    @Override
    public DocumentProcessor createprocesor(String document) {
        return new TextDocument(document);
    }

    @Override
    public DocumentParser createparser(String path) {
        return new TestDocumentParser(path);
    }

    @Override
    public DocumentPrinter createprinter(DocumentProcessor documentProcessor) {
        return new Textprinter(documentProcessor);
    }
}
