package com.home.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class ErrorRetry {

    /*public static void main(String[] args) {
        Observable<Integer> observable = Observable.just(1,2,3,4,5)
                .map( item ->{
                    if(item == 3){
                        throw new RuntimeException("Error en el proceso");
                    }
                    return item;
                }).retry(2);
        observable.subscribe(
                item -> System.out.println("El valor emitido es : "+item),
                error -> System.out.println("El error es : "+ error),
                () -> System.out.println("Completado")

        );

    }*/
}
