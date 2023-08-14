class Solution {
    boolean solution(String s) {
        int p =0;
        int y =0;

        s = s.toLowerCase();
        
        String[] word = s.split("");
        
        for(int i=0; i < word.length ; i++){
            if(word[i].equals("p")) p++;
            else if(word[i].equals("y")) y++;
        }
        
        if(p==y) return true;
        else return false;
    }
}