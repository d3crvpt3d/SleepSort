public class SyncTime {
    public long time = 0, endTime;
    public int[] outArray;
    private int curr = 0;

    public SyncTime(int size){
        this.outArray = new int[size];
    }

    public void add(int x){
        outArray[curr] = x;
        curr++;

        if(outArray.length < curr){
           endTime = System.currentTimeMillis();
        }
    }
}