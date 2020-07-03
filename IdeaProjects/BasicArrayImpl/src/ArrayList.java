import java.util.*;

public class ArrayList implements IList {
    // BEGIN (write your solution here)
    private int size;
    private int coef;
    private int DEFAULT_SIZE = 10;
    private Object[] objecti = new Object[DEFAULT_SIZE];
    // END


    public synchronized void add(final Object element) {
        // BEGIN (write your solution here)
        objecti[size++] = element;
        if(size == objecti.length) {
            coef = objecti.length / 2;
            objecti = Arrays.copyOf(objecti, objecti.length + coef);
        }
        // END
    }

    public synchronized void removeLast() {
        // BEGIN (write your solution here)
        if (size != 0 ) {
            objecti[size - 1] = null;
            size--;
        }

        // END
    }

    public int size() {
        // BEGIN (write your solution here)
        return size;
        // END
    }

    public Object get(final int index) {
        // BEGIN (write your solution here)
        if (index < 0 || index >= size) {
            return null;
        }

        return objecti[index];
        // END
    }

    public synchronized void set(final int index, final Object object) {
        // BEGIN (write your solution here)
        objecti[index] = object;
        // END
    }

}