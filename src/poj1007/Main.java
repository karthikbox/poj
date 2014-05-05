import java.io.*;
import java.util.*;
//import java.lang.math;

class S implements Comparable<S>{
	static int m;
	String d;
	int rank;
	S(String s){
	    this.rank=0;
	    d=s;
	    for(int i=0; i<m-1;i++){
		if(d.charAt(i)=='A')
		    continue;
		for(int j=i+1; j<m;j++){
		    if(d.charAt(i)> d.charAt(j))
			this.rank++;
		}
	    }
	}
	@Override
	public int compareTo(S o){
	    if(this.rank > o.rank)
		return 1;
	    else if(this.rank < o.rank)
		return -1;
	    else
		return 0;
	}
    }

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
        int n=nextInt(r);
        assert (n<=50 && n>=0):"n not in limits";
        int m=nextInt(r);
        assert (m<=50 && m>0):"m not in limits";
        //long t=nextLong(r);
        List<S> list=new ArrayList<S>(m);
        S.m=n;
        for(int i=0; i<m; i++) {
            //double n=nextDouble(r);
            //System.out.println(n);            
	    
            list.add(new S(r.readLine()));            

        }
        //String str="";
	Collections.sort(list);
        for(S str:list){
            System.out.print(str.d);
	    //System.out.println(str.rank);
	}
    }

}
