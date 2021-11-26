package com.company;

public class Task {
	public final Integer id;
	private final String task;
	private final String[] answerArray;
	private final String answer;
	private String hint;
	private final Integer nextTaskId;

	public Task(Integer id, String task, String[] answerArray, String answer, String hint, Integer nextTaskId) {
		this.id = id;
		this.task = task;
		this.answerArray = answerArray;
		this.answer = answer;
		this.hint = hint;
		this.nextTaskId = nextTaskId;
	}

	public Task(Integer id, String task, String[] answerArray, String answer, Integer nextTaskId) {
		this.id = id;
		this.task = task;
		this.answerArray = answerArray;
		this.answer = answer;
		this.nextTaskId = nextTaskId;
	}

	public Boolean submitAnswer(String answerToCheck) {
		return answer.equals(answerToCheck);
	}

	public String getTask() {
		return task;
	}

	public String[] getAnswerArray() {
		return answerArray;
	}

	public String getHint() {
		return hint;
	}

	public Integer getNextTaskId() {
		return nextTaskId;
	}

	public String getAnswer() {
		return answer;
	}
}
