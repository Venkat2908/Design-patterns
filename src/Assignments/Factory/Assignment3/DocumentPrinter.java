package Assignments.Factory.Assignment3;

public abstract class DocumentPrinter {

    private DocumentProcessor documentProcessor;

    public DocumentPrinter(DocumentProcessor documentProcessor){
        this.documentProcessor = documentProcessor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}
