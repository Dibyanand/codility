package org.capg.db;


public class ProblemStatement1 {

	public static void main(String[] args) {

		ProblemStatement1 problemStatement1 = new ProblemStatement1();
		int[] A = { 0, 1, 3, -2, 0, 1, 0, -3, 2, -3 };
		int depth = problemStatement1.solution(A);
		System.out.println("Depth: "+depth);

	}

	
	
	public int solution(int A[]) {

		    int length = A.length;
		    
		    if (length < 2) {
		        return -1;
		    }
		    
		    int currentDepth = 0;
		    int maxDepth = -1;
		    
		    int P, Q, R;
		    int i, j, k;
		    
		    for (i=0; i<length-2; i++) {
		        j=i+1;
		        
		        if (A[i] > A[j]) {
		            //The biggest P.
		            P = A[i];
		            
		            while (j+1<length && (A[j]>A[j+1])) {
		                j++;
		            }
		            //The smallest Q.
		            Q = A[j] ;
		            
		            k = j+1;
		            while (k+1<length && (A[k]<A[k+1])) {
		                k++;
		            }
		            if (k >= length) {
		                break;
		            }
		            //The biggest R.
		            R = A[k];
		            
	
		            
		            currentDepth = Math.min(P-Q, R-Q);
		            if (currentDepth > maxDepth) {
		                maxDepth = currentDepth;
		            }
		            i = k-1;
		        }
		    }
		    
		return maxDepth;
		
	}

}
