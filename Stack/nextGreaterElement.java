package Stack;
import java.util.*;
public class nextGreaterElement {
    public static void nextGreaterElementFromRight(){
        Stack<Integer> stack = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){  // for right most greater element
    
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[stack.peek()];
            } 
            stack.push(i);
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
    public static void nextGreaterElementFromLeft(){
         Stack<Integer> stack = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
    for(int i = 0; i<arr.length;i++){  // for left most greater element 
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[stack.peek()];
            } 
            stack.push(i);
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
    public static void nextSmallestElementFromRight(){
        Stack<Integer> stack = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){  // for right most greater element
    
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[stack.peek()];
            } 
            stack.push(i);
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
    public static void nextSmallestElementFromLeft(){
        Stack<Integer> stack = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
    for(int i = 0; i<arr.length;i++){  // for left most greater element
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[stack.peek()];
            } 
            stack.push(i);
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       nextGreaterElementFromRight();
       nextGreaterElementFromLeft();
       nextSmallestElementFromRight(); 
       nextSmallestElementFromLeft();
    }
    
}
