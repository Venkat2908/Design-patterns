package Assignments.Prototype.Assignment2;

import java.util.HashMap;

public class InvoiceregisterimplImpl implements InvoiceprotypeRegistery {

    HashMap <InvoiceType,Invoice> map = new HashMap<>();
    @Override
    public void addPrototype(Invoice user) {

        map.put(user.getType(),user);

    }

    @Override
    public Invoice getPrototype(InvoiceType type) {

        return map.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) throws  CloneNotSupportedException {

        return map.get(type).Clone();
    }
}
