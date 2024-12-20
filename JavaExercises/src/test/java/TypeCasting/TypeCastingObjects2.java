package TypeCasting;

class Animal {


}

class Dog extends Animal {

}

class Cat extends Animal {

}


public class TypeCastingObjects2 {
    public static void main (String args[]){
//     Animal n=new Animal();
//        Animal n=new Dog();
//        Cat ct=(Cat) n; //conversion is possible; and there is some relationship between them

//        Dog dg=new Dog();
//        Cat ct=(Cat) dg; //no relationship between dog and cat (children)

//        Animal n=new Dog(); //the object should be animal or cat in this case (parent or the child specified)
//        Cat ct=(Cat) n; //assignment is not valid; it is valid if cat is stored in animal

//Rule 1, 2 ,3 satisfied
        Animal n=new Dog();
        Dog dg1=(Dog) n;


    }
}
