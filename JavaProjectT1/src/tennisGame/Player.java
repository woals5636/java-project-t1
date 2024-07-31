package tennisGame;

import java.util.Scanner;

public class Player {

    private String[] name = new String[2];
    private int setNumber = 0;
    private Scanner scanner = new Scanner(System.in);

    public void GameStart() {
        // 3세트 또는 5세트 선택
        System.out.println("테니스 세트를 선택합니다.");
        System.out.println("3세트 : (1)입력, 5세트 : (2)입력");
        
        // 입력 검증 루프
        while (true) {
            setNumber = scanner.nextInt();
            if (setNumber == 1 || setNumber == 2) {
                break;
            }
            System.out.println("잘못된 입력입니다.");
            System.out.println("다시 입력 - 3세트 : (1)입력, 5세트 : (2)입력");
        }

        // 세트 확인 출력
        if (setNumber == 1) {
            System.out.println("3세트 선택");
        } else {
            System.out.println("5세트 선택");
        }

        // 선수 이름 입력
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%d번 선수의 이름을 입력하세요: ", i + 1);
            name[i] = scanner.next();
        }

        // Scanner 닫기
        scanner.close();

    }
	
}//class

