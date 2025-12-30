class TrieNode{
    TrieNode[] child = new TrieNode[26];
    boolean EOW;
}

class p3{
    public static void insert(TrieNode root, String str){
        TrieNode temp = root;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(temp.child[c-'a']==null){
                temp.child[c-'a'] = new TrieNode();
            }
            temp = temp.child[c-'a'];
        }
        temp.EOW = true;
    }
    public static boolean search(TrieNode root, String str){
        TrieNode temp = root;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(temp.child[c-'a']==null){
                return false;
            }
            temp = temp.child[c-'a'];
        }
        return temp.EOW;
    }
    public static boolean startswith(TrieNode root, String str){
        TrieNode temp = root;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(temp.child[c-'a']==null){
                return false;
            }
            temp = temp.child[c-'a'];
        }
        return true;
    }
    public static int countWords(TrieNode root){
        if(root==null){
            return 0;
        }
        int count = 0;
        if(root.EOW==true){
            count = 1;
        }
        for(int i=0;i<26;i++){
            count += countWords(root.child[i]);
        }
        return count;
    }
    public static int countNodes(TrieNode root){
        if(root==null){
            return 0;
        }
        int count = 1;
        for(int i=0;i<26;i++){
            count += countNodes(root.child[i]);
        }
        return count;
    }
    public static void printAllwords(TrieNode root,String temp){
        if(root.EOW==true){
            System.out.println(temp);
            return;
        }
        for(int i=0;i<26;i++){
            if(root.child[i]!=null){
                printAllwords(root.child[i], temp + (char)('a'+i));
            }
        }
    }
    public static void autowrite(TrieNode root, String prifix){
        TrieNode temp = root;
        for(int i= 0;i<prifix.length();i++){
            char c = prifix.charAt(i);
            if(temp.child[c-'a']==null){
                System.out.println("Given prefix does not found");
                return;
            }
            temp = temp.child[c-'a'];
        }
        printAllwords(temp, prifix);
    }
    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        insert(root,"apple");
        insert(root,"application");
        insert(root,"apply");
        insert(root,"apps");
        insert(root,"approve");
        System.out.println(search(root,"apply"));
        System.out.println(countWords(root));
        System.out.println(countNodes(root));
        System.out.println(startswith(root, "appll"));
        //printAllwords(root, new String());
        autowrite(root, "appli");
    }
}