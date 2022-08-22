import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*

in normal terms:
total = b * bc + w * wc

using greedy,
all black then convert:
total = (b + w) * bc + (w * z)

all white then convert:
total = (b + w) * wc + (b * z)

input:

5
10 10
1 1 1
5 9
2 3 4
3 6
9 1 1
7 7
4 2 1
3 3
1 9 2

 */

public class Solution {
	
	static Scanner fs;
	
	public static void main(String[] args) {
		fs = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			long b = fs.nextLong(), w = fs.nextLong();
			long bc = fs.nextLong(), wc = fs.nextLong(), z = fs.nextLong();
			long total = b * bc + w * wc;
			long allBlackConv = (b + w) * bc + (w * z);
			long allWhiteConv = (b + w) * wc + (b * z);
			total = Math.min(total, Math.min(allWhiteConv, allBlackConv));
			out.println(total);
		}
		fs.close();
		out.close();
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int x : a) {
			arr.add(x);
		}
		Collections.sort(arr);
		for (int i = 0; i < a.length; i++) {
			a[i] = arr.get(i);
		}
	}
	
	static int[] readArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
		}
		return a;
	}
}
