package com.home.rxjava;


import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class RefuerzoObservables {

    /*public static void main(String[] args) {
        //Creacion del objeto Observable
        Observable<Integer> observable = Observable.just(1,2,4);
        //Creación del Observer
        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("se suscribió");
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                System.out.println("elemento " + integer);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("se completó");
            }
        };

        observable.subscribe(observer);


    }*/
}
