package com.home.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class ErrorManagement {
   /* public static void main(String[] args) {
            //Aqui se viene el rico codigo de manejo de errores
            // Se declara un Observable
        Observable<Integer> observable= Observable.just(1,2,3,4,5);
        observable.map( x ->{
                        if(x == 3){
                            throw new RuntimeException("Error");
                        }
                        return x;
                }).onErrorReturn(throwable -> -1).subscribe(
                        y -> System.out.println("El valor emitido es : " + y),
                        error -> error.getMessage(),
                        ()-> System.out.println("proceso completado")
                );


    }*/
}
