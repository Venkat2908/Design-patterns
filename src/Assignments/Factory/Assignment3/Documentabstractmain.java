package Assignments.Factory.Assignment3;

public class Documentabstractmain {
    public  static void main (String [] args){
        Documentfactory factory = new Spreadsheetfactory();
        factory.createparser("venkat/home/colon").parseDocument();
     DocumentProcessor value =   factory.createprocesor("Spreadsheetdocument");

    value.processDocument();



    }
}
