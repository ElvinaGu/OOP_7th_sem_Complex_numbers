package core;

import core.mathAction.Action;
import core.numbers.ComplexNum;

import java.util.Scanner;


public class ConsoleInput {

    public static void calculate() {
        double operand1 = Double.parseDouble(prompt("Enter a valid number A: "));
        double operand1j = Double.parseDouble(prompt("Enter imaginary number A: "));
        ComplexNum a = new ComplexNum(operand1, operand1j);
        String operator = prompt("Enter math operation (+ / *): ");
        double operand2 = Double.parseDouble(prompt("Enter a valid number B: "));
        double operand2j = Double.parseDouble(prompt("Enter imaginary number B: "));
        ComplexNum b = new ComplexNum(operand2, operand2j);

         Action res = new Action();
        System.out.println(res.calculationRes(operator, a, b));

    }

    private static String prompt(String message) {
        System.out.println(message);
        return new Scanner(System.in).next();
    }
}
