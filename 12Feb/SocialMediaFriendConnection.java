import java.util.Scanner;
class FriendNode {
    int friendId;
    FriendNode next;

    public FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
class User {
    int userId;
    String name;
    int age;
    FriendNode friends;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
    public void addFriend(int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        if (friends == null) {
            friends = newFriend;
        } else {
            FriendNode temp = friends;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newFriend;
        }
    }
    public void removeFriend(int friendId) {
        if (friends == null) return;
        if (friends.friendId == friendId) {
            friends = friends.next;
            return;
        }
        FriendNode temp = friends;
        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    public boolean hasFriend(int friendId) {
        FriendNode temp = friends;
        while (temp != null) {
            if (temp.friendId == friendId) return true;
            temp = temp.next;
        }
        return false;
    }
    public void displayFriends() {
        FriendNode temp = friends;
        System.out.print("Friends: ");
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int countFriends() {
        int count = 0;
        FriendNode temp = friends;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
class SocialNetwork {
    private User head;

    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }
    public User searchUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }
    public User searchUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }
    public void addFriendship(int userId1, int userId2) {
        User user1 = searchUserById(userId1);
        User user2 = searchUserById(userId2);
        if (user1 != null && user2 != null && userId1 != userId2) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        }
    }
    public void removeFriendship(int userId1, int userId2) {
        User user1 = searchUserById(userId1);
        User user2 = searchUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
        }
    }
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = searchUserById(userId1);
        User user2 = searchUserById(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }
        System.out.print("Mutual Friends: ");
        FriendNode temp1 = user1.friends;
        while (temp1 != null) {
            if (user2.hasFriend(temp1.friendId)) {
                System.out.print(temp1.friendId + " ");
            }
            temp1 = temp1.next;
        }
        System.out.println();
    }
    public void displayUserFriends(int userId) {
        User user = searchUserById(userId);
        if (user != null) {
            System.out.print("User: " + user.name + " ");
            user.displayFriends();
        }
    }
    public void countUserFriends(int userId) {
        User user = searchUserById(userId);
        if (user != null) {
            System.out.println("User: " + user.name + " has " + user.countFriends() + " friends.");
        }
    }
}
public class SocialMediaFriendConnection {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();
        Scanner scanner = new Scanner(System.in);

        network.addUser(1, "Ashutosh", 25);
        network.addUser(2, "Arpit", 28);
        network.addUser(3, "Rajnish", 22);
        network.addUser(4, "Roshan", 30);

        network.addFriendship(1, 2);
        network.addFriendship(1, 3);
        network.addFriendship(2, 4);

        System.out.println("Displaying Friend Lists:");
        network.displayUserFriends(1);
        network.displayUserFriends(2);
        network.displayUserFriends(3);
        network.displayUserFriends(4);

        System.out.println("\nFinding Mutual Friends between Alice (1) and Bob (2):");
        network.findMutualFriends(1, 2);

        System.out.println("\nCounting Friends:");
        network.countUserFriends(1);
        network.countUserFriends(2);

        System.out.println("\nRemoving Friendship between Alice (1) and Bob (2):");
        network.removeFriendship(1, 2);
        network.displayUserFriends(1);
        network.displayUserFriends(2);
    }
}
