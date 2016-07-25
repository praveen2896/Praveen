package String;

public class ArrayR {
public static void main(String[] args) {
	int[] arr={1,5,9,3,5};
	repeat(arr);
	
}

private static void repeat(int[] arr) {
	// TODO Auto-generated method stub
	int a = 0;
	for(int i=0;i<arr.length;i++)
	
	{
		for(int j=i+1;j<arr.length;j++)
		{
		
			if(arr[i]==arr[j])
			{
				a= arr[i];
				
			}
			}
		if(a>0)
		{
			break;
		}
		}
	if(a>0)
	{
	System.out.println(a);
	}
	else
	{
		System.out.println("no repeated elements");
	}
	}
}

