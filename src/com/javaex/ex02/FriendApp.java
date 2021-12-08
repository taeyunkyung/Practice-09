package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		System.out.println("친구를 3명 등록해 주세요");
		Scanner sc = new Scanner(System.in);

		List<Friend> fList = new ArrayList<Friend>();

		for (int i = 0; i < 3; i++) {
			String info = sc.nextLine();
			Friend f = new Friend(info);
			fList.add(f);
		}

		for (Friend print : fList) {
			print.showInfo();
		}

		sc.close();
	}

}
