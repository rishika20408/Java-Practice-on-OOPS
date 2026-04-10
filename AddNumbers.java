class AddNumbers {
    void add(int a, int b) {
        System.out.println("Sum of 2 integers: " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 integers: " + (a + b + c));
    }
    void add(double a, double b) {
        System.out.println("Sum of 2 decimals: " + (a + b));
    }

    public static void main(String[] args) {
        AddNumbers obj = new AddNumbers();

        obj.add(5, 10);        
        obj.add(5, 10, 15);  
        obj.add(5.5, 2.5);    
    }
}