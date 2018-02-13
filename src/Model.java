

public class Model {
	private Double result;
	
	/*public Model() {
		
		// TODO Auto-generated constructor stub
		
		
	}*/
	public double summation_Result (double num1, double num2){
		
		result=num1+num2;
		return result;
	}
	
   public double multiply_Result (double num1, double num2){
		
		result=num1*num2;
		return result;
	}
   
   public double division_Result (double num1, double num2){
		if(num2==0){
			throw new IllegalArgumentException("number cant be divide by 0");}
 		result=num1/num2;
 		return result;
 	}
   public double subtract_Result (double num1, double num2){
		
		result=num1-num2;
		return result;
	}
   
   public double sqrt_Result (double num1){
	   if(num1<0){
			throw new IllegalArgumentException("number must be positive");}
		result= Math.sqrt(num1);
		return result;
   }
   public double getResult (){
	   return result;
   }
}
