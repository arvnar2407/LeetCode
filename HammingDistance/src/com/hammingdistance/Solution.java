package com.hammingdistance;

class Solution {
    public int hammingDistance(int x, int y) {
    
    return Integer.bitCount(x^y);
    
    
    }
}