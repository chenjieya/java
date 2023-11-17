package domain;

public class HttpServletResponse {

    private StringBuilder responseContent = new StringBuilder();

    public void write(String str) {
        this.responseContent.append(str);
    }

    public String getResponseContent() {
        return this.responseContent.toString();
    }
}
