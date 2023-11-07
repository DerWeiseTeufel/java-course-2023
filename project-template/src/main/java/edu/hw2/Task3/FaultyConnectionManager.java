package edu.hw2.Task3;

public class FaultyConnectionManager {
    public Connection getConnection(){
        return new FaultyConnection(Math.random());
    }
}
