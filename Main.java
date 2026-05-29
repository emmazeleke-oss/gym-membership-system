import java.util.Scanner;

class Member {

    private String name;
    protected String phone;
    public int age;

    Member(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    void showPackage() {
        System.out.println(getName() + " has Basic Membership");
    }

    void showPackage(String message) {
        System.out.println(message);
    }
}

class VIPMember extends Member {

    VIPMember(String name, String phone, int age) {
        super(name, phone, age);
    }

    @Override
    void showPackage() {
        System.out.println(getName() + " has VIP Membership");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your phone number: ");
        String phone = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Choose membership (1 = Basic, 2 = VIP): ");
        int choice = input.nextInt();

        Member m;

        if (choice == 1) {
            m = new Member(name, phone, age);
        } else {
            m = new VIPMember(name, phone, age);
        }

        System.out.println("\n--- Membership Result ---");

        m.showPackage();  // prints membership type

        System.out.println("Thank you for joining the gym!"); // ALWAYS prints
    }
}