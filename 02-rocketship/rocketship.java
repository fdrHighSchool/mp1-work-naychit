public class rocketship{

    public static void main (String[]arg){
        triangle();
        line();
        square();
        line();
        square();
        line();
        square();
        line();
        triangle();
    }//main

    public static void triangle() {
            System.out.println("   /\\    ");
            System.out.println("  /  \\   ");
            System.out.println(" /    \\  ");
         }//cone
    public static void line(){
        System.out.println("+------+");
    }//horizontal
    public static void square(){
            System.out.print("|");
            System.out.print("      ");
            System.out.println("|");
            System.out.print("|");
            System.out.print("      ");
            System.out.println("|");
        }//vertical
    public static void text(){
            System.out.print("|");
            System.out.print("      ");
            System.out.println("|");
             System.out.print("|");
            System.out.print("      ");
            System.out.println("|");
    }



}