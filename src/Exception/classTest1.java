package Exception;

public class classTest1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        String a = null;
        try{
            System.out.println(arr[5]);
            System.out.println(a.length());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Range out.");
        } catch (NullPointerException e){
            System.out.println("String with value null don't have length ");
        }



    }




}
