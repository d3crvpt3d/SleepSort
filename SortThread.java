public class SortThread implements Runnable{
    int x;
    SyncTime syncTime;

    public SortThread(int x, SyncTime syncTime){
        this.x = x;
        this.syncTime = syncTime;
    }

    @Override
    public void run() {
        
        //wait till elapsed time >= time
        while(System.currentTimeMillis() - syncTime.time < (x<<2)){

        }

        System.out.println(x);
    }
}