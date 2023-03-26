public class Static{
    public static void main(String[] args) {

        int maxValue = 256; //exlusive
        int arrSize = 10000;   //inclusive

        int[] arr = new int[arrSize];

        Thread[] threads = new Thread[arrSize];

        //fill arr with random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(maxValue * Math.random());
        }

        //breakpoint to see array


        SyncTime sync = new SyncTime(arrSize);

        //fill array with threads
        for(int i = 0; i < arr.length; i++) {
            threads[i] = new Thread(new SortThread(arr[i], sync)); //start new Thread for each element
            threads[i].start();
        }

        sync.time = System.currentTimeMillis();

        while (System.currentTimeMillis() - sync.time < .1 * arrSize) {
            
        }

        System.out.println();
        System.out.println("Time: "+(sync.endTime - sync.time)+"ms");
    }
}