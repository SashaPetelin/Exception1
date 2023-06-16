public class Ex2 {
    public static void main(String[] args) {
        int[] array = {11, 435, 21, 664, 2512, 858, 255, 858, 152, 169};
        IndexValue(array, 10);
    }

    public static void IndexValue(int[] array, int index) {
        if (index > array.length - 1)
            throw new ArrayIndexOutOfBoundsException("Элемент с заданным индексом выходит за пределы массива");
        else System.out.printf("Значение элемента под искомым индексом = " + array[index]);
    }
}
