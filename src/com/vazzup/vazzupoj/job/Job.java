package com.vazzup.vazzupoj.job;

public class Job implements Comparable<Job> {

	/**Class that contains information about job to be completed
	 * programeName - name of program to be run
	 * questionID - ID of question for which the solution is made.
	 * language - language in which solution has been submitted 
	 * jobPriority - priority of Job
	 */
	
	private String programName, questionID, language;
	private int jobPriority;
	
	/*
	 * Constructor
	 */
	
	public Job(String programName, String questionID, String language, int jobPriority) {
		this.programName = programName;
		this.questionID = questionID;
		this.language = language;
		this.jobPriority = jobPriority;
	}
	
	/*
	 * Methods to access private variables
	 */
	
	public String getProgramName() {
		return this.programName;
	}
	
	public String getQuestionID() {
		return this.questionID;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public int getJobPriority() {
		return this.jobPriority;
	}
	
	/*
	 * Method to compare two Jobs.
	 * Negative indicates current job has lower priority than other Job.
	 * Zero indicates current job has equal priority than other Job.
	 * Positive indicates current job has higher priority than other Job.
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	
	@Override
	public int compareTo(Job o) {
		if (this.getJobPriority() < o.getJobPriority())
			return -1;
		else if (this.getJobPriority() > o.getJobPriority())
			return 1;
		else
			return 0;
	}
	
}