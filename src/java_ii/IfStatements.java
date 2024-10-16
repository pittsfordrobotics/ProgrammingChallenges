package java_ii;

public class IfStatements {
    public static void main(String[] args) {
        // Remember booleans? THEY'RE BACK
        // This is where programming gets actually useful. You can execute some code only if a certain condition is met.
        // Say you want to move a robot only if the joystick is pushed forward. Let's do that:
        boolean joystickForward = true;
        if (joystickForward) {
            System.out.println("Moving robot forward");
        }

        // There are also else statements, which execute code if the condition is false.
        joystickForward = false;
        if (joystickForward) {
            System.out.println("Moving robot forward");
        } else {
            System.out.println("Robot is stationary. Robot is sad");
        }

        // BUT what if you want to move the robot forward if the joystick is pushed forward,
        // and backward if it's pushed backward? You could do something like this:
        boolean joystickBackward = true;
        if(joystickForward) {
            System.out.println("Moving robot forward");
        } else {
            if(joystickBackward) {
                System.out.println("Moving robot backward");
            }
        }

        // But this is so common that Java lets you do it a bit more concisely:
        if(joystickForward) {
            System.out.println("Moving robot forward");
        } else if(joystickBackward) {
            System.out.println("Moving robot backward");
        }

        // You can also use the && operator to check if multiple conditions are true.
        if(joystickForward && joystickBackward) {
            System.out.println("Hang on what");
        }

        //Or the || operator to check if at least one condition is true.
        if(joystickForward || joystickBackward) {
            System.out.println("Moving robot");
        }

        // You can also use equalities and inequalities.
        double pi = 3.14159;
        if(pi == 3) {
            System.out.println("oh no");
        } else if (pi > 3) {
            System.out.println("everything is normal but also boring");
        }

        if(pi != 3) {
            System.out.println("still ok");
        }

        if(pi <= 3) {
            System.out.println("wait");
        }


        // EXERCISES

        // 1. Declare an int variable and write an if statement that checks if it's even.
        int n = 4;
        if (n%2 == 0){
            System.out.println("EVENNNN");
        }else{
            System.out.println("ODD :(");
        }
        // 2. Write an if statement that checks if the variable's odd. (You can use the same variable)
        if (n%2 == 1){
            System.out.println("but it's okay to be odd idk");
        }
        // 3. Actually you know what? Just write anything you want here. (With an if statement; we're not that generous)
        if (pi == 10) System.out.println("found the engineer");
    }
}
