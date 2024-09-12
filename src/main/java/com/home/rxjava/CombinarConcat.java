package com.home.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class CombinarConcat {
    public static void main(String[] args) {
        Observable<Integer> obs1 = Observable.just(1,2,3);
        Observable<Integer> obs2 = Observable.just(7,8,9);
        Observable.concat(obs1,obs2)
                .subscribe(System.out::println);
    }
}
