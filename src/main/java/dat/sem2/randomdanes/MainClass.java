package dat.sem2.randomdanes;

import java.util.List;

/**
 * The purpose of MainClass is to...
 * @author kasper
 */
public class MainClass {
    
    public static void main( String[] args ) {
        int numberOfDanes = 20; // default 
        if ( args.length > 0 ) {
            try {numberOfDanes = Integer.parseInt( args[0]);} 
            catch (NumberFormatException ex){}
        }
        List<Person> danes = PersonGenerator.persons( numberOfDanes );
        for ( Person dane : danes){
            System.out.println( dane.toString() );
            System.out.println( AddressGenerator.address() );
        }
        
    }

}
