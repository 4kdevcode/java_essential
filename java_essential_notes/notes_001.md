###### *notes_001.md*

### Notes 001

* ###### Package is the folder or container that holds Java files
* ###### The Java convention is for package names to be lowercase
* ###### Class names cannot contain spaces, eg: *java_essential*
* ###### Reserved keyword is the predefined keyword in the programming language.
* ###### Variable is the memory location that stores data, eg: int age;, string name; int phone = 987654321;
* ###### Java is statically typed language, where variable types must be declared before the program can be compiled.
* ###### Python & JavaScript are dynamically typed language, where variable types are determined at runtime through context in the code
* ###### Demonstration of Datatypes in the following Table

| Name    | Default  | Size   | Type           | Example           |
|---------|----------|--------|----------------|-------------------|
| byte    | 0        | 8-bit  | Integer        | byte b = 100;     |
| short   | 0        | 16-bit | Integer        | short s = 10000;  |
| int     | 0        | 32-bit | Integer        | int i = 100000;   |
| long    | 0L       | 64-bit | Integer        | long l = 9999999; |
| float   | 0.0f     | 32-bit | Floating Point | float f = 123.4f; |
| double  | 0.0d     | 64-bit | Floating Point | double d = 12.4;  |
| boolean | FALSE    | 1-bit  | Boolean        | boolean b = true; |
| char    | '\u0000' | 16-bit | Character      | char c = 'C';     |

* ###### Local variable is the variable that is declared within the method.

    ```java
    // Defining global Variable
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello Dev46! Welcome to Dev46!");
            
            // global Variable
            int age = 27;
  
            String info() {
                System.out.println("This is an information");
                
                // Local Variable
                String name = "Dev46";
  
                return name;
            }
        }
    }

* ###### Variable Naming Rules in Java 
  ```markdown
  Variable Naming Rules in Java
  * Cannot contain spaces (eg: ageGroup)
  * Can contain numbers (eg: age1)
  * Cannot start with a number (eg: 1age)
  * Can contain some special characters (eg: age-group, age_group)
  * Cannot be reserved keywords (eg: class, main, String etc.)

* ###### Type Inference is only allowed in Local Variable, eg: var isWaterWet = true;

