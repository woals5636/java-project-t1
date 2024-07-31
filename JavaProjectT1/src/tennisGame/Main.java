package tennisGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 3세트 or 5세트
		// 플레이어 2명
		// 이름을 입력 받을 것이고
		// 그러려면 플레이어를 생성하는 객체를 만들어야지

		Player p1 = new Player();
		p1.GameStart();

		// 게임 시작
		// 점수가 랜덤으로 오르는 테니스 점수판 출력되게

		ScoreBoard sb = new ScoreBoard();



		// 게임 종료 안내
		System.out.println("경기가 종료되었습니다.");

	}
}
