package core.mathAction.mathOperations;

import core.numbers.ComplexNum;
import core.mathAction.MathOperation;

public class AdditionCompNum implements MathOperation {

    @Override
    public ComplexNum calculate(ComplexNum x, ComplexNum y) {
        return new ComplexNum(x.getReal() + y.getReal()
                , x.getImaginary() + y.getImaginary());
    }

}
