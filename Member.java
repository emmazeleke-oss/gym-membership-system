public class Member {

    private String name;
    protected String phone;
    public int age;

    public Member(String name, String phone, int age) {
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
