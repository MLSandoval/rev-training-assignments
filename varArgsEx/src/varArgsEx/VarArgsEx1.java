package varArgsEx;

public class VarArgsDemo {
	// A method that takes variable number of integer  arguments.
    static void fun(int ...a)
    {
        System.out.println("Number of arguments: " + a.length);
        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i + " ");
        System.out.println();
    }
 // Takes string as a argument followed by varargs
    static void fun2(String str, int ...a)
    {
        System.out.println("String: " + str);
        System.out.println("Number of arguments is: "+ a.length);
        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i + " ");
        System.out.println();
    }
    // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with different number  of parameters
        fun(100);         // one parameter
        fun(1, 2, 3, 4);  // four parameters
        fun();            // no parameter
        // Calling fun2() with different parameter
        fun2("Java Varargs", 100, 200);
        fun2("Inheritance", 1, 2, 3, 4, 5);
        fun2("Abstraction");
    }
}