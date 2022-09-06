package com.burakerdem.qualifier3;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {
    //@Alternative : Aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    @Override
    public String surum(String data) {
        return "sürüm(Default data): " + data;
    }
}
