package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Quest {
	private final TaskManager taskManager;

	private final Scanner scanner;

	public Quest(TaskManager taskManager) {
		this.taskManager = taskManager;

		scanner = new Scanner(System.in);
	}

	public void startGame() {
		showTask(1);
	}

	private void showTask(Integer taskId) {
		boolean stop = false;
		if (taskId != null && !stop) {

			Task currentTask = taskManager.getTaskById(taskId);

			System.out.println(currentTask.getTask());

			System.out.println(Arrays.toString(currentTask.getAnswerArray()));

			System.out.println("Введите ответ");

			if (currentTask.submitAnswer(scanner.nextLine())) {
				System.out.println("Ответ верный ");
				System.out.println("Хотите продолжить ?(y/n)");
				if (scanner.nextLine().equals("n")) {
					System.out.println("Квест закончен");
					stop = true;
				}
			}else{
				System.out.println(" Ответ неверный. Нужна ли вам подсказка?(y/n)");
				if (scanner.nextLine().equals("y")) {
					System.out.println(currentTask.getHint());
				}
			}
			showTask(currentTask.getNextTaskId());
		} else {
			System.out.println("Квест закончен");
		}
	}


	}

