void main() {
    IO.println("Enter your weight:");
    double weight = Double.parseDouble(IO.readln());

    IO.println("Enter your height");
    double height = Double.parseDouble(IO.readln());

    double bmi = weight / (height * height);
    IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(weight, height, bmi));
}