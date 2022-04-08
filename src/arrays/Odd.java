package arrays;

public class Odd {

	public static void main(String[] args) {
		int a[]= {1,3,56,70,5,33};
		System.out.println("odd numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
