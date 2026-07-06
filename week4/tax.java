void main() {
    IO.println("Enter saraly:");
    double saraly = Double.parseDouble(IO.readln());

    double tax = (saraly * 0.10);
    IO.println("tax = %.2f".formatted(tax));

}