public class RemoveWhiteSpaces {

    public static void main (String args[]){
        String s="Java  programming  selenium";
        String str=s.replaceAll("\\s",""); //s -it means white spaces
        System.out.println("After removing white spaces" + str); //Javaprogrammingselenium
    }
}
