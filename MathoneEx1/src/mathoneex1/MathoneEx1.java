package mathoneex1;
import java.io.*;
import java.util.*;

public class MathoneEx1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	/*	일단 문제를 보면 3개의 변수가 주어진다. 고정 비용 (불변 비용) 가변 비용 상품 가격 ( 1 개 기준 가격 ) 그리고 이를 각각 A, B, C 라고 칭하고 있다.
		여기서 중요한 것은 고정 비용은 몇 대를 생산하던 "변하지 않는 비용"이라는 것이다. 예로들어 A 가 10 이라고 할 때, 상품을 1000개 생산하던, 1 개 생산하던 A 는 계속 10 이라는 것이다.
		즉, 문제에서 풀라는 것은 n 개를 생산할 때 이익이 발생하는 시점의 n, n x 상품 가격 (C) > 고정비용 (A) + (n x 가변비용 (B)) 이를 만족하는 n 을 찾는 문제다.
		( 상품 가격 x n개는 결국 수입이라는 뜻이다. 즉 , n x C 가 총 수입이다. )  불변비용 (A) + 가변비용 (B) 이 결국 총 비용이 된다.
		그리고 총 수입. 즉, 상품 가격 x n 은 마찬가지로 생산 개수(n) 에 따라 비례하여 증가하므로 170 x n 이 된다. */
		
		
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