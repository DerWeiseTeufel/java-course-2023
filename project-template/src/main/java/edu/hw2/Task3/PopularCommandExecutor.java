package edu.hw2.Task3;

public final class PopularCommandExecutor {
    //private final ConnectionManager manager;
    //private final int maxAttempts;

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    void tryExecute(String command) {  }
}
