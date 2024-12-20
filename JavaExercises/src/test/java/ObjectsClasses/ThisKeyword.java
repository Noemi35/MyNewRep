package ObjectsClasses;

public class ThisKeyword {

    int x, y; // variables of the class

    void setData(int x, int y) { //local variable
        this.x=x; //we use this keyword to differentiate
        this.y=y;


    }

    ThisKeyword (int x, int y) { //constructor
        this.x=x; //we use this keyword to differentiate
        this.y=y;
    }

    void printData() {
        System.out.println(x+" "+y);
    }

    public static void main(String args[]) {
//        ThisKeyword ths=new ThisKeyword();
//        ths.setData(10,20);
//        ths.printData();

        ThisKeyword love=new ThisKeyword(10,29);
        love.printData(); //10, 29
    }
}
