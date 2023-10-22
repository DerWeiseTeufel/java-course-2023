package edu.hw2.Task4;
import java.io.*;

public class Main {
    public static CallingInfo callingInfo(Throwable e){
        var stck = e.getStackTrace();
        var className = stck[0].getClassName();
        var methodName = stck[0].getMethodName();
        return new CallingInfo(className, methodName);
    }
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            var ret = callingInfo(e);
            System.out.println(ret.className() +" " +  ret.methodName());
        }
    }
}
