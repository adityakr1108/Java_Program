
import java.util.PriorityQueue;

class kLargestElement{

    public static int Klargest(int arr[],int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i= 0;i<k;i++){
            minHeap.add(arr[i]);
        }
        for(int i = k;i<arr.length;i++){
            if(minHeap.peek() < arr[k]){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int arr[] = {5,15,10,20,8,25,18};
        int k = 3;
        System.out.println(Klargest(arr,k));
    }
 }