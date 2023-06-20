public class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Michel", true);
        Wilder wilder2 = new Wilder("Michelle", false);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
    }
}
