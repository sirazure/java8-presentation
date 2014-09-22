package com.sirazure.showcase;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;

public class NashornApp {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("print('Hello World!');");

        String script = "var x = 4;";
        script += "var fun = function () { print(x + 1) };";
        script += "var fun2 = function () { return x + 2 };";
        script += "var x = 6;";


        String eval2 = script + "fun()";
        engine.eval(eval2);


        Invocable invocable = (Invocable) engine;

        System.out.println(invocable.invokeFunction("fun2"));

        script += "com.sirazure.showcase.NashornApp.unifier(2, 4);";

        engine.eval(script);

    }

    public static void unifier(int a, int b) {
        Arrays.asList(a, b).forEach(i -> System.out.print(" --" + i +"-- "));
    }
}
