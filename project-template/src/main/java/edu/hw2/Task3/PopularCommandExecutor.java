package edu.hw2.Task3;

public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;
    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts){
        this.maxAttempts = maxAttempts;
        this.manager = manager;
    }

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    void tryExecute(String command) {
        ConnectionException failure = null;

        for(int i =0;i<maxAttempts;++i){
            //var connection = this.manager.getConnection();
            try(var connection = this.manager.getConnection()) {
                connection.execute(command);
                return;
            }catch (ConnectionException ex) {
                failure = ex;
            } catch(Exception ignored){

            }
        }
        if (failure!=null ){
            throw failure;
        }
    }
}
