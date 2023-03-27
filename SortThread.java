public class SortThread implements Runnable{
    int x, tmp_x;
    SyncTime syncTime;

    public SortThread(int x, SyncTime syncTime){
        this.x = x;
        this.syncTime = syncTime;
    }

    @Override
    public void run() {
        
        //wait till elapsed time >= x
        while(syncTime.time == 0 || System.currentTimeMillis() - syncTime.time <= x){

        }

        syncTime.add(x);
    }
}