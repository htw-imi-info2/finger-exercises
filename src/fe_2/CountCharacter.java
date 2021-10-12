package fe_2;

public class CountCharacter {
    public int countCharacter(String s, char c){
        if (s == null) return 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) counter ++;
        }
        return counter;
    }
}
