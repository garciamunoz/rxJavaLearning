package com.home.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class ErrorManagementResume {
    //Se declara el metodo main
    /*public static void main(String[] args) {
        Observable<Integer> observable = Observable.just(1,2,3,4,5)
                            .map(item -> {
                                if(item == 3){
                                    throw new RuntimeException("El proceso generó error");
                                }
                                return item;
                            })
                            .onErrorResumeNext(throwable -> {
                                System.out.println("El error presentado fue "+ throwable.getMessage());
                                return Observable.just(9,10,11);
                            });
        observable.subscribe(
                item -> System.out.println("Recibido: " + item),
                error -> System.out.println("Error: " + error.getMessage()),
                () -> System.out.println("Completado")
        );
    }*/
}
