package P20;
class GenericExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Apple", "Banana", "Cherry"};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        printIntArray(intArray);
        printStringArray(strArray);
        printDoubleArray(doubleArray);
    }

    static void printIntArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void printStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void printDoubleArray(Double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
