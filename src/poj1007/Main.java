package poj1007;

import java.io.*;
//import java.lang.math;
public class Main {
    static int nextInt(java.io.BufferedReader r) throws java.io.IOException {
        int ch;
        for(; (ch=r.read()) < '0' || ch>'9';);
        int c=ch-'0';
        for(; (ch=r.read()) >= '0'&& ch<='9'; c=c*10+ch-'0');
        return c;
    }
    
    static long nextLong(java.io.BufferedReader r) throws java.io.IOException {
        long ch;
        for(; (ch=r.read()) < '0' || ch>'9';);
        long c=ch-'0';
        for(; (ch=r.read()) >= '0'&& ch<='9'; c=c*10+ch-'0');
        return c;
    }
    
    static double nextDouble(java.io.BufferedReader r) throws java.io.IOException {
        double ch;
        for(; (ch=r.read()) < '0' || ch>'9';);
        double c=ch-'0',d=0.0,p=100.0;
        for(; (ch=r.read()) >= '0'&& ch<='9'; c=c*10+ch-'0');
        if(ch != '.')
            return c;
        else{
//            System.out.println(c);
            ch=r.read();            
            d+=(ch-'0')/10.0;            
            for(; (ch=r.read()) >= '0'&& ch<='9'; d=d+(ch-'0')/p,p*=10.0);
//            System.out.println(d);
        }
        return c+d;
    }

    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader r= new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int t=nextInt(r);
        //long t=nextLong(r);
        for(int i=0; i<t; i++) {
            double n=nextDouble(r);
            System.out.println(n);

        }
    }

}
