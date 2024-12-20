package ObjectsClasses;

public class EncapsulationConceptMain {

    public static void main (String args[]) {

        EncapsulationConcept acc=new EncapsulationConcept();
        acc.setAccno(15372);
        acc.setName("Mary");
        acc.setAmount(235723);

        System.out.println(acc.getAccno());
        System.out.println(acc.getName());
        System.out.println(acc.getAmount());
    }
}
