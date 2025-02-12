import java.util.Scanner;
class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
class TaskCircularList {
    private Task head = null, tail = null;

    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
            return;
        }
        newTask.next = head;
        head = newTask;
        tail.next = head;
    }
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
            return;
        }
        tail.next = newTask;
        tail = newTask;
        tail.next = head;
    }
    public void addTaskAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        if (position <= 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        int count = 1;
        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }
        if (temp.next == head) {
            addTaskAtEnd(taskId, taskName, priority, dueDate);
            return;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }
    public void removeTask(int taskId) {
        if (head == null) return;
        if (head.taskId == taskId) {
            if (head == tail) {
                head = tail = null;
                return;
            }
            head = head.next;
            tail.next = head;
            return;
        }
        Task temp = head;
        do {
            if (temp.next.taskId == taskId) {
                temp.next = temp.next.next;
                if (temp.next == head) tail = temp;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }
    public void viewCurrentTask() {
        if (head != null) {
            System.out.println("Current Task: " + head.taskName + " (Priority: " + head.priority + ")");
            head = head.next;
        }
    }
    public void searchTaskByPriority(int priority) {
        Task temp = head;
        if (temp == null) return;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.taskName + " - Due: " + temp.dueDate);
            }
            temp = temp.next;
        } while (temp != head);
    }
    public void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.taskId + ": " + temp.taskName + " (Priority: " + temp.priority + ", Due: " + temp.dueDate + ")");
            temp = temp.next;
        } while (temp != head);
    }
}
public class TaskScheduler {
    public static void main(String[] args) {
        TaskCircularList taskList = new TaskCircularList();
        Scanner scanner = new Scanner(System.in);

        taskList.addTaskAtEnd(1, "Task A", 3, "2025-02-15");
        taskList.addTaskAtBeginning(2, "Task B", 1, "2025-02-10");
        taskList.addTaskAtPosition(3, "Task C", 2, "2025-02-12", 2);
        taskList.displayTasks();

        System.out.println("Enter Task ID to remove: ");
        int taskId = scanner.nextInt();
        taskList.removeTask(taskId);
        taskList.displayTasks();

        System.out.println("Viewing current task...");
        taskList.viewCurrentTask();
        taskList.displayTasks();

        System.out.println("Enter Priority to search: ");
        int priority = scanner.nextInt();
        taskList.searchTaskByPriority(priority);
    }
}
