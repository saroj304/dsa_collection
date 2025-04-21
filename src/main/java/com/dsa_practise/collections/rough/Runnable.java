package com.dsa_practise.collections.rough;

public interface Runnable {
    abstract void run();
}

//before java 9

class Test {
    static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("anynomous inner class is called");

        }
    };

    Runnable runnable1 = () -> {
        System.out.println("anympus inner class is called");
    };

    public static void main(String[] args) {
        runnable.run();

    }


}