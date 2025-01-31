

class wordProblemBreaking{
    static class Node{
        Node []children = new Node[26];
        boolean eow = false;
        Node(){
            for(int i = 0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
       Node curr = root;
        for(int i = 0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String word){ // O(L) where L is the length of the word
        Node curr = root;
        for(int i = 0;i<word.length();i++){
            int a = word.charAt(i) - 'a';
             if(curr.children[a] == null){
                return false;
             }
             curr = curr.children[a];
        }
        return curr.eow == true;

    }
    public static boolean check(String key){
        if(key.length() == 0){
            return true;  
        }
        for(int i = 1;i<=key.length();i++){
            if(search(key.substring(0,i)) && check(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] = {"i","like","sam","samsung","ice"};
        for(int i = 0;i<words.length;i++){
            insert(words[i]);
        }
        String key = "ilikesamsung";
        System.out.println(check(key));


}
}