package Exception;

public class classFirstWeshoolExample {
    public static void main(String[ ] args) {
      /*  int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!
    }


    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at Main.main(Main.java:4)
        */

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

}
