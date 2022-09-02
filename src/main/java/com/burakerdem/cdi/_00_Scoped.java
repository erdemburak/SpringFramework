package com.burakerdem.cdi;

// Kapsam
// Yaşam Süresi
// Performansı + - etkileyecektir

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
// @ApplicationScoped //Bütün uygulama boyunca çalışıyor (Tüm kullanıcılar için)
// @RequestScoped // 1 istek boyunca çalışır
// @SessionScoped // 1 Kullanıcı için yaşar ancak logout oldugu zaman çıkış sağlanmış olur (implement Serializable)
// @Dependent // bukalemun
// @ConversationScoped // belli istek boyunca yaşar
// @SessionScoped // Bean 1 instanse olmasını sağlamak için
public class _00_Scoped {
}
