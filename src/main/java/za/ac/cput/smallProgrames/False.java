package za.ac.cput.smallProgrames;

/**
 * Created by student on 2015/02/12.
 */
public class False {
    public boolean isOddNumber(int number) {

        boolean result = false;
        if (number % 2 == 0) {
            result = true;
        }
        return result;
    }
}