public class VariablesClass {

    int InstanceVariable = 10;

    static int StaticVariable = 30;

    public void classMethod() {
        int localVariable = 50;
        System.out.println("from Class Method");
        System.out.println("Instance Variable: " + InstanceVariable);
        System.out.println("Static Variable: " + StaticVariable);
        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {
        int MainVariable = 70;
        System.out.println("Main Variable: " + MainVariable);

        VariablesClass obj = new VariablesClass();
        obj.classMethod();
        System.out.println("From Main");
        System.out.println(obj.InstanceVariable);
        System.out.println(StaticVariable);
        System.out.println(MainVariable);

        // System.out.println(localVariable);

    }

}
