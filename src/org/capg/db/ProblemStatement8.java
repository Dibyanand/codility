package org.capg.db;



/*
  A[0] = 2
  A[1] = -4
  A[2] = 6
  A[3] = -3
  A[4] = 9
  
  1. (0, 1), whose absolute sum = |2 + (−4)| = 2
  2. (0, 2), whose absolute sum = |2 + (−4) + 6| = 4
  3. (0, 3), whose absolute sum = |2 + (−4) + 6 + (−3)| = 1
  4. (1, 3), whose absolute sum = |(−4) + 6 + (−3)| = 1
  5. (1, 4), whose absolute sum = |(−4) + 6 + (−3) + 9| = 8
  6. (4, 4), whose absolute sum = |9| = 9
  
  Both slices (0, 3) and (1, 3) are min abs slices and their absolute sum equals 1.

*/
 
public class ProblemStatement8 {
	
	

	public static void main(String[] args) {
		
		ProblemStatement8 problemStatement8=new ProblemStatement8();
		int[] A ={2,-4,6,-3,9};
		int minAbsSum = problemStatement8.solution(A);
		System.out.println("minAbsSum : "+minAbsSum);
		
	}
	
    public int solution(int[] A){
        int absSum =0;
        int minAbsSum =0;
        
        for(int i =0; i<A.length; i++){
        	int sum =A[i];
            for(int j =i+1;j<A.length;j++){
               sum =sum +A[j];
               absSum =Math.abs(sum);
               if(j==1){
            	   minAbsSum=absSum;
                }
                if(absSum<=minAbsSum){
                   minAbsSum = absSum;
                   System.out.println("minSum A[" +i +","+j +"]: "+ minAbsSum);
                }
            }
        }
        
      return minAbsSum;
   }
    

}
