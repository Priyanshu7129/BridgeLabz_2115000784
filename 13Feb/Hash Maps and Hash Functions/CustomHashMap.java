class CustomHashMap {
    class Node {
        int key, value;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;
    private Node[] map = new Node[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    void put(int key, int value) {
        int index = hash(key);
        if (map[index] == null) {
            map[index] = new Node(key, value);
        } else {
            Node curr = map[index];
            while (curr.next != null && curr.key != key) {
                curr = curr.next;
            }
            if (curr.key == key) {
                curr.value = value;
            } else {
                curr.next = new Node(key, value);
            }
        }
    }

    int get(int key) {
        int index = hash(key);
        Node curr = map[index];
        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return -1;
    }

    void remove(int key) {
        int index = hash(key);
        Node curr = map[index];
        if (curr == null) return;
        if (curr.key == key) {
            map[index] = curr.next;
            return;
        }
        while (curr.next != null && curr.next.key != key) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap hashMap = new CustomHashMap();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        System.out.println(hashMap.get(1));
        hashMap.remove(1);
        System.out.println(hashMap.get(1));
    }
}

