package MatrixMultiplier;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class matrixReader {

    private static int[] getArrayFromString(String str, int size){
        String[] splited = str.split("\\s+");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = Integer.parseInt(splited[i]);
        }
        return array;
    }

    public int[][] getMatrix(String filename, int size){
        int[][] matrix = new int[size][size];
        try {
            Scanner myReader = new Scanner(new File(filename));
            int tmpCounter = 0;
            while (myReader.hasNextLine()) {
                if(tmpCounter == size){
                    break;
                }
                String data = myReader.nextLine();
                matrix[tmpCounter] = getArrayFromString(data, size);
                tmpCounter++;

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return matrix;
    }
}