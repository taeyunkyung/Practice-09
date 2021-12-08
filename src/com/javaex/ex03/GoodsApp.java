package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		System.out.println("상품을 입력해주세요(종료 q)");
		Scanner sc = new Scanner(System.in);

		List<Goods> gList = new ArrayList<Goods>();
		while (true) {
			String info = sc.nextLine();
			
			if (info.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("====================");
				break;
			}
			
			Goods g = new Goods(info);
			gList.add(g);			
		}

		for (Goods print : gList) {
			print.showInfo();
		}
		
		CountSum(gList);
		
		sc.close();
	}

	public static void CountSum(List<Goods> list) {
		int sum = 0;
		for (Goods count : list) {
			sum = sum + count.getCount();
		}
		System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");
	}
}
