/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "VALID COMPARISONS");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // earlier date
        Date unixEpoch = new Date( 1970, 01, 01);
        reportRelationship( "earlier date"
          , unixEpoch
          , new Date( 2001, 01, 01)
          , "negative int");

        System.out.println( "---- end of valid comparisons ----");
        

        System.out.println( System.lineSeparator()
                          + "BROKEN COMPARISON");
        reportRelationship( "Point and Date", p0, unixEpoch, "nonsensical");
        System.out.println( "---- end of broken comparisons ----");
    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship 
      ( String description
      , Comparable a
      , Comparable b
      , String expect
      ) {
        System.out.println( description);

        // check 
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* expecting a compiler warning: 
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */
          
          + " ...expecting " + expect
          + System.lineSeparator());
     }
}
