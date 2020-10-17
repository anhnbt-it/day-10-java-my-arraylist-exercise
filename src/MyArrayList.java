/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/17/2020
 * Time: 9:27 AM
 */
public class MyArrayList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        // Tao mot danh sach trong voi dung luong ban dau duoc chi dinh
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Kich thuoc mang phai la so nguyen duong");
        } else {
            elements = new Object[initialCapacity];
        }
    }

    public int size() {
        // Tra ve so phan tu trong danh sach
        return size;
    }

    public boolean add(E e) {
        // Them phan tu duoc chi dinh vao cuoi danh sach
        elements[size++] = e;
        return true;
    }

    public void add(int index, E element) {
        // Chen phan tu vao vi tri duoc chi dinh trong danh sach
        if (index >= size) {
            throw new IndexOutOfBoundsException("Vi tri " + index + " vuot qua kich thuoc mang");
        }
        E prevElement = element;
        for (int i = index; i < size; i++) {
            E temp = prevElement;
            prevElement = (E) elements[i];
            elements[i] = temp;
        }
        elements[size++] = prevElement;
    }

    public void clear() {
        // Xoa tat ca cac phan tu khoi danh sach
        throw new UnsupportedOperationException();
    }

    public Object clone() {
        // Tra ve mot ban sao cua ArrayList
        throw new UnsupportedOperationException();

    }

    public boolean contains(Object o) {
        // Tra ve true neu danh sach nay chua phan tu duoc chi dinh
        throw new UnsupportedOperationException();
    }

    public void ensureCapacity(int minCapacity) {
        // Tang kich thuoc cua ArrayList
        throw new UnsupportedOperationException();
    }

    public E get(int index) {
        // Tra ve phan tu o vi tri da chi dinh trong danh sach
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public int indexOf(Object o) {
        /* Tra ve chi so cua lan xuat hien dau tien
         * cua phan tu duoc chi dinh trong danh sach
         * hoac -1 neu danh sach nay khong chua phan tu
         */
        throw new UnsupportedOperationException();
    }

    public E remove(int index) {
        // Loai bo phan tu tai vi tri duoc chi dinh
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Khong tim thay phan tu cua vi tri: " + index);
        }
        E removeItem = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        elements[size] = null;
        return removeItem;
    }

}
