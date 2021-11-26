package com.company;

import java.util.Objects;

public class TaskManager {
	private final Task[] arrayOfTasks;

	public TaskManager(Task[] arrayOfTasks) {
		this.arrayOfTasks = arrayOfTasks;
	}

	public Task getTaskById(Integer idToSearch) {
		for (Task task : arrayOfTasks) {
			if (Objects.equals(task.id, idToSearch)) {
				return task;
			}
		}

		return null;
	}
}
