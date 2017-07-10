package HW_05_1;

public class ObjectQueue
{
    private ObjectBox head = null;
    private ObjectBox tail = null;
    private int size = 0;
    private boolean valueSet = false;

    public synchronized void push(Object obj) {
        while (valueSet)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
        ObjectBox ob = new ObjectBox();
        ob.setObject(obj);
        if (head == null) {
            head = ob;
        } else {
            tail.setNext(ob);
        }
        tail = ob;
        size++;
        valueSet=true;
        notify();
    }

    public synchronized Object pull() {
        while (!valueSet)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
        if (size == 0) {
            valueSet=false;
            notify();
            return null;
        }
        Object obj = head.getObject();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        valueSet=false;
        notify();
        return obj;
    }

    public int size() {
        return size;
    }

    private class ObjectBox
    {
        private Object object;
        private ObjectBox next;

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public ObjectBox getNext() {
            return next;
        }

        public void setNext(ObjectBox next) {
            this.next = next;
        }
    }
}
