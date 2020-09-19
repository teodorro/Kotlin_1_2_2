fun main() {
    val man = "человеку";
    val people = "людям";

    print(1, man, people)
    print(2, man, people)
    print(10, man, people)
    print(11, man, people)
    print(21, man, people)
    print(22, man, people)
    print(100, man, people)
}

private fun print(likes: Int, man: String, people: String) {
    var ending = if (likes % 10 == 1 && likes != 11) man else people;
    println("Понравилось $likes $ending");
}