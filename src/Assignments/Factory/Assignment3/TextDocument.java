package Assignments.Factory.Assignment3;

public class TextDocument extends DocumentProcessor {

    public  TextDocument(String document){
        super(document);
    }
    @Override
    public void processDocument() {
        System.out.println("it print the below documnet in text "+getDocument());

    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
