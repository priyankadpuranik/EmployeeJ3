public class emp {
    String name;
    int id;
    float salary;

    public emp(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee details: ");
        System.out.println("Nmae: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        emp e1 = new emp("abc", 52, 50000);
        e1.display();
    }
}
