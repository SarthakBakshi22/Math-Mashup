import java.util.*;

public class mm1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int N = s.nextInt();
		int A[] = new int[N];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < N; i++) 
		{
			A[i] = s.nextInt();
		}
		System.out.println("Enter size of an array: ");
		int M = s.nextInt();
		int B[] = new int[M];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < M; i++) 
		{
			B[i] = s.nextInt();
		}
		System.out.println("Enter Magic Number: ");
		int X = s.nextInt();
		mm1 qwe = new mm1();
		System.out.print(qwe.solution(N, A, M, B, X));
	}
	public int solution(int N, int[] A, int M, int[] B, int X)
	{
		int i,j,k,size,l=0,sum=0,min, max, x, lcm = 0;
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		ArrayList<Integer> B1 = new ArrayList<Integer>();
		ArrayList<Integer> merge_AB = new ArrayList<Integer>();
		//int uniq[] = new int[N+M];
		//int sub_arr[] = new int[N+M];
		//int LCM[] = new int[N+M];
		//Unique Elements in first Array:
		boolean [] visited = new boolean[N];
		boolean [] visited1 = new boolean[M];
        for (i = 0; i <N ; i++)
        {
            if(visited[i]==false)
            {
                boolean isDuplicate = false;
                for (j = i + 1; j < N; j++) 
                {
                    if (A[i]==A[j])
                    {
                       isDuplicate = true;
                       visited[j] = true;
                    }
                }
                if(!isDuplicate)
                {
                   A1.add(A[i]);
                }
            }
        }
		for(i=0;i<A1.size();i++)
		{
			System.out.print(A1.get(i)+" ");
		}
		//Unique Elements in second Array:
		for (i = 0; i <M ; i++)
        {
            if(visited1[i]==false)
            {
                boolean isDuplicate1 = false;
                for (j = i + 1; j < M; j++) 
                {
                    if (B[i]==B[j])
                    {
                       isDuplicate1 = true;
                       visited1[j] = true;
                    }
                }
                if(!isDuplicate1)
                {
                   B1.add(B[i]);
                }
            }
        }
		
		System.out.println("");
		for(i=0;i<B1.size();i++)
		{
			System.out.print(B1.get(i)+" ");
		}
		return lcm;
	}
}



