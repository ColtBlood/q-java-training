package com.qualogy.training.codelabs.java;

public class Singleton {

    public SingletonVariant create_a_singleton_which_always_returns_the_same_instance(){
        return null;
    }
}


public abstract class SingletonVariant{
    static SingletonVariant getInstance(){
        throw new UnsupportedOperationException("Singleton not implemented");
    };
}
