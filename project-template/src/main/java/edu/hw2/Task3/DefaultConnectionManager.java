package edu.hw2.Task3;

public class DefaultConnectionManager {
    final double p;
    public DefaultConnectionManager(double p){
        this.p = p;
    }
    public Connection getConnection(){
        if(Math.random()<p){
            return new FaultyConnection(Math.random());
        }
        return new StableConnection();
    }
}
