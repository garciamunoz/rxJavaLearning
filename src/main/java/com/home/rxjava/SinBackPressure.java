package com.home.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class SinBackPressure {

    public static void main(String[] args) throws InterruptedException{
        // Se declara un flujo sin backpressure
        Observable<Integer> observable = Observable.range(1, 1000000)
                .map( item -> {
                            Thread.sleep(1000);
                            return item;
                        });
        observable.subscribe(System.out::println);
    }
}
