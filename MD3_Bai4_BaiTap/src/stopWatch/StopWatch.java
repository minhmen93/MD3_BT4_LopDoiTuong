package stopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long StopWatch() {
        return startTime= System.nanoTime();
    }
    public long start() {
        return startTime= System.nanoTime();
    }

    public long stop() {
        return endTime = System.nanoTime();
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }
}
