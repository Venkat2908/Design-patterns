package Assignments.Prototype.Assignment2;

public interface InvoiceprotypeRegistery {
    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type) throws CloneNotSupportedException;
}

