import java.util.ArrayList;
import java.util.ListIterator; // to print each tool on different line


public class MyArrayList
{
    public static void main (String [] args)
    {
       ArrayList<String> minecraftEquip = new ArrayList<String>();

       minecraftEquip.add("Sword");
       minecraftEquip.add("Pickax");
       minecraftEquip.add("Shovel");
       minecraftEquip.add("Diamond Hoe");
       minecraftEquip.add("Crafting Table");

       // iterator object must be created after
       ListIterator it = minecraftEquip.listIterator(); // to print each tool on different line

       System.out.println(minecraftEquip);

       // while: to print each tool on different line.
       while(it.hasNext())
       {
           System.out.println("I have a " + it.next()); // returns boolean
       }//end while

        minecraftEquip.remove("Pickax");
       it = minecraftEquip.listIterator();
       System.out.println("______________Next Output______________");

        while(it.hasNext())
        {
            System.out.println("I have a " + it.next()); // returns boolean
        }//end 2nd while

        minecraftEquip.remove(3);
        it = minecraftEquip.listIterator();
        System.out.println("**************Next Output*****************");
        while(it.hasNext())
        {
            System.out.println("Now I have a " + it.next()); // returns boolean
        }//end 3rd while

        System.out.println("\nI have " + minecraftEquip.size() + " Items. ");
        for (int i = 0; i < minecraftEquip.size(); i ++)
        {
            System.out.println("The " + i + "th item is " + minecraftEquip.get(i));
        }// end fpr loop

        minecraftEquip.set(0,"Shirt");
        for (int i = 0; i < minecraftEquip.size(); i ++)
        {
            System.out.println("The " + i + "th item is " + minecraftEquip.get(i));
        }// end fpr loop

    }// end main method

}//end class
