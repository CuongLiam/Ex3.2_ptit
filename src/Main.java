public class Main {
    public static void randomArray(double[] doubleArray){
        for (int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = (double)(Math.random() * 10);
        }
    }

    public static void printArray(double[] doubleArray){
        for (double i : doubleArray){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] doubleArray = new double[5];

        randomArray(doubleArray);

        printArray(doubleArray);
    }
}