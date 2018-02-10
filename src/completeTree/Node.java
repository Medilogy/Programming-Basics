package completeTree;

public class Node<T> {
    T data;

    public Node(T data) {
        this.data = data;
    }

    int position;

    public int getPosition() {
        return position;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
