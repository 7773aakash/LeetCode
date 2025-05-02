class Solution {
    public String reverseVowels(String s) {

        Set<Character> vowels = Set.of('A','E','I','O','U','a','e','i','o','u');
        int left = 0;
        int right = s.length()-1;
        char[] st = s.toCharArray();
        
        while(left < right){
            while(left<right && !vowels.contains(st[left])){
                left++;
            }
            while(left<right && !vowels.contains(st[right])){
                right--;
            }
            char temp = st[left];
            st[left] = st[right];
            st[right] = temp;
            left++;
            right--;
        }
        return new String(st);
    }
}