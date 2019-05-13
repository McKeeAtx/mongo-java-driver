package com.mongodb.internal.connection;

/**
 * A tuple that contains the number of connected and waiting threads for a connection pool / server.
 */
final class ConnectionStatistics {

    private final int connectedThreads;
    private final int waitingThreads;

    ConnectionStatistics(final int connectedThreads, final int waitingThreads) {
        this.connectedThreads = connectedThreads;
        this.waitingThreads = waitingThreads;
    }

    /**
     * Returns the number of connected threads.
     * 
     * @return the number of connected threads
     */
    int countConnectedThreads() {
        return connectedThreads;
    }

    /**
     * Returns the number of waiting threads.
     *
     * @return the number of waiting threads
     */
    int countWaitingThreads() {
        return waitingThreads;
    }

    /**
     * Returns the number of connected and waiting threads.
     *
     * @return the number of connected and waiting threads
     */
    int countAllThreads() {
        return countConnectedThreads() + countWaitingThreads();
    }
}
