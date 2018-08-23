/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Casey Groves
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
    /**This is the EIEIO part*/
    public static void eieio() 
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }

    /**This is the "Had A" part*/
    public static void hadA(String animal) 
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }

    /**This is the "With a" part*/
    public static void withA(String sound) 
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    /**This is the part where you sing a whole verse*/
    public static void singIt(String animal, String sound) 
    {
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

    /**This is the part where you sing the whole song*/
    public static void main(String[] args) 
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our        song a title

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");
        
        // now see how easy it is to add some more animals  
        
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
