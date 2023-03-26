public class SyncTime {
    public long time, endTime;
    public int[] outArray;
    private int curr = 0;

    public SyncTime(int size){
        this.time = System.currentTimeMillis();
        this.outArray = new int[size];
    }

    public void add(int x){
        outArray[curr] = x;
        curr++;
    }
}