import java.text.SimpleDateFormat
import java.util.*


fun main() {
    println("Hallo!")
    println("Wie heißt du?")
    val name = readln()

    println("An welchem Tag im Monat wurdest du geboren? Bitte gib diesen im folgenden Format an: z.B. 01 oder 10")
    val birthDay: String = readln()

    println("In welchem Monat wurdest du geboren? Bitte gib eine Zahl an! z.B. 01 für Januar, 06 für Juni" +
            " oder 12 für dezember!")
    val birthMonth: String = readln()

    println("In welchem Jahr wurdest du geboren? z.B. 1999")
    val birthYear: String = readln()

    //println("Welches Jahr haben wir?")
    //val currentYear: String = readln()

    val date = SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().time)
    // println("Wir haben aktuell den $date")

    val onlyYear = SimpleDateFormat("yyyy").format(Calendar.getInstance().time)
    val onlyTime = SimpleDateFormat("hh:mm").format(Calendar.getInstance().time)
    //println(onlyYear)

    val birthDay2: Int = birthDay.toInt()
    val birthMonth2: Int = birthMonth.toInt()
    val birthYear2: Int = birthYear.toInt()

    var onlyYear2: Int = onlyYear.toInt()
    //val age = onlyYear - birthYear2

    println("Hallo, $name! Heute ist der $date, es ist $onlyTime und du hast am $birthDay.$birthMonth.$birthYear Geburtstag.")

    println(onlyYear2-birthYear2)

    //println("Du bist $age Jahre alt!")

}