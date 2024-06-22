
import java.util.PriorityQueue;

class maxElement{


    public static int purchaseMaxElement(int arr[],int sum){
        if(arr.length == 0){
            return -1;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int x : arr){
            minHeap.add(x);
        }
        int item = 0;
        while(minHeap.peek() <= sum  && minHeap.isEmpty() == false && sum >= 0){
            sum = sum - minHeap.poll();
            item++;
        }
        return item;
    }
    public static void main(String[] args) {
        int arr[] = {1,12,5,111,2003};
        int sum = 10;
        System.out.println(purchaseMaxElement(arr,sum));
    }
}