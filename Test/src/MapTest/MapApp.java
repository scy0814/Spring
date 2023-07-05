package MapTest;

import java.util.Scanner;

public class MapApp {
	public static void main(String[] args) {
		int count;
		int[] arr1;
		int[] arr2;
		int[] outArr; // OR������
		String[] outString; // ��¹��ڿ�
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Ѻ� ũ�⸦ �Է����ּ���");
		count = scanner.nextInt();
		arr1 = new int[count];
		arr2 = new int[count];
		outArr = new int[count];
		outString = new String[count];
		
		System.out.println("Arr1�� "+count+"���� ���ڸ� �Է��ϼ���(������ ,)");
		Scanner sc1 = new Scanner(scanner.next()).useDelimiter("\\s*,\\s*");
		for(int i=0; i<count; i++) {
			arr1[i] = sc1.nextInt();
		}
		
		System.out.println("Arr2�� "+count+"���� ���ڸ� �Է��ϼ���(������ ,)");
		Scanner sc2 = new Scanner(scanner.next()).useDelimiter("\\s*,\\s*");
		for(int i=0; i<count; i++) {
			arr2[i] = sc2.nextInt();
		}
		
		for(int i=0; i<count; i++) {
			outArr[i] = arr1[i] | arr2[i];
			outString[i] = Integer.toBinaryString(outArr[i]);
			outString[i] = outString[i].replace('1', '#');
			outString[i] = outString[i].replace('0', ' ');
			System.out.println(outString[i]);
		}
		
	}
}
