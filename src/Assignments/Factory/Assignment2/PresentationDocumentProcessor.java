package Assignments.Factory.Assignment2;

public class PresentationDocumentProcessor extends  DocumentProcessor {



    public  PresentationDocumentProcessor(int Document ){
        super(Document);
    }
    @Override
    public void processDocument() {
        System.out.println("it process the presentation documents");

    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.PRESENTATION;
    }
}
