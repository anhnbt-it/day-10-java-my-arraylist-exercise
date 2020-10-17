/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/17/2020
 * Time: 10:10 AM
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> listString = new MyArrayList<>();

        // Them phan tu vao ArrayList
        listString.add("one");
        listString.add("two");
        listString.add("three");
        listString.add("four");
        listString.add("five");
        System.out.println("size=" + listString.size() + " and capacity is " + listString.DEFAULT_CAPACITY);
        for (int i = 0; i < listString.size(); i++) {
            System.out.println("Element at index " + i + ": " + listString.get(i));
        }

        // Them phan tu vao mang tai vi tri chi dinh
        int addIndex = 0;
        String addItem = "CodeGym";
        listString.add(addIndex, addItem);
        System.out.println("-----------\nThem phan tu " + addItem + " tai vi tri " + addIndex);
        System.out.println("size=" + listString.size() + " and capacity is " + listString.DEFAULT_CAPACITY);
        for (int i = 0; i < listString.size(); i++) {
            System.out.println("Element at index " + i + ": " + listString.get(i));
        }

        // Xoa phan tu trong mang
        int removeIndex = 1;
        String removeItem = listString.remove(removeIndex);
        System.out.println("------------\nXoa phan tu tai vi tri " + removeIndex + ": " + removeItem);
        System.out.println("size=" + listString.size() + " and capacity is " + listString.DEFAULT_CAPACITY);
        for (int i = 0; i < listString.size(); i++) {
            System.out.println("Element at index " + i + ": " + listString.get(i));
        }
    }
}
