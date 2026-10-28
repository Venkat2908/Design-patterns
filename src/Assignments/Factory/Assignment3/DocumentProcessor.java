package Assignments.Factory.Assignment3;

public abstract class DocumentProcessor {

    private  final String document;

    public DocumentProcessor(String document){
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();

}
