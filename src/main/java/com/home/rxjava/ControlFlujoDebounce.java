package com.home.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ControlFlujoDebounce {

    public static void main(String[] args) throws InterruptedException{
        //Aqui se ejemplifica el uso de debounce

        Observable observable = Observable.create( emitter ->{

            emitter.onNext(1);
            Thread.sleep(100);
            emitter.onNext(2);
            Thread.sleep(201);
            emitter.onNext(3);
            Thread.sleep(300);
            emitter.onNext(6);
            emitter.onComplete();
                });

        observable.debounce(200, TimeUnit.MILLISECONDS)
                .subscribe(System.out::println);


    }
}
