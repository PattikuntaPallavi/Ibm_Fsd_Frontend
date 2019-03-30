
public class ArraysDemo {

		public static void main(String[] args)
		{
			
			//int[] nos = {10,20,30};  
			
			
			//int[] nos = new int[] {10, 20, 30};
			
			
		 int[] nos = new int[3];             
			 nos[0] = 10;
		 nos[1] = 20;
		 nos[2] = 30;
			
			
			for(int i =0; i < nos.length; i++)
			{
				System.out.println(nos[i]);
			}
		
			
			// for each
			for(int i: nos)
			{
				System.out.println(i);
			}

		}

}
