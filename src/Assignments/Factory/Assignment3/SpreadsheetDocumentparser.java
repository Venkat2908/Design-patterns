package Assignments.Factory.Assignment3;

public class SpreadsheetDocumentparser extends DocumentParser {

    public  SpreadsheetDocumentparser(String path){
        super(path);
    }
    @Override
    public void parseDocument() {

        System.out.println("it prints the Spreadsheet doument parse");

    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
