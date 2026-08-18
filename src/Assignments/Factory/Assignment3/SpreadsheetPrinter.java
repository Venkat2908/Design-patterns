package Assignments.Factory.Assignment3;

public class SpreadsheetPrinter extends DocumentPrinter {

    static DocumentProcessor processor;
    public SpreadsheetPrinter (DocumentProcessor documentProcessor){
        super(documentProcessor);
    }
    @Override
    public void printDocument() {
        System.out.println("it print the below documnet in spreadsheet "+processor.getDocument());

    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
