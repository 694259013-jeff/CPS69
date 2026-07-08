void main() {
    IO.println("Enter score1:");
    double score1 = Double.parseDouble(IO.readln());

    IO.println("Enter score2:");
    double score2 = Double.parseDouble(IO.readln());

    IO.println("Enter score3:");
    double score3 = Double.parseDouble(IO.readln());

    IO.println("Enter bonus:");
    double bonus = Double.parseDouble(IO.readln());

    double totalscore = score1 + score2 + score3;
    double totalscorewithbonus = bonus + totalscore;
    double Averagetotalscorewithbonus = totalscorewithbonus / 3;
    IO.println("Total score is:" + totalscore);
    IO.println("Total score with bonus is:" + totalscorewithbonus);
    IO.println("Average total score with bonus is = %.2f".formatted(Averagetotalscorewithbonus));
}