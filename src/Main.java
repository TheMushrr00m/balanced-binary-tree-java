import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Node root = new Node(10);
        root.add(5);
        root.add(15);
        root.add(8);

        Optional<Node> result = root.find(11);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Value not found");
        }

        result = root.find(8);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Value not found");
        }

        System.out.println("PrintInOrder");
        root.printInOrder();
        System.out.println("PrintPreOrder");
        root.printPreOrder();
        System.out.println("PrintPosOrder");
        root.printPosOrder();
    }
}