package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

//		List<Integer> input = Arrays.asList(-1, 1, 2, -2, -5, 5, 0, -1);
//		System.out.println("Input: " + input);
//		System.out.println("Output: " + findAll(input));
//		System.out.println("Output: " + findAllWithSort(input));
		
		System.out.println("Output: " + threeSum_R5(new int[]{-1,0,1,2,-1,-4}));
	}
	
	
	public static Set<List<Integer>> findAll(List<Integer> nums) {
		Set<List<Integer>> result = new HashSet<>();
		
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				for (int k = j + 1; k < nums.size(); k++) {
					
					if (nums.get(i) + nums.get(j) + nums.get(k) == 0) {
						List<Integer> arr = Arrays.asList(nums.get(i), nums.get(j), nums.get(k));
						Collections.sort(arr);
						result.add(arr);
					}
				}
			}
		}
		return result;
	}
	
	public static Set<List<Integer>> findAllWithSort(List<Integer> nums) {
		Set<List<Integer>> result = new HashSet<>();
		
		Collections.sort(nums);
		
		for (int i = 0; i < nums.size() - 2; i++) {
			for (int j = nums.size() - 1; j >= i + 2; j--) {
				for (int k = i + 1; k < j && nums.get(i) + nums.get(j) + nums.get(k) <= 0; k++) {
					
					if (nums.get(i) + nums.get(j) + nums.get(k) == 0) {
						List<Integer> arr = Arrays.asList(nums.get(i), nums.get(j), nums.get(k));
						Collections.sort(arr);
						result.add(arr);
					}
				}
			}
		}
		return result;
	}
	
	public static List<List<Integer>> threeSum_R(int[] nums) {
		Set<List<Integer>> result = new HashSet<>();
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = nums.length - 1; j >= i + 2; j--) {
				for (int k = i + 1; k < j && nums[i] + nums[j] + nums[k] <= 0; k++) {
					
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> arr = Arrays.asList(nums[i], nums[j], nums[k]);
						Collections.sort(arr);
						result.add(arr);
					}
				}
			}
		}
		return new ArrayList<>(result);
	}
	
	public static List<List<Integer>> threeSum_R2(int[] nums) {
		Set<List<Integer>> result = new HashSet<>();
		
		Arrays.sort(nums);
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = nums.length - 1; j > i; j--) {
				int find = -(nums[i] + nums[j]);
				Integer index = map.get(find);
				if (index != null && index != i && index != j) {
					List<Integer> arr = Arrays.asList(nums[i], nums[j], nums[index]);
					Collections.sort(arr);
					result.add(arr);
				}
			}
		}
		return new ArrayList<>(result);
	}
	
	public static List<List<Integer>> threeSum_R4(int[] nums) {
		Set<List<Integer>> result = new HashSet<>();
		
		Arrays.sort(nums);
		
		for (int index = 0; index < nums.length - 2; index++) {
			if (index > 0 && nums[index] == nums[index - 1]) continue;
			
			for (int i = index + 1; i < nums.length - 1; i++) {
				if (i > index + 1 && nums[i] == nums[i - 1]) continue;
				for (int j = nums.length - 1; j > i; j--) {
					if (j < nums.length - 1 && nums[j] == nums[j + 1]) continue;
					
					if (nums[i] + nums[j] + nums[index] == 0) {
						List<Integer> arr = Arrays.asList(nums[i], nums[j], nums[index]);
						Collections.sort(arr);
						result.add(arr);
					}
				}
			}
		}
		return new ArrayList<>(result);
	}
	
	
	public static List<List<Integer>> threeSum_R5(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		
		Arrays.sort(nums);
		
		for (int k = 0; k < nums.length - 2; k++) {
			// Same number continue
			if (k > 0 && nums[k] == nums[k - 1]) continue;
			
			int i = k + 1;
			int j = nums.length - 1;
			
			for (; i < j; i++) {
				// Same number continue
				if (i > k + 1 && nums[i] == nums[i - 1]) continue;
				for (; j > i; j--) {
					// Same number continue
					if (j < nums.length - 1 && nums[j] == nums[j + 1]) continue;
					if (nums[i] + nums[j] > -nums[k]) continue;
					if (nums[i] + nums[j] < -nums[k]) break;
					
					if (nums[i] + nums[j] + nums[k] == 0) {
						result.add(Arrays.asList(nums[i], nums[j], nums[k]));
					}
				}
			}
		}
		return result;
	}
	
	public static List<List<Integer>> threeSum_R3(int[] nums) {
		Set<List<Integer>> result = new HashSet<>();
		
		Arrays.sort(nums);
		
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.get(nums[i]).add(i);
			} else {
				map.put(nums[i], new ArrayList<>(List.of(i)));
			}
			
		}
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (i > 0 && nums[i - 1] == nums[i] && nums[i] != 0) continue;
			for (int j = nums.length - 1; j >= i + 2; j--) {
				if (j < nums.length - 1 && nums[j] == nums[j + 1] && nums[j] != 0) continue;
				int find = -(nums[i] + nums[j]);
				List<Integer> indexs = map.get(find);
				if (indexs != null && (indexs.contains(i) && indexs.contains(j) && indexs.size() > 2)) {
					List<Integer> arr = Arrays.asList(nums[i], nums[j], find);
					Collections.sort(arr);
					result.add(arr);
				}
			}
		}
		return new ArrayList<>(result);
	}
	
	public static List<List<Integer>> threeSum_Ornit(int[] nums) {
		
		List<List<Integer>> result = new ArrayList<>();
		Set<Integer> visited1 = new HashSet<>();
		Set<Integer> visited2 = new HashSet<>();
		
		//init hash map (value to i) in case of duplicate, last index will be saved
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
			map.put(nums[i], i);
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (visited1.contains(nums[i])) continue;//duplication case
			
			for (int j = i + 1; j < nums.length; j++) {
				
				int complementary = -nums[i] - nums[j];
				if (visited2.contains(complementary) || visited2.contains(nums[j])) continue;
				else if (map.containsKey(complementary)) {
					int index = map.get(complementary);
					if (index != i && index != j) {
						List<Integer> triple = List.of(nums[i], nums[j], complementary);
						result.add(triple);
						visited2.add(complementary);
						visited2.add(nums[j]);
					}
				}
			}
			visited1.add(nums[i]);
			visited2 = new HashSet<>(visited1);
		}
		return result;
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
			if (i == 0 || nums[i - 1] != nums[i]) {
				twoSumII(nums, i, res);
			}
		return res;
	}
	
	static void twoSumII(int[] nums, int i, List<List<Integer>> res) {
		int lo = i + 1, hi = nums.length - 1;
		while (lo < hi) {
			int sum = nums[i] + nums[lo] + nums[hi];
			if (sum < 0) {
				++lo;
			} else if (sum > 0) {
				--hi;
			} else {
				res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
				while (lo < hi && nums[lo] == nums[lo - 1])
					++lo;
			}
		}
	}
}