import java.util.Scanner;
class Process {
    int processId;
    int burstTime;
    int priority;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
class RoundRobinScheduler {
    private Process head = null, tail = null;

    public void addProcessAtEnd(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
            return;
        }
        tail.next = newProcess;
        tail = newProcess;
        tail.next = head;
    }
    public void removeProcess(int processId) {
        if (head == null) return;
        if (head.processId == processId) {
            if (head == tail) {
                head = tail = null;
                return;
            }
            head = head.next;
            tail.next = head;
            return;
        }
        Process temp = head;
        do {
            if (temp.next.processId == processId) {
                temp.next = temp.next.next;
                if (temp.next == head) tail = temp;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }
    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) return;
        Process temp = head;
        while (true) {
            if (temp.burstTime > 0) {
                int executionTime = Math.min(timeQuantum, temp.burstTime);
                System.out.println("Executing Process " + temp.processId + " for " + executionTime + " units");
                temp.burstTime -= executionTime;
                if (temp.burstTime == 0) {
                    System.out.println("Process " + temp.processId + " completed.");
                    removeProcess(temp.processId);
                }
            }
            temp = temp.next;
            if (temp == null || temp == head) break;
        }
    }
    public void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println("Process " + temp.processId + " - Burst: " + temp.burstTime + " - Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}
public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        Scanner scanner = new Scanner(System.in);

        scheduler.addProcessAtEnd(1, 10, 2);
        scheduler.addProcessAtEnd(2, 15, 1);
        scheduler.addProcessAtEnd(3, 20, 3);
        scheduler.displayProcesses();

        System.out.println("Enter time quantum: ");
        int timeQuantum = scanner.nextInt();
        scheduler.simulateRoundRobin(timeQuantum);

        scheduler.displayProcesses();
    }
}
