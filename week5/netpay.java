void main() {
    IO.println("Enter price of dress:");
    double price = Double.parseDouble(IO.readln());

    IO.println("Enter number of dress to buy:");
    double number = Double.parseDouble(IO.readln());

    IO.println("Enter discount rate:");
    double discount = Double.parseDouble(IO.readln());
    double totalcost = price * number;
    double discountAmount = discount * number;
    double netPay = totalcost - discountAmount;
    IO.println("Total cost = " + totalcost);
    IO.println("discountAmount = " + discountAmount);
    IO.println("Net pay = " + netPay);
}