package tennisGame;

public class ScoreBoard {

	private String[][] scoreBoard;
	private int temp = 0; // 초기화 추가

	// 계수기 생성
	String[][] createScoreBoard() {
		scoreBoard = new String[3][4]; 

		// 0행 카테고리로 초기화

		// 0행 0열 이름, 1열 포인트, 2열 게임, 3열 세트
		// 1행 0열 플레이어1, 1열 포인트, 2열 게임, 3열 세트
		// 2행 0열 플레이어2, 1열 포인트, 2열 게임, 3열 세트
		String[] menu = {"이름","\t포인트","\t게임","\t세트"};
		System.arraycopy(menu, 0, scoreBoard[0], 0, menu.length);

		// 이름 입력되는 공간을 제외한 나머지 부분을 0으로 초기화
		for (int i = 1; i < scoreBoard.length; i++) {
			for (int j = 1; j < scoreBoard[i].length; j++) {
				scoreBoard[i][j] = "0";
			}
		}

		return scoreBoard;
	}

	// 계수기에 선수 이름 반영하는 메소드
	public void setScoreBoardName(String[] names) {
		if (names.length != 2) {
			throw new IllegalArgumentException("두 명의 선수 이름을 제공해야 합니다.");
		}
		scoreBoard[1][0] = names[0]; // 1번 플레이어
		scoreBoard[2][0] = names[1]; // 2번 플레이어
	}

	// 포인트를 계수기에 반영 및 출력하는 메소드
	public void printScore(String score1, String score2) {
		scoreBoard[1][1] = score1; // 1번 플레이어 포인트
		scoreBoard[2][1] = score2; // 2번 플레이어 포인트
		printBoard();
	}

	// 게임스코어를 계수기에 반영 및 출력하는 메소드
	public void printGame(int a, String gameScore) {
		int i = temp;

		if (a == 0) {
			scoreBoard[1][2 + i] = gameScore;
		} else {
			scoreBoard[2][2 + i] = gameScore;
		}

		// 양 측의 점수 차이 계
		int sbd = Math.abs(Integer.parseInt(scoreBoard[1][2 + i]) - Integer.parseInt(scoreBoard[2][2 + i]));

		// 2게임차 이상이면서 먼저 6게임을 딴 경우
		if (sbd >= 2 && scoreBoard[1][2 + i].equals("6") || scoreBoard[2][2 + i].equals("6")) {
			temp++;
		}

		printBoard();
	}

	// 세트스코어를 계수기에 반영 및 출력하는 메소드
	public void printSet(int a, String setScore) {
		if (a == 0) {
			scoreBoard[1][3] = setScore;
		} else {
			scoreBoard[2][3] = setScore;
		}
		printBoard();
	}

	private void printBoard() {
		System.out.println("-".repeat(50));
		for (int i = 0; i < scoreBoard.length; i++) {

			for (int j = 0; j < scoreBoard[i].length; j++) {
				System.out.printf("\t%s", scoreBoard[i][j]);
			}
			System.out.println();
			System.out.println("-".repeat(50));
			
		}
		
		System.out.println("\n\n\n");
		
	}
}
