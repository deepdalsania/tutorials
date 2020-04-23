package extraknowledge;

public class Min_Max_Check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int[] array = new int[]{12,23,45,67,98,100,190};
	 
	    int max = getMaxNumber(array);
	    System.out.println("Maximum Value from given array is: "+max);
	 
	    // Calling getMin() method for getting min value
	    int min = getMinNumber(array);
	    System.out.println("Minimum Value from given array is: "+min);
	  }
	 
	  
	  public static int getMaxNumber(int[] inputArray){ 
	    int maxValue = inputArray[0]; 
	    for(int i=1;i < inputArray.length;i++){ 
	      if(inputArray[i] > maxValue){ 
	         maxValue = inputArray[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	 
	  // Method for getting the minimum value
	  public static int getMinNumber(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
	}
