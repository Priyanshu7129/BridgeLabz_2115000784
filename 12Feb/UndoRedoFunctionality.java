import java.util.Scanner;
class TextNode {
    String text;
    TextNode next;
    TextNode prev;

    public TextNode(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}
class TextEditor {
    private TextNode head;
    private TextNode tail;
    private TextNode current;
    private int historySize;
    private int maxHistory;

    public TextEditor(int maxHistory) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.historySize = 0;
        this.maxHistory = maxHistory;
    }
    public void addState(String text) {
        TextNode newNode = new TextNode(text);

        if (current != null && current.next != null) {
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        current = tail;
        historySize++;

        if (historySize > maxHistory) {
            head = head.next;
            head.prev = null;
            historySize--;
        }
    }
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.text);
        } else {
            System.out.println("No text available.");
        }
    }
}
public class UndoRedoFunctionality {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Text\n2. Undo\n3. Redo\n4. Display Current State\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter text: ");
                String text = scanner.nextLine();
                editor.addState(text);
            } else if (choice == 2) {
                editor.undo();
            } else if (choice == 3) {
                editor.redo();
            } else if (choice == 4) {
                editor.displayCurrentState();
            } else if (choice == 5) {
                break;
            }
        }
    }
}
