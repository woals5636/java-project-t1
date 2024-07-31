package tennisGame;

import java.util.Random;

public class GameMethod {
    // 포인트, 게임, 세트를 저장하고 ScoreBoard 클래스로 넘겨주기 위한 배열
    int[][] board = new int[2][3]; // [0]: 첫 번째 선수, [1]: 두 번째 선수
    Random rnd = new Random();
    int a = 0; // 현재 게임에서 점수를 얻고 있는 선수 인덱스

    // 게임 스코어를 확인하는 메소드
    public void gameCheck() {
    		
        while (!(board[a][1] - board[1 - a][1] > 1 && board[a][1] > 5)) {
            gameRoll(); // 안 끝났으면 포인트 생성
        }
        board[0][1] = board[1][1] = 0; // 게임 점수 초기화
        board[a][2]++; // 승리한 선수가 세트 증가
    }

    public void gameRoll() {
  	
        String[] score = {"0", "15", "30", "40", "WIN"}; // 포인트 생성 위한 스코어 배열

        while (!(board[a][0] > 3)) { // 4점이 아니면 반복
            a = rnd.nextInt(2); // 랜덤으로 포인트를 얻을 선수 선택
            board[a][0]++; // 0번 or 1번 point 값 증가

            if (board[0][0] == 3 && board[1][0] == 3) { // 둘다 3점이면
                a = playDeuce(); // 듀스 메서드로
            }
        }

        // while 탈출하면 게임 승리
        board[a][1]++; // 게임 승리
    }

    private int playDeuce() {
        String[] score = {"0", "15", "30", "40", "AD", "WIN"};
        int a = 0;

        while (!(board[a][0] == 5 && board[1 - a][0] == 3)) { // 포인트가 5고 3차이가 아니면 반복
            a = rnd.nextInt(2); // 랜덤으로 포인트를 얻을 선수 선택
            board[a][0]++; // 포인트 증가

            if (board[a][0] == 4 && board[1 - a][0] == 4) { // 두 선수 모두 듀스 상황일 때
                board[a][0] = 3; // 듀스 포인트로 되돌림
                board[1 - a][0] = 3;
            }

            if (board[1 - a][0] == 4) { // 상대 선수가 AD 면
                board[1 - a][0]--; // 상대 선수 포인트 값 감소
            }
        }

        return a;
    }
}
