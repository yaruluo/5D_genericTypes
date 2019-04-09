/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    
    public int compareTo( Object otherObj){
        // tell the compiler otherObj is a Date
        Date other = (Date) otherObj;
        
        /* Comparing days-since-epoch would be classier,
           but this is too good an opportunity to revel
           in the features of ISO 8601
         */
        return toString().compareTo( other.toString());
    }

    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}
