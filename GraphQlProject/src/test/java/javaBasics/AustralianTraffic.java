package javaBasics;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic
{
public static void main (String[] args) {

    CentralTraffic aus=new AustralianTraffic();
    AustralianTraffic aus1=new AustralianTraffic();
    ContinentTraffic aus2=new AustralianTraffic();
    aus2.trainSymbol();
    aus1.workOnSymbol();
    aus.greenGo();
    aus.flashingYellow();
    aus.redStop();
}

    @Override
    public void greenGo() {
        System.out.println("Green go");
    }

    @Override
    public void redStop() {
        System.out.println("Red stops");

    }

    @Override
    public void flashingYellow() {
        System.out.println("Flashing yellow");
    }

    public void workOnSymbol() {
    System.out.println("walking");
    }

    @Override
    public void trainSymbol() {
        System.out.println("train symbol");
    }
}
