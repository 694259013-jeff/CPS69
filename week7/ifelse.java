void main() {
    IO.println("Enter number");
    int number = Integer.parseInt(IO.readln());
    if (number % 2 == 0) {
        IO.println("Number " + number + " is even");
    } else {
        IO.println("Number " + number + " is odd");
    }
}