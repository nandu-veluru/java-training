class Vechicle {
    String name;
    int year;

    Vechicle(String n, int y) {
        name = n;
        year = y;
    }
    void display() {
        System.out.println(name + " " + year);
    }
}
public class VechicleDemo {
    public static void main(String[] args) {
        Vechicle v1 = new Vechicle("bike", 2021);
        Vechicle v2 = new Vechicle("car", 2023);
        Vechicle v3 = new Vechicle("Auto", 2019);

        v1.display();
        v2.display();
        v3.display();
    }
}