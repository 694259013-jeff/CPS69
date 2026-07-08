void main() {
    IO.println("Enter hours: ");
    int hours = Integer.parseInt(IO.readln());

    IO.println("Enter minutes");
    int minutes = Integer.parseInt(IO.readln());

    int total = (hours * 60) + minutes;
    IO.println(total);
}