package y2020_mehta_sujay_period_4_individual_project;

import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Score extends Text {

    private int score;

    public Score() {
        this.setFont(new Font (50));
        score = 0;
        updateDisplay();
    }

    public void updateDisplay() {
        this.setText ( score + "" );
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        updateDisplay();
    }

}

