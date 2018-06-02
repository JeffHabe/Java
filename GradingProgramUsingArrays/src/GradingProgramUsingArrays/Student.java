package GradingProgramUsingArrays;

public class Student {
	private String classID;
	private int[] quizzes = new int[3];
	private int avgQuiz;
	private int midterm;
	private int finalterm;
	private int overallScore;
	private String grade;
	public Student() {

	}

	public Student(String classID, int[] quizzes, int midterm, int finalterm) {
		this.classID = classID;
		this.finalterm = finalterm;
		this.midterm = midterm;
		this.quizzes = quizzes;
	}

	// Accessory
	public String getClassID() {
		return classID;
	}

	public int getMidterm() {
		return midterm;
	}
	public int getAvgQuiz() {
		return avgQuiz;
	}
	public int getFinalterm() {
		return finalterm;
	}
	public int getOverallS() {
		return overallScore;
	}
	public String getGrade() {
		return grade;
	}
	public int[] getQuizzes() {
		return quizzes;
	}
	public int getQuizzes(int n) {
		return quizzes[n];
	}
	// Mutator
	public void setClassID(String classID) {
		this.classID = classID;
	}

	public void setMidterm(int midterm) {
		this.midterm = midterm;
	}

	public void setFinalterm(int finalterm) {
		this.finalterm = finalterm;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setQuizzes(int i, int quizzes) {
		this.quizzes[i] = quizzes;
	}
	public void setAvgQuiz(){
		this.avgQuiz=((this.quizzes[0]+this.quizzes[1]+this.quizzes[2])/3)*10;
	}
	public void setOverAllSc(){
		this.overallScore=(int) Math.round(this.finalterm*0.4+this.midterm*0.35+this.avgQuiz*0.25);
	}
}
