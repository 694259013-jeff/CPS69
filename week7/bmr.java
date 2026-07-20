void main() {
    IO.println("Enter gender male = 1 female = 2");
    int Gender = Integer.parseInt(IO.readln());

    IO.println("Enter weight");
    int Weight = Integer.parseInt(IO.readln());
    
    IO.println("Enter height");
    int Height = Integer.parseInt(IO.readln());

    IO.println("Enter age");
    int Age = Integer.parseInt(IO.readln());

    if(Gender == 1){
        double bmr = 66 + (13.7 * Weight) + (5 * Height) - (6.8 * Age);
        IO.println("Your gender: male");
        IO.println("Your weight: " + Weight);
        IO.println("You height: " + Height);
        IO.println("Your age: " + Age);
        IO.println("bmr = " + bmr);
    } else if (Gender == 2){
        double bmr = 655 + (9.6 * Weight) + (1.8 * Height) - (4.7 * Age);
        IO.println("Your gender: female ");
        IO.println("Your weight: " + Weight);
        IO.println("You height: " + Height);
        IO.println("Your age: " + Age);
        IO.println("bmr = " + bmr);
    }
}