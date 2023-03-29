import com.sun.xml.internal.bind.v2.TODO;

/**
 * @Author: Fourteen-Y
 * @Description:
 * @Date: 2022/6/30 0:38
 */
public class OjTest {
    /**
     *  给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * @param ch
     * @return
     */
    private boolean isCharacter(char ch) {
        if(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
            return true;
        }
            return false;
    }
    public boolean isPalindrome(String s) {
        //把所有字符串变成小写的
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            while(i < j && !isCharacter(s.charAt(i))){
                i++;
            }
            while(i < j && !isCharacter(s.charAt(j))){
                j--;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    /**
     *  给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
     */
    public int firstUniqChar(String s) {

        if(s == null || s.length() == 0){
            return -1;
        }
        int[] array = new int[26];

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            array[ch - 'a']++;
        }

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(array[ch-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
