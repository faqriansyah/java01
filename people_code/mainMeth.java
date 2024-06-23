package people_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class mainMeth {

    public static void main(String[] args) throws FileNotFoundException {
        File Polish = new File("fILE4INPUT.txt");
        File out = new File("outfile.txt");

        Scanner f = new Scanner(Polish);
        Queue inputQ = new Queue();
        Stack stack2 = new Stack();
        Queue outputQ = new Queue();

        String word;
        Character ch;

        while (f.hasNext()) {
            String myString = f.nextLine();

            for (int count = 0; count < myString.length(); count++) {
                ch = myString.charAt(count);
                inputQ.addtoRear(ch);
            }
            while (!inputQ.ismtQ()) {
                ch = inputQ.remfront();

                if (isAlpha(ch)) {
                    // System.out.println(ch);
                    outputQ.addtoRear(ch);
                } else {
                    if (isOperator(ch)) {

                        if (stack2.ismt()) {
                            stack2.push(ch);

                        } else {
                            if (valueOf(ch) > valueOf(stack2.top())) {
                                stack2.push(ch);
                            } else {
                                outputQ.addtoRear(stack2.pop());
                                stack2.push(ch);
                            }
                        }
                    }
                }
            }
            while (!stack2.ismt()) {
                outputQ.addtoRear(stack2.pop());
            }
            System.out.println(outputQ.toString() + "\n\n");
            while (!outputQ.ismtQ()) {
                outputQ.remfront();
            }

        }

    }

    public static boolean isAlpha(Character ch) {
        boolean retVal = false;
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
            retVal = true;

        return (retVal);
    }

    public static boolean isOperator(Character ch) {
        boolean retVal = false;
        if (ch == '+' || ch == '-' || ch == '/' || ch == '*')
            retVal = true;

        return (retVal);
    }

    public static int valueOf(Character ch) {
          int retval = 0;
          if (ch == '/' || ch == '*')
              retval = 2;
          else
              retval = 1;
          return retval;
      }
    }