fun main() {

    var username: String = "BlueArcade45"
    var kills: Int = 20
    val maxPossibleInteger = Int.MAX_VALUE
    val minPossibleInteger = Int.MIN_VALUE
    //Assigning a bigger value than 2147483647 or a value less than -2147483648 is not possible using Int data type

    println("\nPlayer $username has $kills kills")
    println("Max possible number of kills is $maxPossibleInteger")
    println("Minimum possible number of kills is $minPossibleInteger (not technically possible)\n")

    var byteStorage: Byte = 15
    var usedStorage: Byte = 6
    var storageLeft = byteStorage - usedStorage
    val maxPossibleByteValue = Byte.MAX_VALUE
    val minPossibleByteValue = Byte.MIN_VALUE
    //Assigning a bigger value than 127 or a value less than -128 is not possible using Byte data type

    println("The user has already used $usedStorage bytes out of the $byteStorage bytes. He has now $storageLeft bytes left")
    println("Max possible bytes for one user is $maxPossibleByteValue")
    println("Minimum possible bytes for one user is $minPossibleByteValue\n")

    var name: String = "Alexis"
    var balanceMainAccount: Short = 12478
    var balanceSavingsAccount: Short = 30000
    val maxPossibleShortValue = Short.MAX_VALUE
    val minPossibleShortValue = Short.MIN_VALUE
    //Assigning a bigger value than 32767 or a value less than -32768 is not possible using Short data type

    println("$name has $balanceMainAccount euros in his main account and has $balanceSavingsAccount euros in his savings account")
    println("Max possible euros he can store in his main account is $maxPossibleShortValue")
    println("Minimum possible euros he can be in debt in his main account is $minPossibleShortValue")

}