package arrays;

public class MinandMaxvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 5, 4, 1, 9};
	int	min=a[0];    //3
    int max=a[0];	 //3
    
     for(int i=0;i<a.length;i++) {
    	 if(a[i]>max) {
    		 max=a[i];
    	 }
     }
     System.out.println("The max value is" +max);
    
    
     for(int i=0;i<a.length;i++) {
    	 if(a[i]<min) {
    		 min=a[i];
    	 }
     }
     System.out.println("The min value is" +min);
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
