package core.mathAction;

import core.numbers.ComplexNum;
import core.mathAction.mathOperations.AdditionCompNum;
import core.mathAction.mathOperations.DivisionCompNum;
import core.mathAction.mathOperations.MultiplicationCompNum;

import java.util.HashMap;
import java.util.Map;

public class Action {
    private Map<String, MathOperation> operMap = new HashMap();
    public Action(){
        operMap.put("+",new AdditionCompNum());
        operMap.put("*",new MultiplicationCompNum());
        operMap.put("/",new DivisionCompNum());
}

    public ComplexNum calculationRes(String symbol, ComplexNum a, ComplexNum b){
        MathOperation oper = operMap.get(symbol);
        return oper.calculate(a, b);
    }

}
