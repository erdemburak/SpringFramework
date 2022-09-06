package com.burakerdem.qualifier;

@QualifierMultiple
public class Patron2 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "sürüm(QualifierMultiple 1): " + data;
    }
}
