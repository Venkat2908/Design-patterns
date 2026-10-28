package Assignments.Factory.Assignment3;

import Assignments.Factory.Assignment2.TextDocumentprocessor;

public class TestDocumentParser extends DocumentParser {

    public TestDocumentParser(String path){
        super(path);
    }
    @Override
    public void parseDocument() {
        System.out.println("it parse text Document");

    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
