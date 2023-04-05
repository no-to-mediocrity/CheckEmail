
fun main() {
    val email = "test@gmail.com"
    val notemail = "testgmail.com"
    val phone = "+79527972297"
    val badphone = "9319301930103910"
    val mircard = "2390201101332900"
    val notmircard = "3390201101332900"
    println(checkEmail(email))
    println(checkEmail(notemail))
    println(checkCellPhone(phone))
    println(checkCellPhone(badphone))
    println(checkMirCard(mircard))
    println(checkMirCard(notmircard))
}


fun checkEmail(email: String): Boolean {
    val regex = Regex("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") 
    val clear_email = email.trim()
    val matchResults = regex.find(clear_email)
    return matchResults != null
}

fun checkCellPhone(phone: String): Boolean {
    var cleanedPhone = phone.trim()
    cleanedPhone = phone.replace(Regex("[^\\d]"), "")
    return cleanedPhone.length == 11
    //                             ^ works for Russian cell-phone numbers
}

fun checkMirCard(card:String):Boolean {
    var cleanedCard = card.trim()
    cleanedCard = cleanedCard.replace(Regex("[^\\d]"), "")
    return (cleanedCard.length == 16) && (cleanedCard[0].toString() == "2")
    return false
}
 
