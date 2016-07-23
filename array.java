package String;

public class array {
public static void main(String[] args) {
	int[] input={2,11,7,15};
	int target=9;
	int sum;
	for(int i=0;i<input.length;i++)
	{
		for(int j=i+1;j<input.length;j++)
		{
	        sum=input[i]+input[j];
	        if(sum==target)
	        {
	        	System.out.println(input[i]+" "+input[j]);
	        }
	        else
	        {
	        	sum=0;
	        }
		}
	}
}
}
