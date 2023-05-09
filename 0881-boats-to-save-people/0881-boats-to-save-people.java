class Solution{
	// TC: O(n log n); SC: O(1)
	public static int numRescueBoats(int[] people, int limit) {
		// Step-1: Sort the array:
		Arrays.sort(people); // O(n log n)

		// Step-2: Two Pointer Iteration:
		int ep =people.length -1, sp = 0, cnt = 0;
		while(sp <= ep){ // O(n)
			int sum = (people[sp] + people[ep]);
			if(sum <= limit){cnt++;sp++;ep--;}
			else if(sum > limit) {cnt++;ep--;}
		}
		return cnt;
	}
}