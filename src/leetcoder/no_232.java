package leetcoder;

import java.util.Stack;

public class no_232 {
	class MyQueue {
		private Stack<Integer> myque =  new Stack<>();
	    // Push element x to the back of queue.
	    public void push(int x) {
	    	if(this.empty()) {myque.add(x);return;}
	    	Stack<Integer> temp = new Stack<>();
	    	int length = myque.size();
	    	for (int i = 0; i < length; i++) {
				temp.add(myque.pop());
			}
	    	myque = temp;
	    	myque.add(x);
	    	temp = new Stack<>();
	    	length = myque.size();
	    	for (int i = 0; i < length; i++) {
				temp.add(myque.pop());
			}
	    	myque = temp;
	    }

	    // Removes the element from in front of queue.
	    public void pop() {
	        myque.pop();
	    }

	    // Get the front element.
	    public int peek() {
	        return myque.peek();
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	        return myque.empty();
	    }
	}
	
	public static void main(String[] args) {
		no_232 test  = new no_232();
		MyQueue te1 = test.new MyQueue();
		te1.push(1);
		te1.push(2);
		
		System.out.println(te1.peek());
		
	}
	
}

//if (s1.empty())
//    front = x;
//while (!s1.isEmpty())
//    s2.push(s1.pop());
//s2.push(x);
//while (!s2.isEmpty())
//    s1.push(s2.pop());
