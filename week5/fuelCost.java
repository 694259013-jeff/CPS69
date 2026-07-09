void main() {
    IO.println("Enter Distance: ");
    double distance = Double.parseDouble(IO.readln());

    IO.println("Enter fuel efficiency: ");
    double efficiency = Double.parseDouble(IO.readln());

    IO.println("Enter fuel price: ");
    double price = Double.parseDouble(IO.readln());

    double use = distance / efficiency;
    double cost = use * price;
    IO.println("Fuel use:" + use + " liters");
    IO.println("Total fuel cost:" + cost + " bath");
}