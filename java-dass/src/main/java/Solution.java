/*int i, x[26] = { 0 }, y[26] = { 0 };
        for (i = 0; s[i] != '\0'; i++)	x[s[i] - 'a']++;	//建立 s 的字符表 x
        for (i = 0; t[i] != '\0'; i++)	y[t[i] - 'a']++;	//建立 t 的字符表 y
        for (i = 0; i < 26; i++)							//比较两字符表是否相同
        if (x[i] != y[i])	return false;
        return true;*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] x =new int[26];

        for(char schar: s.toCharArray()){
            x[schar-'a']++;
        }
        for(char tchar: t.toCharArray()){
            x[tchar-'a']--;
        }
        for(int i=0;i<26;i++){
            if (x[i] != 0){
                return false;
            }
        }
        return true;
    }
}