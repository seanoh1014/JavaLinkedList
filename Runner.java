import java.util.*;

public class Runner {

    public static void main(String[] args) {

        SingleLinkedListStack stack = new SingleLinkedListStack();
        for (int i = 0; i < 10; i++) {
            stack.addFirst((int) (Math.random() * 10));
        }
        

    }
}
