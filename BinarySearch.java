import java.util.Scanner;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������鳤�ȣ�");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("������" + length + "������");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// �ж������Ƿ�����
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		// ������������ִ��
		if (flag) {
			System.out.println("������Ҫ���ҵ���x��");
			Scanner sca = new Scanner(System.in);
			int x = sca.nextInt();
			System.out.println(Binary(arr, 0, arr.length, x));
		} else {
			System.out.println("�����������������");
		}
	}

	public static int Binary(int[] arr, int min, int max, int x) {
		int mid = (min + max) / 2;
		// ���Ҫ���ҵ�ֵ���м��ֵ�����ֱ���˳��㷨����������м���������ƣ��ٰѺ���ķֳ������ּ���ִ�д˲��������С������ǰ��
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
