package Assignments.Factory.Assignment2;

public class Documentprocessormain {
    public  static  void main (String [] args){
        DocumentProcessor documentProcessor = DocumentprocessorFactory.choosedocumenttype(DocumentType.SPREAD_SHEET,10);
        documentProcessor.processDocument();

    }
}
