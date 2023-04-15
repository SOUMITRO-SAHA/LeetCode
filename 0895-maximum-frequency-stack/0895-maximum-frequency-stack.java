class FreqStack {

    // LinkedList for Custom Stack:
	HashMap<Integer, LinkedList<Integer>> st; // Fq => Stack
	HashMap<Integer, Integer> fmap; // No => Frequency
	int maxFq;
	public FreqStack() {
		st = new HashMap<>();
		fmap = new HashMap<>();
		maxFq = 0;
    }

    public void push(int x) {
		int cfreq = fmap.getOrDefault(x, 0);
		cfreq++;
		fmap.put(x, cfreq);

		if(st.containsKey(cfreq) == false){
			st.put(cfreq, new LinkedList<Integer>());
		}

		// Putting the Value at the corresponding Stack:
		st.get(cfreq).addFirst(x);
		// Updating the maxFq:
		maxFq = Math.max(maxFq, cfreq);
    }

    public int pop() {
		int ans = st.get(maxFq).removeFirst();
        
		// Updating the Fq map:
		int cfreq = fmap.get(ans);
        cfreq--;
        fmap.put(ans, cfreq);

		if(st.get(maxFq).size() == 0) maxFq--;
		
		return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */