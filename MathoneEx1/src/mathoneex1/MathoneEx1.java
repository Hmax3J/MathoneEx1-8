package mathoneex1;
import java.io.*;
import java.util.*;

public class MathoneEx1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	/*	�ϴ� ������ ���� 3���� ������ �־�����. ���� ��� (�Һ� ���) ���� ��� ��ǰ ���� ( 1 �� ���� ���� ) �׸��� �̸� ���� A, B, C ��� Ī�ϰ� �ִ�.
		���⼭ �߿��� ���� ���� ����� �� �븦 �����ϴ� "������ �ʴ� ���"�̶�� ���̴�. ���ε�� A �� 10 �̶�� �� ��, ��ǰ�� 1000�� �����ϴ�, 1 �� �����ϴ� A �� ��� 10 �̶�� ���̴�.
		��, �������� Ǯ��� ���� n ���� ������ �� ������ �߻��ϴ� ������ n, n x ��ǰ ���� (C) > ������� (A) + (n x ������� (B)) �̸� �����ϴ� n �� ã�� ������.
		( ��ǰ ���� x n���� �ᱹ �����̶�� ���̴�. �� , n x C �� �� �����̴�. )  �Һ���� (A) + ������� (B) �� �ᱹ �� ����� �ȴ�.
		�׸��� �� ����. ��, ��ǰ ���� x n �� ���������� ���� ����(n) �� ���� ����Ͽ� �����ϹǷ� 170 x n �� �ȴ�. */
		
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if (C <= B) 
		{
			System.out.println("-1");
		}
		
		else 
		{
			System.out.println((A/(C-B))+1);
		}
		
	}

}