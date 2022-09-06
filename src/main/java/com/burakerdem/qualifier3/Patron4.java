package com.burakerdem.qualifier3;

@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
public class Patron4 implements PatronInterface {
    @Override
    public String surum(String data) {
        return "sürüm(QualifierMultiple Enum UCUNCU): " + data;
    }
}
