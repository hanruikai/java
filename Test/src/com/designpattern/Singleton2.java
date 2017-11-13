package com.designpattern;

public class Singleton2
{
    
    private Singleton2(){
        
    }
    
    private static class SingletonHolder{
        
        private static Singleton2 instance=new Singleton2();
        
    }
    
    public Singleton2 getInstance(){
        
        return SingletonHolder.instance;
    }

}
