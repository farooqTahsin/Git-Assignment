public class Queue {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size<0)return;
        this.size = size;
    }
}
