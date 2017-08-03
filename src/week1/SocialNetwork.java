package week1;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import helpers.*;

public class SocialNetwork {


    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = StdIn.readInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n);
        List<Timestamp> timestampList= new ArrayList<Timestamp>();
        while (true) {
        	try {
	            int p = StdIn.readInt();
	            int q = StdIn.readInt();
	            if (!uf.connected(p, q)){
	            	uf.union(p, q);
	            	Timestamp log = new Timestamp(System.currentTimeMillis());
	            	System.out.println(log); 
	            	timestampList.add(log);
	            	
	            }
	            StdOut.println(p + " " + q);
        	}catch(Exception e){
        		break;
        	}
        }
        StdOut.println(uf.count() + " components");
    }
}