class RectangleArea {

    int length, breadth;
    RectangleArea() {
        length = 1;
        breadth = 1;
    }

    RectangleArea(int side) {
        length = side;
        breadth = side;
    }

    RectangleArea(int l, int b) {
        length = l;
        breadth = b;
    }

    void displayArea() {
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {
        RectangleArea r1 = new RectangleArea();
        RectangleArea r2 = new RectangleArea(5);
        RectangleArea r3 = new RectangleArea(4, 6);

        r1.displayArea();
        r2.displayArea();
        r3.displayArea();
    }
}