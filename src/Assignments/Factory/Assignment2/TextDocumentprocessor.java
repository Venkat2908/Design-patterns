package Assignments.Factory.Assignment2;

public class TextDocumentprocessor extends DocumentProcessor {

    public TextDocumentprocessor(int document){
        super(document);
    }
    @Override
    public void processDocument() {
        System.out.println("it process the text  documents");

    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
