public class SyncTime {
    public long time = 0, endTime;
    public byte[] outArray;
    private int curr = 0;

    public SyncTime(int size){
        this.outArray = new byte[size];
    }

    public void add(byte x){
        outArray[curr] = x;
        curr++;

        if(outArray.length < curr){
           endTime = System.currentTimeMillis();
        }
    }
}