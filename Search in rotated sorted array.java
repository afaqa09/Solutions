import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int rotaindex(int []a, int l, int h,int n){
        
        while(l<=h)
        {
            if(a[l]<a[h])
            {
                
                return l;
            }
            int m=(l+h)/2;
            
            int next = (m+1)%n;
            int prev = (m+n-1)%n;
            if(a[m] > a[prev] && a[m]<a[next])
                return m;
            else if(a[m] < a[h])
                h = m-1;
            else if(a[m] > a[l])
                l = m+1;
            
        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int [] a = { 1, 2, 3, 4, 5, 6 };
                     
        int n = a.length;
        
        int result = rotaindex(a,0,n-1,n);
        System.out.println(result);
        
        int [] b = { 3, 4, 5, 6, 1 , 2 };
                     
        int m = b.length;
        int resu = rotaindex(b,0,m-1,m);
        System.out.println(resu);
        
    }
}