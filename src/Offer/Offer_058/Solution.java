package Offer.Offer_058;

class Solution {
    public String reverseLeftWords(String s, int n) {
        String substringFore = s.substring(0, n);
        String substringTail = s.substring(n);
        StringBuilder sb = new StringBuilder(0);
        sb.append(substringTail).append(substringFore);
        return sb.toString();
    }
}