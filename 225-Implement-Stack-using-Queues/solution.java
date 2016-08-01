class MyStack {
    // Push element x onto stack.
    Queue<Integer> q = new LinkedList<>();
    public void push(int x) {
        q.offer(x);
        for(int i = 1; i < q.size(); i++) {
            q.offer(q.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.remove();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
}