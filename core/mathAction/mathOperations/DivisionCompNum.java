package core.mathAction.mathOperations;

import core.numbers.ComplexNum;
import core.mathAction.MathOperation;

public class DivisionCompNum implements MathOperation {
    @Override
    public ComplexNum calculate(ComplexNum x, ComplexNum y) {
        double divider = Math.pow(y.getReal(), 2) + Math.pow(y.getImaginary(), 2);
        return new ComplexNum((x.getReal() * y.getReal() + x.getImaginary() * y.getImaginary())
                / divider
                , (x.getImaginary() * y.getReal() - x.getReal() * y.getImaginary())
                / divider);
    }
}
