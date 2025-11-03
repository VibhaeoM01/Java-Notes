public class Person {
    private String fname;
    private String lname;
    Person(String fname,String lname)
    {
        this.fname=fname;
        this.lname=lname;
    }
    @Override
    public String toString() // No need to call this function, first of all, toString function is always there when object is created by default, so as we made another, we overriden it, but still we don't need to call function explicitly
    {
        return fname + " " + lname;
    }

    public static void main(String[] args) {
        Person p= new Person("Vibhaeo", "Mudia");
        // System.out.println(p);
    }
}
