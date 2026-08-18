package Assignments.Factory.Assignment2;

import javax.print.Doc;

public class SpreadSheetdocumentprocessor extends DocumentProcessor {

    public SpreadSheetdocumentprocessor(int document){
        super(document);
    }
    @Override
    public void processDocument() {
        System.out.println("it process the Spreadsheet documents");

    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
