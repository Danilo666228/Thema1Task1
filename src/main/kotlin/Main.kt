fun main() {
    val inputText = readln()
    var count = 1
    var result = " "
    for (i in 0 until inputText.length - 1) {
        if (inputText[i] == inputText[i + 1]) {
            count++
        } else {
            if (count > 1) {
                result += "${inputText[i]}$count"
            } else {
                result += "${inputText[i]}"
            }
            count = 1
        }
    }
    if (count > 1) {
        result += ("${inputText[inputText.length - 1]}$count")
    } else {
        result += ("${inputText[inputText.length - 1]}")
    }
    print(result)
}