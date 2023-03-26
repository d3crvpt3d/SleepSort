public class SortThread implements Runnable{
    int x;
    double tmp_x;
    SyncTime syncTime;

    public SortThread(int x, SyncTime syncTime){
        this.x = x;
        this.tmp_x = x>>3;
        this.syncTime = syncTime;
    }

    @Override
    public void run() {
        
        //wait till elapsed time >= time
        while(System.currentTimeMillis() - syncTime.time < tmp_x){

        }

        syncTime.add(x);
    }
}