package tennisGame;

public class SaveFile {
   private String fileName;

    public SaveFile(String fileName) {
        this.fileName = fileName;
    }

    public void saveScorePalyer(String palyer, int scoreBoard) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            // 요소와 점수를 파일에 저장
            writer.write(palyer + "," + scoreBoard + "\n");
//            System.out.println("요소 '" + palyer + "'와 점수 " + score + "를 파일에 저장했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 사용 예시
        SaveFile saveFile = new SaveFile("palyers_scores.txt");
        saveFile.saveScorePalyer("Hydrogen", 1.008);
        saveFile.saveScorePalyer("Oxygen", 16.00);
    }
}
