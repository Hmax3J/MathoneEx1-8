package mathoneex3;
import java.io.*;

public class MathoneEx3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		int count = 1; // �� ��(�ּ� ��Ʈ)
		int range = 2;	// ���� (�ּڰ� ����) 
 
		if (N == 1) 
		{
			System.out.print(1);
		}
 
		else 
		{
			while (range <= N) 
			{	// ������ N���� Ŀ���� �������� �ݺ� 
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
		}

	}

}