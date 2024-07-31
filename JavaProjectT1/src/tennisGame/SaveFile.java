package tennisGame;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveFile {
	String fileName = ".\\src\\tennisGame\\SaveFile.txt";
	
    public SaveFile(String fileName) {
        this.fileName = fileName;
    }

    public void saveScorePalyer(String name, int scoreBoardSet/*임의의세트*/, int scoreBoardGame/*임의의게임*/, int scoreBoardScore/*임의의점수*/) {
        try (FileWriter writer = new FileWriter(fileName)) {
            // 요소와 점수를 파일에 저장
            String info = String.format("%s",name);
            writer.append(info);
            writer.flush();
            System.out.println(info);
       } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

//    public static void main(String[] args) {
//        // 사용 예시
//    	Scanner scanner = new Scanner(System.in);
//    	
//    	Player pr = new Player();
////    	ScoreBoard sb = new ScoreBoard();
//    	SaveFile saveFile = new SaveFile(".\\src\\tennisGame\\SaveFile.txt");
////    	saveFile.saveScorePalyer(플레이어, 세트, 게임, 점수);
//        saveFile.saveScorePalyer(pr.name[0], 0, 1, 15);
//        saveFile.saveScorePalyer(pr.name[1], 1, 3, 40);
//        
//        // Scanner 닫기
//        scanner.close();
//    }
}
