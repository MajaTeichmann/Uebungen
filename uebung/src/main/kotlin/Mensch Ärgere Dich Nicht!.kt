import kotlin.math.*
import kotlin.random.Random
fun main(){
    // TODO: in eigene fun() schreiben und mit main() verknüfen
    var rot = 4
    var gelb = 4
    var gruen = 4
    var blau = 4

    // TODO: in eigene fun() schreiben und mit main() verknüfen
    val maxDiceEyes = 12
    val minDiceEyes = 2
    var dice1 = 1..6
    var dice2 = 1..6
    var randomRollDice= dice1.random() + dice2.random()

    // TODO: in eigene fun() schreiben und mit main() verknüfen
    val startField = 0
    val normalFields = 40
    val homeFields = 4
    val maxFields = normalFields + homeFields

    println("Hallo, wie heißt du?")
    var spielerName = readln()

    println("Wie viele Gegner möchtest du haben, ${spielerName}?") // TODO: variante für 1 Gegner und 2 Gegener schreiben
    var gegner = readln()

    println("Bitte wähle eine Farbe! rot, gelb, grün oder blau?")
    var playerColor = readln()

    if (playerColor == "rot"){
        println("Danke, du spielst nun die Farbe rot!")
        var uebrigeFarbenOhneRot = listOf<String>("gelb","grün","blau")
    }
        else if (playerColor == "gelb"){
        println("Danke, du spielst nun die Farbe gelb!")
        var uebrigeFarbenOhneGelb = listOf<String>("rot","grün","blau")
    }
            else if (playerColor == "grün"){
                println("Danke, du spielst nun die Farbe grün!")
                var uebrigeFarbenOhneGruen = listOf<String>("rot","gelb","blau")
            }
                else if (playerColor == "blau"){
                    println("Danke, du spielst nun die Farbe blau!")
                    var uebrigeFarbenOhneBlau = listOf<String>("rot","gelb","grün")
                }
                    else{
                        println("Error!")
                    }

    println("Du bist an der Reihe und hast noch 4 ${playerColor}e Spielpüppchen zur Auswahl!")
    println("Du bist an der Reihe! Was möchtest du tun?")
    println("Tippe 1, wenn du würfeln möchtest.")
    println("Tippe 2, wenn du das Spiel abbrechen möchtest. Dies kann nicht rückgängig gemacht werden!")

    var option = readln()

    if (option == "1"){
        println("Es wird nun gewürfelt...")

        println("Du hast eine ${randomRollDice} gewürfelt!")

        var aktuellerStandortRot = startField + randomRollDice

        println("Du stehst nun auf Feld ${aktuellerStandortRot}!")

        println("Nun sind deine Gegner dran!")
        println("Gelb würfelt:")
        println(randomRollDice)
        var aktuellerStandortGelb = startField + randomRollDice
        println("Gelb rückt vor auf Feld ${aktuellerStandortGelb}")

        if (aktuellerStandortGelb == aktuellerStandortRot){
            aktuellerStandortRot = startField
        }

        println("Grün würfelt:")
        println(randomRollDice)
        var aktuellerStandortGruen = startField + randomRollDice
        println("Grün rückt vor auf Feld ${aktuellerStandortGelb}")

        if (aktuellerStandortGruen == aktuellerStandortRot){
            aktuellerStandortRot = startField
        }
            else if (aktuellerStandortGruen == aktuellerStandortGelb) {
            aktuellerStandortGelb = startField
            }

        println("Blau würfelt:")
        println(randomRollDice)
        var aktuellerStandortBlau = startField + randomRollDice
        println("Blau rückt vor auf Feld ${aktuellerStandortGelb}")

        if (aktuellerStandortBlau == aktuellerStandortRot){
            aktuellerStandortRot = startField
        }
            else if (aktuellerStandortBlau == aktuellerStandortGelb){
                aktuellerStandortGelb = startField
        }
            else if (aktuellerStandortBlau == aktuellerStandortGruen)
                aktuellerStandortGruen = startField
        }

    else if (option == "2"){
        println("Das Spiel wird nun beendet!")
    }
}