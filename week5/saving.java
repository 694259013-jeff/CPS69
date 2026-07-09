void main() {
    IO.println("Enter initial saving");
    double initialsaving = Double.parseDouble(IO.readln());

    IO.println("Enter monthly saving");
    double monthlysaving = Double.parseDouble(IO.readln());

    IO.println("Enter number of month");
    double numberofmonth = Double.parseDouble(IO.readln());

    IO.println("Enter interest percent");
    double interestpercent = Double.parseDouble(IO.readln());

    double totalsaveing = initialsaving + monthlysaving * numberofmonth;
    double interest = totalsaveing * interestpercent / 100;
    double finalsaving = totalsaveing + interest;
    IO.println("Total saving before interest is = %.2f ".formatted(totalsaveing) + "bath");
    IO.println("interest is = %.2f ".formatted(interest) + "bath");
    IO.println("Final saving is = %.2f ".formatted(finalsaving) + "bath");
}