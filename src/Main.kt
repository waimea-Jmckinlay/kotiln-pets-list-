
fun main() {
    val pets = mutableListOf<String>()
    //adding pets to list


    pets.add("dog")
    pets.add("cat")
    pets.add("dragon")
    show(pets)
    while (true) {
        //show the current pets
        show(pets)
        //give user action
        val action = menu()

        //act upon it
        when(action){
            'Q'-> break
            'A'-> getNewPet()
//           'D'-> deletePet()
        }
    }
}
/*get a pet name from the user and add to the list*/
fun getNewPet(pets: MutableList<String>){
    val newPet =getString("newpet")
    pets.add(newPet)
}
/*
* to show a menu and get the user chose
* return this as a char*/
fun menu():Char{
        println("[A]dd a new pet")
    println("[D]elete a pet")
    println("[Q]uit")

    val validChoices = "ADQ"

    while (true) {
        val input = readLine()!!
        //typed nothing try again
        if (input.isBlank()) continue

        val choice = input.lowercase().first()
        //check if it is a valid option
        if( validChoices.contains(choice)) return choice
    }
}


/*
* shows a list with any given entry*/

fun show(List: List<Any>) {

    for((i, item) in List.withIndex()) {
        println("$i:${item}")
    }

}
/**
 * function to get a string from the user
 * parameters :
 * -text to shower the user
 * returns
 * -string that the user types
 */
fun getString(prompt: String): String {
    var userinput: String

    while (true) {
        print(prompt)

        userinput = readln()
        if (userinput.isNotBlank()) break


        return userinput
    }
}