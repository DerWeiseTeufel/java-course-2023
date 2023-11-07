package edu.hw2.Task4;
import java.io.*;

public class Main {
    public static CallingInfo callingInfo(){
        //var stck = e.getStackTrace();
        var stck = Thread.currentThread().getStackTrace();
        if(stck.length > 2) {
            var className = stck[2].getClassName();
            var methodName = stck[2].getMethodName();

            return new CallingInfo(className, methodName);
        }
        return null;

    }
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            var ret = callingInfo();
            System.out.println(ret.className() +" " +  ret.methodName());
        }
    }
}
