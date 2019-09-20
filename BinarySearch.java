import java.util.Scanner;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入数组长度：");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("请输入" + length + "个数：");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// 判断数列是否有序
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		// 如果有序则继续执行
		if (flag) {
			System.out.println("请输入要查找的数x：");
			Scanner sca = new Scanner(System.in);
			int x = sca.nextInt();
			System.out.println(Binary(arr, 0, arr.length, x));
		} else {
			System.out.println("该数列无序，输入错误");
		}
	}

	public static int Binary(int[] arr, int min, int max, int x) {
		int mid = (min + max) / 2;
		// 如果要查找的值与中间的值相等则直接退出算法，如果大于中间的则往后移，再把后面的分成两部分继续执行此操作，如果小于则往前移
		if (min < max) {
			if (arr[mid] == x) {
				return mid;
			} else {
				if (arr[mid] > x) {
					max = mid - 1;
				}
				if (arr[mid] < x) {
					min = mid + 1;
				}
			}
			return Binary(arr, min, max, x);

		}
		return -1;
	}
}
