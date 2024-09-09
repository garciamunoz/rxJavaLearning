package com.home.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class InicioRxJava {

    public static void main(String[] args) {
        //Primer ejemplo de creacion de Observable
        Observable.just(1,2,3).
                subscribe(System.out::println);
    }
}
