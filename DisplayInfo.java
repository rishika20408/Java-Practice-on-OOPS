public class DisplayInfo {

    void show(int a) {
        System.out.println("Integer value: " + a);
    }

    void show(String name) {
        System.out.println("String value: " + name);
    }

    void show(int a, String name) {
        System.out.println("Integer: " + a + ", Name: " + name);
    }

    public static void main(String[] args) {
        DisplayInfo obj = new DisplayInfo();

        obj.show(10);
        obj.show("Rishika");
        obj.show(20, "Java");
    }
} 
