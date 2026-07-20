void main() {
    IO.println("Enter num1");
    int num1 = Integer.parseInt(IO.readln());

    IO.println("Enter num2");
    int num2 = Integer.parseInt(IO.readln());

    if (num1 > num2) {
        int total = num1 - num2;
        IO.println("num1 = " + num1 + " - " + "num2 = " + num2 + " total = " + total);
    } else {
        int total = num1 + num2;
        IO.println("num1 = " + num1 + " + " + "num2 = " + num2 + " total = " + total);
    }
}