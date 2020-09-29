class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
        int defaultedDays= 5;
        int amountToPayPerDay= 1000;
        int amountPaid= 3000;
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
        int amountToPay;
        int daysPaidFor;
        int daysToPay;
        int amountLeftToPay;
        int daysNotCaptured;
   // calculate and print total amount the debtor is to pay
        amountToPay= amountToPayPerDay*defaultedDays;
        System.out.println("The amount to pay is " + amountToPay);
   // calculate and print the days the debtor paid for
        daysPaidFor= amountPaid/amountToPayPerDay;
        System.out.println("The amount of days to be paid for is " + daysPaidFor);
  // calculate and print the amount whose day was not captured because the amount was incomplete
        daysNotCaptured= defaultedDays%daysPaidFor;
        System.out.println("The amount of incomplete days is " + daysNotCaptured);
   // calculate and print amount the debtor is left to pay
        amountLeftToPay= amountToPay-amountPaid;
        System.out.println("The amount the debtor is left to pay is " + amountLeftToPay);
   // calculate and print days the debtor has not payed for
        daysToPay= defaultedDays-daysPaidFor;
        System.out.println("The number of days to pay is " + daysToPay);
   //kindly remove the statement below when you are done with the assignment
  }
}