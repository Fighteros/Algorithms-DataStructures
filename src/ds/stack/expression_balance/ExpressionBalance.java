package ds.stack.expression_balance;

import ds.Colorized;

import java.util.Scanner;
import java.util.Stack;

public class ExpressionBalance implements Colorized {

    public static boolean arePair(char open, char close){
        if((open == '(') && (close == ')')){
            return true;
        }else if((open == '[') && (close == ']')){
            return true;
        }else if ((open == '{') && (close == '}')){
            return true;
        }
        return false;
    }

    public static boolean isBalanced(String exp){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            if(exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '['){
                s.push(exp.charAt(i));
            }
            else if(exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']'){
                if(s.isEmpty() || !arePair(s.peek(), exp.charAt(i))){
                    return  false;
                }else {
                    s.pop();
                }
            }
        }
        return s.isEmpty()? true: false;
    }


    public static void main(String[] args) {
        String exp;
        System.out.println(ANSI_GREEN+ "Please Enter An Expression: "+ ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        exp = sc.next();
        if (isBalanced(exp)) {
            System.out.println(ANSI_GREEN + "Balanced" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Not Balanced" + ANSI_RESET);
        }
    }
}
