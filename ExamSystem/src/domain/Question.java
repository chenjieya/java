package domain;

public class Question {
	private String question;
	private String answer;

    private String imgPath;
	public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    public Question(String question, String answer, String imgPath) {
        this.question = question;
        this.answer = answer;
        this.imgPath = imgPath;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(obj instanceof Question) {
            Question another = (Question) obj;

            if (this.question.equals(another.getQuestion())) {
                return true;
            }
        }


        return false;
    }

    @Override
    public int hashCode() {
        return this.question.hashCode();
    }
}
