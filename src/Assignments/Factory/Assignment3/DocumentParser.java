package Assignments.Factory.Assignment3;

public abstract class DocumentParser {
    private final String path;

    protected DocumentParser(String path){
        this.path = path;
    }

    public abstract void parseDocument();
    public abstract DocumentType supportsType();
}
