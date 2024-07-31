package tennisGame;

import java.io.IOException;
import java.util.Scanner;

public class Player {
	
	String [] name = new String [2];
	int setNumber = 0;

	Scanner scanner = new Scanner(System.in);

	public void GameStart() {
		//3세트 or 5세트
		System.out.println("테니스 세트를 선택합니다.");
		System.out.println("3세트 : (1)입력, 5세트 : (2)입력");
		int setNumber = scanner.nextInt();

		// 세트 확인 출력
		if(setNumber==1)System.out.println("3세트 선택");
		else if(setNumber==2)System.out.println("5세트 선택");
		
		while (!(setNumber==1 || setNumber == 2)) {
			System.out.println("잘못된 입력입니다.");
			System.out.println("다시 입력 - 3세트 : (1)입력, 5세트 : (2)입력");
			setNumber = scanner.nextInt();
			
			
			
			try {
				System.in.skip(System.in.available());          //버퍼 비우기
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			
		}//while
		
		
		// 선수 이름 입력
		String [] name = new String [2];
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%d번 선수의 이름을 입력하세요 :  ", i+1);
			name[i] = scanner.next();
		}//for
		

	}//Gamestart()

	
	
}//class

