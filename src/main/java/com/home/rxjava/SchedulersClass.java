package com.home.rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class SchedulersClass {

    public static void main(String[] args) throws InterruptedException{
        Observable<Integer> observable = Observable.just(1,2,3)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.computation());
        observable
                .subscribe(a -> System.out.println("el valor del hilo es "+ a +"el hilo es "+ Thread.currentThread().getName()));

        Thread.sleep(2000);
    }


}
