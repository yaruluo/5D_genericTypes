/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        // tell the compiler otherObj is a Point
        Point other = (Point) otherObj;
        
        // reflexive (math term) comparisons require no arithmetic 
        if( this == other) return 0;
        else{
            // System.out.println( "debug: arithmetic comparison");

            // calculate "r2" vars as squared distance to origin
            double r2This = xcor * xcor + ycor * ycor;
            double r2Other = other.xcor * other.xcor
                           + other.ycor * other.ycor;
            return Double.compare( r2This, r2Other);
        }
    }

    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}
