package Assignments.Factory.Assignment2;

public abstract class DocumentProcessor {

    public int Documentname;


    public  DocumentProcessor(int documentname){
        this.Documentname = documentname;

    }

    public int getDocumentname() {
        return Documentname;
    }

    public abstract void processDocument();


    public abstract DocumentType supportsType();
}
