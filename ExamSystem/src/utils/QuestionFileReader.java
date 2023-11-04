package utils;

import domain.Question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class QuestionFileReader {
    public static HashSet<Question> questionBox = new HashSet<>();  //题库

    static {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            File file = new File("src//dbfile//Question.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = br.readLine();


            while (line != null) {
                String[] values = line.split("#");
                questionBox.add(new Question(values[0], values[1]));
                line = br.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
