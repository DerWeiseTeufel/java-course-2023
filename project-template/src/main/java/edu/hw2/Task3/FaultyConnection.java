package edu.hw2.Task3;

public class FaultyConnection implements Connection{
    final double p;
    public FaultyConnection(double p){
        this.p = p;
    }
    @Override
    public void execute(String command) {
        if(Math.random()<p){
            throw new ConnectionException("Sorry, smth is wrong!");
        }
    }

    @Override
    public void close() throws Exception {

    }
}
