package domain;

import java.util.HashMap;

public class HttpServletRequest {
    private String content;
    private HashMap<String,String> paramsObj;

    public HttpServletRequest(String content, HashMap<String, String> paramsObj) {
        this.content = content;
        this.paramsObj = paramsObj;
    }

    public HttpServletRequest() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public HashMap<String, String> getParamsObj() {
        return paramsObj;
    }

    public void setParamsObj(HashMap<String, String> paramsObj) {
        this.paramsObj = paramsObj;
    }
}
