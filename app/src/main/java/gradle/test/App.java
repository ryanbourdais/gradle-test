/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.test;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(Calculator.Addition(2, 4));
        System.out.println(Calculator.Subtraction(2, 4));
        System.out.println(Calculator.Multiplication(2, 4));
        System.out.println(Calculator.Division(2, 4));
    }
}
