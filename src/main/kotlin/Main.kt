fun main() {
    val likes1 = 1;
    val likes2 = 2;
    val likes3 = 10;
    val likes4 = 11;
    val likes5 = 21;
    val likes6 = 22;

    val man = "человеку";
    val people = "людям";

    var ending1 = if (likes1 % 10 == 1 && likes1 != 11) man else people;
    println("Понра $likes1 $ending1");
    var ending2 = if (likes2 % 10 == 1 && likes2 != 11) man else people;
    println("Понра $likes2 $ending2");
    var ending3 = if (likes3 % 10 == 1 && likes3 != 11) man else people;
    println("Понра $likes3 $ending3");
    var ending4 = if (likes4 % 10 == 1 && likes4 != 11) man else people;
    println("Понра $likes4 $ending4");
    var ending5 = if (likes5 % 10 == 1 && likes5 != 11) man else people;
    println("Понра $likes5 $ending5");
    var ending6 = if (likes6 % 10 == 1 && likes6 != 11) man else people;
    println("Понра $likes6 $ending6");


}