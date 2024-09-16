package com.home.rxjava;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

public class EstrategiasBackPressure {
    public static void main(String[] args) throws InterruptedException{

        Observable<Integer> observable = Observable.range(1,1000000)
                .map( item ->{
                    Thread.sleep(1000);
                    return item;
                });
        Flowable<Integer> flowable = observable.toFlowable(BackpressureStrategy.BUFFER);
        flowable.subscribe(System.out::println);



    }
}
