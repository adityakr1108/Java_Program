package BackTracking;

public class findSubset {
    public static void main(String[] args) {
        String str = "Aditya";
        findSubsets(str, "", 0);
        
    }
    public static void findSubsets(String str,String ans,int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        findSubsets(str, ans+=str.charAt(i), i+1);
        findSubsets(str, ans, i+1);


    }
}
