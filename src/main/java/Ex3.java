public class Ex3 {
    public static void main(String[] args) {
        String[] array = {"значение1", null, "значение2", "значение3"};
        printArray(array);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String item = array[i];
            if (item == null) {
                throw new NullPointerException("В массиве один из элементов принимает значение null");
            }
            System.out.println(item);
        }
    }
}
