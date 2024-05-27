package bd.tutorials.rockpaperscissor

fun main(){

    var computersChoice = " "
    var playersChoice = " "
    print("choose between rock, paper and scissor:")
    playersChoice= readln()

   while(playersChoice!= "rock" &&playersChoice!= "paper"&&playersChoice!= "scissors"){
        println("invalid")
        playersChoice= readln()
    }

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computersChoice= "rock"
        }
        2 -> {
            computersChoice= "paper"
        }
        3 -> {
            computersChoice= "scissors"
        }
    }
    println(computersChoice)



    val winner= when {
        playersChoice== computersChoice -> "Draw"
        playersChoice== "rock"  && computersChoice== "scissors" ->"Player"
        playersChoice== "paper"  && computersChoice== "rock" ->"Player"
        playersChoice== "scissors"  && computersChoice== "paper" ->"Player"
        else->"computer"
    }

    if(winner=="Draw"){
        println("Its a draw")
    }
    /*else if(winner=="Player"){
        println("You win!")
    }*/
    else{
        println("$winner won")
    }
}