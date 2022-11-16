package com.ba.boost.day18.school;

public class Course {
	
	private String lessonName;
	private long lessonCode;
	
	
	
	public Course(String lessonName, long lessonCode) {
		super();
		this.lessonName = lessonName;
		this.lessonCode = lessonCode;
	}

	public Course() {
		super();
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public long getLessonCode() {
		return lessonCode;
	}

	public void setLessonCode(long lessonCode) {
		this.lessonCode = lessonCode;
	}

	@Override
	public String toString() {
		return "Course [lessonName=" + lessonName + ", lessonCode=" + lessonCode + "]";
	}
	
	
	
	
	
	

}
