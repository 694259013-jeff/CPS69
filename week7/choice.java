void main() {
    IO.println("Enter number");
    int number = Integer.parseInt(IO.readln());
    if (number == 1) {
        IO.println("Enter base of the triangle");
        double basetriangle = Double.parseDouble(IO.readln());

        IO.println("Enter height of the triangle");
        double heighttriangle = Double.parseDouble(IO.readln());
        double areaoftriangle = (1.0 / 2.0) * basetriangle * heighttriangle;
        IO.println("Enter a number: " + number);
        IO.println("Enter the base of the triangle: " + basetriangle);
        IO.println("Enter the hight of the triangle: " + heighttriangle);
        IO.println("area of the triangle: " + areaoftriangle + " square units");
    } else if (number == 2) {
        IO.println("Enter your weight:");
        double weight = Double.parseDouble(IO.readln());

        IO.println("Enter your height");
        double height = Double.parseDouble(IO.readln());

        double bmi = weight / (height * height);
        IO.println("Enter a number: " + number);
        IO.println("Enter Your weight in kilograms: " + weight);
        IO.println("Enter your height in meters: " + height);
        IO.println("Your MBI for weight = " + weight + "kg and height = " + weight + " meters is: " + bmi + " bmi");
    }
}
