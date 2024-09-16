package com.home.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ControlFlujoThrottleFirst {

    /*public static void main(String[] args) throws InterruptedException {
        Observable<Integer> observable = Observable.create(emitter -> {
            emitter.onNext(1);
            Thread.sleep(100);
            emitter.onNext(2);
            Thread.sleep(300);
            emitter.onNext(3);
            Thread.sleep(400);
            emitter.onNext(4);
            emitter.onComplete();
        });

        observable
                .throttleFirst(300, TimeUnit.MILLISECONDS) // Emite solo el primer valor en un intervalo de 300ms.
                .subscribe(value -> System.out.println("Recibido: " + value));
    }*/
}
