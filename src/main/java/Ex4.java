import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        int[] Array1 = FillArray(18);
        int[] Array2 = FillArray(20);

        int[] compArray = compareArrays(Array1, Array2);
    }

    public static int[] FillArray(int length){
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    public static int[] compareArrays(int[] array1, int[] array2) {
        if(array1.length != array2.length) {
            throw new RuntimeException("Массивы разной длины");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }
}
