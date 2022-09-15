public class MyList<T> {

    private T[] array;
    private int size = 0;
    private int capacity;

    MyList() {

        array = (T[]) new Object[10];
        this.capacity = 10;
    }

    MyList(int capacity) {

        this.capacity = capacity;
        array = (T[]) new Object[this.capacity];
    }

    public int size() {

        return this.size;
    }

    public int getCapacity() {

        return this.capacity;
    }

    public void add(T data) {

        if (this.size != this.capacity) {

            this.array[this.size] = data;
            this.size++;

        }

        else {

            T[] tempArray = (T[]) new Object[this.capacity * 2];

            for (int i = 0; i < this.array.length; i++) {

                tempArray[i] = this.array[i];
            }

            this.size++;
            this.capacity = this.capacity * 2;

            this.array = tempArray;
        }
    }

    public T get(int index) {

        if (index < 0 || index > this.size) {

            return null;
        }

        else {

            return this.array[index];
        }
    }

    public T[] remove(int index) {

        if (index >= 0 && index <= this.size) {

            T[] tempArray = (T[]) new Object[this.capacity];

            for (int i = 0; i < this.array.length; i++) {

                if (i < index) {

                    tempArray[i] = this.array[i];

                }

                else if (i > index) {

                    tempArray[i-1] = this.array[i];
                }


            }

            this.size--;
            this.array = tempArray;

            return this.array;
        }

        else {

            return null;
        }

    }

    public T[] set(int index, T data) {


        if (index >= 0 && index < this.size) {

            this.array[index] = data;

            return this.array;
        }

        else {
            return null;
        }

    }

    public String toString() {

        String arrayToString = "";

        arrayToString += "[";

        for (int i = 0; i < this.size; i++) {

            if (i != this.size-1) {

                arrayToString += this.array[i] + ",";
            }

            else {

                arrayToString += this.array[i];
            }

        }

        arrayToString += "]";

        return arrayToString;
    }

    public int indexOf(T data) {

        for (int i = 0; i < this.array.length; i++) {

            if (data == this.array[i]) {

                return i;
            }

        }

        return -1;
    }

    public int lastIndexOf(T data) {

        int lastIndex = -1;

        for (int i = 0; i < this.array.length; i++) {

            if (data == this.array[i]) {

                lastIndex = i;

            }

        }

        return lastIndex;
    }

    public boolean isEmpty() {

        if (size == 0)
            return true;
        else
            return false;
    }

    public T[] toArray() {

        return this.array;
    }

    public void clear() {

        for (int i = 0; i < this.size; i++) {

            this.array[i] = null;
        }

        this.size = 0;
    }

    public MyList<T> subList(int startIndex, int finishIndex) {

        MyList<T> newList = new MyList<T>((finishIndex-startIndex)+1);

        for (int i = startIndex; i <= finishIndex; i++) {

            newList.add(this.array[i]);
        }


        return newList;
    }

    public boolean contains(T data) {

        for (int i = 0; i < this.array.length; i++) {

            if (array[i] == data)
                return true;
        }

        return false;
    }


}
