package domain;

public class Question {
	private String question;
	private String answer;
	public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
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
