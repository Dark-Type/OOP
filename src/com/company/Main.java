package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Task[] tasksArray = {
				new Task(1,
						"Выберите единицу",
						new String[]{"1", "2", "3"},
						"1",
						"Первый пункт",
						2),
				new Task(2,
						"Выберите двойку",
						new String[]{"1", "2", "3"},
						"2",
						"Второй пункт",
						3),
				new Task(3,
						"Выберите тройку",
						new String[]{"1", "2", "3"},
						"3",
						"Третий пункт",
						null)
		};

		TaskManager taskManager = new TaskManager(tasksArray);

		Quest quest = new Quest(taskManager);

		quest.startGame();
	}
}


