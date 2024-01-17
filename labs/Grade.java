
public class Grade {

	private int midtermExamGrade;
	private int finalExamGrade;
	private char grade;

	public Grade() {
		midtermExamGrade = 0;
		finalExamGrade = 0;
		grade = 'N';
	}

	public Grade(int midtermExamGrade, int finalExamGrade, char grade) {
		this.midtermExamGrade = midtermExamGrade;
		this.finalExamGrade = finalExamGrade;
		this.grade = grade;
	}

	public Grade(Grade g) {
		midtermExamGrade = g.midtermExamGrade;
		finalExamGrade = g.finalExamGrade;
		grade = g.grade;
	}

	private void Evaluate() {

		int midtermG = (midtermExamGrade * 33) / 100;
		int finalG = (finalExamGrade * 67) / 100;

		if (midtermG + finalG <= 60 && midtermG + finalG >= 0)
			grade = 'F';
		else if (midtermG + finalG >= 60 && midtermG + finalG <= 100)
			grade = 'P';
	}

	public void setMidtermExamGrade(int m) {

		this.midtermExamGrade = m;
	}

	public void setFinalExamGrade(int f) {

		this.finalExamGrade = f;
	}

	public void setGrade(char g) {

		this.grade = g;
	}

	public int getMidtermExamGrade() {

		return this.midtermExamGrade;
	}

	public int getFinalExamGrade() {

		return this.finalExamGrade;
	}

	public char getGrade() {

		return this.grade;
	}

	public boolean equals(Grade equal) {

		return this.midtermExamGrade == equal.midtermExamGrade && this.finalExamGrade == equal.finalExamGrade
				&& this.grade == equal.grade;

	}

	public String toString() {

		return this.midtermExamGrade + " " + this.finalExamGrade + " " + this.grade;

	}
}
