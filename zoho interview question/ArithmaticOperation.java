public class ArithmaticOperation {

    public static void add(int op1, int op2){
        String str = "Addition " ;
        str += (op1 < 0)? "(" + op1 + ")" : Integer.toString(op1) ;
        str += " + ";
        str += (op2 < 0)? "(" + op2 + ")" : Integer.toString(op2) ;
        System.out.print(str + "=" + (op1 + op2) + ", ");
        sub(op1, op2);
    }

    public static void sub(int op1, int op2){
        String str = "subtraction " ;
        str += (op1 < 0)? "(" + op1 + ")" : Integer.toString(op1) ;
        str += " - ";
        str += (op2 < 0)? "(" + op2 + ")" : Integer.toString(op2) ;
        System.out.print(str + "=" + (op1 - op2) + ", ");
        mul(op1, op2);
    }

    public static void mul(int op1, int op2){
        String str = "multiplication " ;
        str += (op1 < 0)? "(" + op1 + ")" : Integer.toString(op1) ;
        str += " * ";
        str += (op2 < 0)? "(" + op2 + ")" : Integer.toString(op2) ;
        System.out.print(str + "=" + (op1 * op2) + ", ");
        div(op1, op2);
    }

    public static void div(int op1, int op2){
        String str = "division " ;
        str += (op1 < 0)? "(" + op1 + ")" : Integer.toString(op1) ;
        str += " / ";
        str += (op2 < 0)? "(" + op2 + ")" : Integer.toString(op2) ;
        System.out.print(str + "=" + (op1 / op2) + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        add(6, 4);
        System.out.println();
        add(-8, -4);
    }
}
