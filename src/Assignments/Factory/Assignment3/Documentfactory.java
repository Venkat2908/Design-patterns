package Assignments.Factory.Assignment3;

public abstract class Documentfactory {

    public abstract DocumentProcessor createprocesor (String document);

    public abstract DocumentParser createparser (String path);
    public abstract  DocumentPrinter createprinter (DocumentProcessor  documentProcessor);

}
