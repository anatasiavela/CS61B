package synthesizer;

/**
 * Created by anastasiav on 2/21/2017.
 */

public abstract class AbstractBoundedQueue<T> implements BoundedQueue<T> {
    protected int fillCount;
    protected int capacity;

    public int capacity() {
        return capacity;
    }
    public int fillCount() {
        return fillCount;
    }


}
