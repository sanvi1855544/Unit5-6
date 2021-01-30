//Unit 6 Question 2
import java.util.Arrays;

public class Payroll
{
    //attribute
    private int[] itemsSold; //number of iterms sold by each employee
    private double[] wages; //wages to be computed in part b

    /** Returns the bonus threshold as described in part (a).
     */

    //calculates bonus threshold by changing scope of array in for loop
    public double computeBonusThreshold()
    {
        Arrays.sort(itemsSold);
        double sum = 0.0;
        for(int i = 1; i < itemsSold.length-1; i++){
            sum += itemsSold[i];
        }
        return sum/(itemsSold.length-2);
    }
    /** Compute employee wages as described in part (b)
     * and stores them in wages.
     * The parameter fixedWage represents the fixed amount each employee
     * is paid per day
     * The parameter perItemWage represents the amount each employee
     * is paid per item sold
     */

    //uses conditional to differentiate whether or not person will get bonus
    public void computeWages(double fixedWage, double perItemWage)
    {
        double bonusThreshhold = computeBonusThreshold();
        for(int i = 0; i < itemsSold.length; i++){
            if (itemsSold[i] >= bonusThreshhold){
                wages[i] = 1.1*(fixedWage + perItemWage*itemsSold[i]);
            }
            else{
                wages[i] = fixedWage + perItemWage*itemsSold[i];
            }
        }
    }


}