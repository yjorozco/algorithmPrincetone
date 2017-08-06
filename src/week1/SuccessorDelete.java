package week1;

import helpers.StdOut;

import java.io.IOException;

public class SuccessorDelete {
	

	private WeightedLatest uf =  null;
	private boolean[] delete = null;
	
	public SuccessorDelete(int n) {
		super();		
	    uf = new WeightedLatest(n);	
	    delete = new boolean[n];
	}
	
	public int successor(int x){
		return uf.find(x);
	}
	
	public void remove(int x){

		if (delete[x] != true)
			uf.union(x,x+1);
		delete[x] = true;
	}
	
	
    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = 10;
        SuccessorDelete sd = new SuccessorDelete(n);
        sd.remove(3);
        System.out.print(sd.successor(3));
        sd.remove(3);
        System.out.print(sd.successor(3));
        sd.remove(2);
        System.out.print(sd.successor(2));

    }
	

}
