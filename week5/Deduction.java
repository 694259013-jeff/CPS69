void main() {
    IO.println("Enter salary:");
    double salary = Double.parseDouble(IO.readln());

    IO.println("Enter deduction percent:");
    double deductionpercent = Double.parseDouble(IO.readln());

    double deduction = salary * deductionpercent / 100;
    double netsalary = salary - deduction;
    IO.println("Deduction is:" + deduction);
    IO.println("Net salary is:" + netsalary);
}