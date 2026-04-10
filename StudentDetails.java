class StudentDetails {

    String name;
    int age;

    StudentDetails() {
        name = "Unknown";
        age = 0;
    }

    StudentDetails(String n) {
        name = n;
        age = 18;
    }

    StudentDetails(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails("Rishika");
        StudentDetails s3 = new StudentDetails("Pritha", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}