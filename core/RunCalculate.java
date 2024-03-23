package core;

import core.logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RunCalculate {
    private static final Logger log = Log.log(RunCalculate.class.getName());

    public static void main(String[] args) {
        log.log(Level.INFO, "Method RunCalculate in core package started");
        ConsoleInput.calculate();
    }
}
