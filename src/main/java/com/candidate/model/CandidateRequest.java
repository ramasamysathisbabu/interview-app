package com.candidate.model;

public class CandidateRequest {
	
	private int candidateId;
	private String prefix;	
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	private String roleApplied;
	private String technicalStack;
	private String interviewer;
	private String interviewScheduleDate;
	private int yearsOfExperience;
	
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getRoleApplied() {
		return roleApplied;
	}
	public void setRoleApplied(String roleApplied) {
		this.roleApplied = roleApplied;
	}
	public String getTechnicalStack() {
		return technicalStack;
	}
	public void setTechnicalStack(String technicalStack) {
		this.technicalStack = technicalStack;
	}
	public String getInterviewer() {
		return interviewer;
	}
	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getInterviewScheduleDate() {
		return interviewScheduleDate;
	}
	public void setInterviewScheduleDate(String interviewScheduleDate) {
		this.interviewScheduleDate = interviewScheduleDate;
	}
	
}
