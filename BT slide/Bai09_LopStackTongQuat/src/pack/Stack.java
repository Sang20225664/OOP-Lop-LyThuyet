package pack;

class Stack<T> {
    private T[] elements;
    private int size;

    // Constructor không tham số
    @SuppressWarnings("unchecked")
    public Stack() {
        this.elements = (T[]) new Object[10]; // Mặc định dung lượng là 10
        this.size = 0;
    }

    // Constructor với dung lượng cụ thể
    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Kiểm tra stack có rỗng không
    public boolean isEmpty() {
        return size == 0;
    }

    // Kiểm tra stack có đầy không
    public boolean isFull() {
        return size == elements.length;
    }

    // Lấy phần tử trên cùng của stack mà không xóa
    public T peak() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }

    // Đẩy phần tử vào stack
    public void push(T value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        elements[size++] = value;
    }

    // Lấy phần tử trên cùng của stack và xóa nó
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = elements[--size];
        elements[size] = null; // Xóa tham chiếu để tránh rò rỉ bộ nhớ
        return value;
    }

    // Lấy kích thước hiện tại của stack
    public int getSize() {
        return size;
    }
}