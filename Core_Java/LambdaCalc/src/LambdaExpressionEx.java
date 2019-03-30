
import java.util.function.Consumer;

public class LambdaExpressionEx {

	   public static void main(String args[]) {
		   LambdaExpressionEx lamExp = new LambdaExpressionEx();
			
	      
	      MathOperation addition = (int a, int b) -> a + b;
			
	      
	      MathOperation subtraction = (a, b) -> a - b;
			
	      
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	      MathOperation division = (int a, int b) -> a / b;
			
	      System.out.println("10 + 5 = " + lamExp.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + lamExp.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + lamExp.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + lamExp.operate(10, 5, division));
	      
	  
	     
	      Consumer<String> greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.accept("Mahesh");
	      greetService2.sayMessage("Suresh");      
	      
	   }
		
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   
	   interface GreetingService {
	      void sayMessage(String message);
	   }
		
	   
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }

	}
