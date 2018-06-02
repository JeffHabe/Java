package Hw03;

import java.util.Arrays;

import loader.Algorithm3SumFastest;

public class ThreeSumFastest extends Algorithm3SumFastest{

	public int count(int[] a) {
		int cnt = 0;
		ThreeSumFastest bSearch = new ThreeSumFastest();

		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			if (bSearch.rank(i, a, 0) == 0)
				cnt++;
		}
		return cnt;
	}

	int rank(int i, int[] a, int target) {
		int ans = a[0] + a[1] + a[2];
		int sum;
		int lo = i + 1;
		int hi = a.length - 1;
		while (lo < hi) {
			sum = a[lo] + a[hi] + a[i];
			if (sum == target)
				return target;
			else if (sum > target) {
				ans = (sum - target) > Math.abs(ans - target) ? ans : sum;
				hi--;
			} else {
				ans = -(sum - target) > Math.abs(ans - target) ? ans : sum;
				lo++;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub


	}

}
