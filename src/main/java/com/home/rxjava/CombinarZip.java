package com.home.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class CombinarZip {

    /*public static void main(String[] args) {
        //El flujo termina apenas el observable con menos valores termine su flujo
        Observable<Integer> obs1 = Observable.just(1,2,3,4);
        Observable<String> obs2 = Observable.just("A","B","C");
        Observable.zip(obs1,obs2, (num,let)->"numero "+ num +" letra "+let)
                .subscribe(resultado-> System.out.println(resultado));
    }*/
}
