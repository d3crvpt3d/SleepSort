public class Static{
    public static void main(String[] args) {

        byte maxValue = 127; //exlusive
        int arrSize = 20;   //inclusive

        byte[] arr = new byte[arrSize];

        Thread[] threads = new Thread[arrSize];

        //fill arr with random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) ((maxValue * Math.random()) - 256);
        }

        //breakpoint to see array
        for (byte i : arr) {
            System.out.print(i+" ");
        }

        SyncTime sync = new SyncTime(arrSize);

        //fill array with threads
        for(int i = 0; i < arr.length; i++) {
            threads[i] = new Thread(new SortThread(arr[i], sync)); //start new Thread for each element
            threads[i].start();
        }

        sync.time = System.currentTimeMillis();

        while (System.currentTimeMillis() - sync.time < maxValue<<4) {
            
        }

        System.out.println();
        System.out.println("Time: "+(sync.endTime - sync.time)+"ms");

        for (byte i : sync.outArray) {
            System.out.print(i+" ");
        }
    }
}