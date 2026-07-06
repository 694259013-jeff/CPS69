void main() {
    IO.println("Enter your wide:");
    double wide = Double.parseDouble(IO.readln());

    IO.println("Enter your longs");
    double longs = Double.parseDouble(IO.readln());

    double bodysurfacearea = (wide * longs) / 360;
    IO.println("BSA = %.2f".formatted(bodysurfacearea));

}