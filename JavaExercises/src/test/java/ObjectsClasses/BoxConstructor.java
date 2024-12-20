package ObjectsClasses;

public class BoxConstructor {
    double width, height, depth;
    BoxConstructor() {
        width=height=depth=0;

    }

    BoxConstructor(double w, double h, double d) {
        width=w;
        height=h;
        depth=d;

    }
    BoxConstructor(double len) {
        width=height=depth=len;
    }

    double volume() {
        return(width*height*depth);
    }



}
