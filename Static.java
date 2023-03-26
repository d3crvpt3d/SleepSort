public class Static{
    public static void main(String[] args) {

        int maxValue = 256; //exlusive
        int arrSize = 10;   //inclusive

        int[] arr = new int[arrSize];

        Thread[] threads = new Thread[arrSize];

        //fill arr with random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(maxValue * Math.random());
        }

        //if the arr should be printed before
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        SyncTime sync = new SyncTime();

        //fill array with threads
        for(int i = 0; i < arr.length; i++) {
            threads[i] = new Thread(new SortThread(arr[i], sync)); //start new Thread for each element
        }

        sync.time = System.currentTimeMillis();
        
        //start all threads
        for (int i = 0; i < arr.length; i++) {
            threads[i].start();
        }
    }
}