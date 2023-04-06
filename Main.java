import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Action [012345] -> ");
            switch (in.nextInt()) {
                case 0:
                    System.out.println("Stack is " + (s.empty() ?
                            "empty" : "not empty"));
                    break;
                case 1:
                    s.clear();
                    break;
                case 2:
                    try {
                        System.out.print("Push int: ");
                        s.push(in.nextInt());
                    } catch(Exception e) {;}
                    break;
                case 3:
                    try {
                        System.out.println("Pop int " + s.pop());
                    } catch(Exception e) {;}
                    break;
                case 4:
                    try {
                        System.out.println("Top = " + s.top());
                    } catch(Exception e) {;}
                    break;
                case 5:
                    try{
                        System.out.println("Stack size = " + s.size());
                    }
                    catch (Exception e){;}
                    break;
                default:
                    System.out.println("Wrong action, ignore.");
            }
        }
    }
}