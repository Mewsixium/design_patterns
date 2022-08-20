package factories;

import animals.*;
import animals.decorated.QuackCounter;
import animals.decorated.QuackEcho;

public class CountAndEchoDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck(){
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedHeadDuck(){
        return new QuackCounter(new QuackEcho(new RedHeadDuck()));
    }

    @Override
    public Quackable createDuckCall(){
        return new QuackCounter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck(){
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
