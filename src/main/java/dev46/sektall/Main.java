package dev46.sektall; // Package

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    public static void main(String[] args) {
        System.out.println("Hello Dev46! Welcome to Dev46!");

        for (int i = 1; i <= 10; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        int age = 27;
        double salary = 79898.89;
        String name = "Dev46";

        System.out.println("Hey " + name + "! " +  "I am " + age + " and my monthly salary is Rs." + salary + "NPR.");
    }
}




