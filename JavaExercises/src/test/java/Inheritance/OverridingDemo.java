package Inheritance;



class Bank {
    double roi() {
        return 0;
    }
}

class ICICI extends Bank {
    double roi() {  //overriding method
        return 10.5;
    }
}

class SBI extends Bank {
    double roi() {  //overriding method
        return 12.5;
    }
}


public class OverridingDemo {
    public static void main (String args[]) {
        ICICI ic=new ICICI();
        double ici=ic.roi();
        System.out.println(ici); //10.5

        SBI sb=new SBI();
        double sbi=sb.roi();
        System.out.println(sbi); //12.5


    }
}
