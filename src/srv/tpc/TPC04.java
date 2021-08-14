package srv.tpc;
// 데이터를 이동하라(실습)
public class TPC04 {

	public static void main(String[] args) {

		// 데이터를 이동하라, 변수 vs 배열의 관계
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
	
		hap(a, b, c);	// 이 방식으로는 파라미터가 많아지면 비효율적이다.
		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(hap2(arr));
		
		int[][] aa = new int[3][];
		aa[0] = new int[4];
		aa[1] = new int[5];
		aa[2] = new int[6];
		System.out.println(aa.length);
		System.out.println(aa[0].length);
		System.out.println(aa[1].length);
		System.out.println(aa[2].length);
		
	}
	
	public static void hap(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static int hap2(int[] array) {
		int result = 0;
		for(int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
	}
	
	
}
