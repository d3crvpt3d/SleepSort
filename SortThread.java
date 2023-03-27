public class SortThread implements Runnable{
    byte x;
    int tmp_x;
    SyncTime syncTime;

    public SortThread(byte x, SyncTime syncTime){
        this.x = x;
        this.tmp_x = x<<4;
        this.syncTime = syncTime;
    }

    @Override
    public void run() {
        
        //wait till elapsed time >= x
        while(syncTime.time == 0 || System.currentTimeMillis() - syncTime.time <= tmp_x){

        }

        syncTime.add(x);
    }
}