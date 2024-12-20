package ObjectsClasses;

public class EncapsulationConcept {
    //all the methods should be private;
    //all the variables should have getter&setter method
    //variable should be accessed only through method

    private int accno;  //we can access the variables  in the class; only by methods
    private String name;
    private double amount;

    public int getAccno() { //we can access everywhere because of public
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
