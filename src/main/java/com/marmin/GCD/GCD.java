package com.marmin.app;
 class GCD {
    static int GCDofNumbers(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        
        if(b == 0) {
            return a;
        }
        return GCDofNumbers(b, a % b);
    }
}