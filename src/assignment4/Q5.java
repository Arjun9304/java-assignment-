//Q5)Implement multiple inheritance with default method inside interface.

package assignment4;

interface Clickable {
    default void click() {
        System.out.println("click");
    }
}

interface Accessible {
    default void access() {
        System.out.println("access");
    }
}
public class Q5 implements Clickable, Accessible {
    public static void main(String[] args) {
        Q5 button = new Q5();
        button.click();
        button.access();
    }

}