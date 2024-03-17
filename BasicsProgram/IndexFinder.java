package BasicsProgram;

public class IndexFinder {
    public static int index(int arr[],int target){
        for(int i = 0; i<arr.length;i++){
            if(target == arr[i]){
                return i;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {53,45,56,78,89,56};
        int target = 56;
        
        }
    }
}
