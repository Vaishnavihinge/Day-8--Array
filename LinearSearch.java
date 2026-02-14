
public class LinearSearch {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};
        int key = 40;
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
