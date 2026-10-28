package Assignments.Factory.Assignment3;

public class Spreadsheetprocessor extends DocumentProcessor {

    public Spreadsheetprocessor(String document){
        super(document);
    }
    @Override
    public void processDocument() {
        System.out.println("it print the below documnet in spreadsheet "+getDocument());
    }

    @Override
    public DocumentType supportsType() {
        return null;
    }
}
