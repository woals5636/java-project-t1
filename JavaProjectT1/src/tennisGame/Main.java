package tennisGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 // 세호: 테스트를 위해 추가
		// 3세트 or 5세트
		// 플레이어 2명
		// 이름을 입력 받을 것이고
		// 그러려면 플레이어를 생성하는 객체를 만들어야지

		/*
		Player p1 = new Player();
		p1.GameStart();

		// 게임 시작
		// 점수가 랜덤으로 오르는 테니스 점수판 출력되게
		*/
		
		 // 재윤: 테스트를 위해 추가
		 ScoreBoard sb = new ScoreBoard();

	        // ScoreBoard 초기화
	        sb.createScoreBoard(); // scoreBoard를 초기화합니다.

	        // 플레이어 이름 설정
	        sb.setScoreBoardName(new String[]{"테스트1", "테스트2"});

	        // 포인트 반영 및 출력
	        sb.printScore("15", "30");
	        sb.printScore("30", "40");

	        // 게임 스코어 반영 및 출력
	        sb.printGame(0, "1"); // 플레이어1이 1게임을 승리
	        sb.printGame(1, "1"); // 플레이어2가 1게임을 승리

	        // 세트 스코어 반영 및 출력
	        sb.printSet(0, "6-4"); // 플레이어1이 1세트를 6-4로 승리
	        sb.printSet(1, "4-6"); // 플레이어2가 1세트를 4-6으로 승리

	        // 추가 테스트
	        sb.printGame(0, "6"); // 플레이어1이 6게임을 승리
	        sb.printSet(0, "7-5"); // 플레이어1이 세트를 7-5로 승리

		// 게임 종료 안내
		System.out.println("경기가 종료되었습니다.");

	}
}
