package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Minimum Rounds to Complete All Tasks
 * <p>
 * You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task. In each round, you can complete either 2 or 3 tasks of the same difficulty level.
 * <p>
 * Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.
 * <p>
 * Constraints:
 * <p>
 * 1 <= tasks.length <= 10^5
 * 1 <= tasks[i] <= 10^9
 * <p>
 * <a href="https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/">Minimum Rounds to Complete All Tasks</a>
 */
public class MinimumRoundsToCompleteAllTasks {
	public int minimumRounds(int[] tasks) {
		Map<Integer, Integer> taskCount = new HashMap<>();
		for (int task : tasks) {
			if (taskCount.containsKey(task)) {
				taskCount.put(task, taskCount.get(task) + 1);
			} else {
				taskCount.put(task, 1);
			}
		}
		
		int rounds = 0;
		for (Integer count : taskCount.values()) {
			int minimalRoundToComplete = getMinimalRoundToComplete(count);
			if (minimalRoundToComplete == -1) {
				return -1;
			} else {
				rounds += minimalRoundToComplete;
			}
		}
		
		return rounds;
	}
	
	private int getMinimalRoundToComplete(int levelCount) {
		int levelCountOf3 = levelCount;
		int levelCountOf2 = 0;
		do {
			int div = levelCountOf3 / 3;
			int mod = levelCountOf3 % 3;
			if (mod == 0) {
				return div;
			} else {
				int div2 = (levelCountOf2 + mod) / 2;
				int mod2 = (levelCountOf2 + mod) % 2;
				if (mod2 == 0) {
					return div + div2;
				}
			}
			levelCountOf3 -= 3;
			levelCountOf2 += 3;
		} while (levelCountOf3 > 0);
		return -1;
	}
}
