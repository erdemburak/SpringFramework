package com.burakerdem.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsilIs {

    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("ilk hali: " + context.getMethod().getName());

        //Kullanıcı : giriş yapmış mı?
        boolean isLogin = false; //True: Önce login olmalı Yol kesici olacak değişkenimiz
        // jdbc : session?
        Object isContinue = null; // Eğer yol kesilmemişse devam edeceğim

        if(isLogin){
            //Önce sisteme giriş yapsın
            System.out.println("!!! Önce sisteme giriş yapsın");
            return null;
        }else {
            try{

                isContinue = context.proceed(); // Devam etmesini sağlamak
                System.out.println("Sonraki hali " + isContinue);

            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }
    }

}
