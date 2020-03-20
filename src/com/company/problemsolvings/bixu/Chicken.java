package com.company.problemsolvings.bixu;

import java.util.concurrent.Callable;

interface Bird {
    Egg lay() throws Exception;
}
public class Chicken implements Bird {

    public Chicken() throws Exception {

    }

    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getName());

        Chicken chicken = new Chicken();
        Egg egg = chicken.lay();
        System.out.println(chicken instanceof Bird);
        Bird chicken1 = egg.hatch();
        Bird chicken2 = egg.hatch();

    }


    @Override
    public Egg lay() throws Exception {
        Callable<Bird> birdCallable = new Callable<Bird>() {
            @Override
            public Bird call() throws Exception {
                System.out.println(Thread.currentThread().getName());
                return new Chicken();
            }
        };
        return new Egg(birdCallable);
    }
}

class Egg {

    private boolean hatched;
    Callable<Bird> createBird;
    public Egg(Callable<Bird> createBird) throws Exception {
        this.createBird = createBird;
    }

    public Bird hatch() throws Exception {
        if(hatched){
            throw new ClassCastException("Already hatched");
        }
        hatched = true;
        return createBird.call();
    }
}
