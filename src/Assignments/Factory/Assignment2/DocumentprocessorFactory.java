package Assignments.Factory.Assignment2;

public class DocumentprocessorFactory {

    public static   DocumentProcessor choosedocumenttype(DocumentType documentType,int document){

        return switch (documentType){
            case TEXT -> new TextDocumentprocessor(document);
            case PRESENTATION -> new PresentationDocumentProcessor(document);
            case SPREAD_SHEET -> new SpreadSheetdocumentprocessor(document);
        };
    }
}
