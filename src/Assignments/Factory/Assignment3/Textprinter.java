package Assignments.Factory.Assignment3;

public class Textprinter extends DocumentPrinter {

     static DocumentProcessor processor;
    public  Textprinter(DocumentProcessor documentProcessor){
        super(documentProcessor);
    }
    @Override
    public void printDocument() {

        System.out.println("it print the below documnet in text "+processor.getDocument());

    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
