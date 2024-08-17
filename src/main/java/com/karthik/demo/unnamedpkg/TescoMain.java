package com.karthik.demo.unnamedpkg;

/**
 * Tesco has around 3200 stores and more than 10% of the stores have around 800 colleagues each.
 *
 * <p>Capacity: 320 * 800 = 2,56,000 requests we can expect
 *
 * <p>In a store, a colleague can work for multiple departments. Here are shifts of a colleague in
 * various departments:
 *
 * <p>In Checkout department: From 10 to 12 In Bakery department: From 8 to 10 In Diary department:
 * From 14 to 19
 *
 * <p>Given the above split of shifts,
 *
 * <p>provide an API/method to return the different shifts of a colleague for the day after merging
 * contiguous shifts.
 *
 * <p>ClockIn and ClockOut - 8 AM to 12 PM - 2PM to 7PM
 *
 * <p>This will be exposed to the colleague in different UI and help them plan their day
 * accordingly.
 *
 * <p>His shift timings in this case are 8 to 12 and 14 to 19.
 */

// [8,10,10,12,14,19]
// [I,O,I,O,I,O]
// [8,10,12,14,19]
// [I,O,I,O,I]
// a[0]
// a[a.length-1]

/**
 * for that particular empId - grab all details from the DB - get First ClockIn time and grab the
 * last clockOut Time
 *
 * <p>[i,o,i,o,i,o,i,o] [8,9,9.15,12,12.05,14.05,15.00,15.05,19.00] [I,O,I , O,I , 0,I
 *
 * <p>a[i+2] - a[i+1 ] 9.15 - 9 = 8.15
 *
 * <p>14.05 - 12.05 = 2hrs
 *
 * <p>shiftStart = 8 a[0]
 *
 * <p>intermediateShiftEnd = a[i+1], intermediateShiftStart = a[i+2]
 *
 * <p>shiftEnd = 19 a[size -1] for(int i=1,j=2,i<a.size();i++,j++){ //i,i+1 if(a[i+1]-a[i]>=
 * configuredValue){ intermediateShiftEnd = a[i+1], intermediateShiftStart = a[i+2] } }
 *
 * <p>in middle clockOut and clockIn - if the difference between them is more than 1Hr
 *
 * <p>clockOut - shift end immediate clockIn - shift start
 */
public class TescoMain {

  public static void main(String[] args) {
    System.out.println("Hello World...");
    float intermediateShiftEnd = 0.0f;
    float intermediateShiftStart = 0.0f;
    float configuredValue = 2.0f;

    // float[] inputArr = new float[]{8,9,9.15f,12,12.05f,14.05f,15.00f,15.05f,19.00f};
    float[] inputArr = new float[] {8, 10, 10, 12, 14, 19};
    float shiftStart = inputArr[0];
    float shiftEnd = inputArr[inputArr.length - 1];
    // var length = inputArr.length;

    for (int i = 1, j = 2; i < inputArr.length; i++, j++) {
      if (i + 1 < inputArr.length) {
        if (inputArr[i + 1] - inputArr[i] >= configuredValue) {
          if (j + 2 < inputArr.length) {
            // intermediateShiftEnd = inputArr[i+1];
            // intermediateShiftStart = inputArr[i+2];
            intermediateShiftEnd = inputArr[i];
            intermediateShiftStart = inputArr[i + 1];
          }
        }
      }
    }

    System.out.println(
        String.format(
            "His shift timings in this case are %s to %s and %s to %s.",
            shiftStart, intermediateShiftEnd, intermediateShiftStart, shiftEnd));
  }
}
