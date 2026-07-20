void main() {
    IO.println("Enter mid term");
    int midterm = Integer.parseInt(IO.readln());

    IO.println("Enter mid final");
    int finals = Integer.parseInt(IO.readln());

    int total = midterm + finals;
    IO.println("Enter your midterm score: " + midterm);
    IO.println("Enter your final score: " + finals);
    if (total >= 50) {
        IO.println("Your total score is " + total + " the result in pass!!");
    } else {
        IO.println("Your total score is " + total + " the result in fail!!");
    }
}