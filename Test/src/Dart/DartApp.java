package Dart;

import java.util.Scanner;

public class DartApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��Ʈ ��� : ");
		String dartResult = scanner.nextLine();
		
		DartResultAnalyzer ra = new DartResultAnalyzer(dartResult);
		int DartScore = ra.getDartScore();
		String DartScoreEquation = ra.getDartScoreEquation();
		
		System.out.printf("score : %s     equation : %s", DartScore, DartScoreEquation);
	}
}
