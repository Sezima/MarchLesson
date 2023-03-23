package Exception;

public class classFirstNewEx {
    public static void main(String[] args) {
        String a = null;

        try {
            System.out.println(a.length());
        } catch (ArithmeticException e) {
            System.out.println("Something wrong in int");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
        } catch (Exception e) {
            System.out.println("Some");
        } finally {
            System.out.println("The end");
        }
    }
}
