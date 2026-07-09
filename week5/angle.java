void main() {
    IO.println("Enter base of the triangle");
    double basetriangle = Double.parseDouble(IO.readln());

    IO.println("Enter height of the triangle");
    double heighttriangle = Double.parseDouble(IO.readln());
    double areaoftriangle = (1.0/2.0) * basetriangle * heighttriangle;
    IO.println("area of the triangle: " + areaoftriangle + " square units");

    IO.println("Enter length of the rectangle");
    double lengthrectangle = Double.parseDouble(IO.readln());
    
    IO.println("Enter width of the rectangle");
    double widthrectangle = Double.parseDouble(IO.readln());
    double areaofrectangle = lengthrectangle * widthrectangle;
    IO.println("area of the rectangle: " + areaofrectangle + " square units");
}