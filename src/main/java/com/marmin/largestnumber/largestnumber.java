package com.marmin.app;

class largestnumber {
    static int largetsNumber(int a, int b) {
        if (a > b) {
            return a;
        } 
        else if (b > a){
            return b;
        } 
        else if (b == a) {
            return a;
        } 
        else {
           return 0;
        }
    }
}