package domain;

import java.io.*;

public class HttpServletResponse {

    private StringBuilder responseContent = new StringBuilder();

    public void write(String str) {
        this.responseContent.append(str);
    }

    public String getResponseContent() {
        return this.responseContent.toString();
    }


    public void readFileContent(String path) {
        try {
            File file = new File("src//file//"+path);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = br.readLine();

            while(line != null) {
                this.responseContent.append(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
