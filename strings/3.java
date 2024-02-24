public class  strings3{
    double width;

double height;

double depth;

strings3(double w, double h, double d) {

width = w;

height = h;

depth = d;

}

public String toString() {

return "Dimensions are " + width + " by " +

depth + " by " + height + ".";

}
    
}
class toStringDemo {

    public static void main(String args[]) {
    
    strings3 b = new strings3(10, 12, 14);
    
    String s = "Box b: " + b; // concatenate Box object
    
    System.out.println(b); // convert Box to string
    
    System.out.println(s);
    
    }
    
    }
