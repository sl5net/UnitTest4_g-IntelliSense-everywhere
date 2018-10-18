import java.io.File
import kotlin.system.exitProcess

fun infoWindowsOS_File(sFileStr: String) {
    val file = File(sFileStr)
    print("/¯¯¯¯¯¯¯ ")
    print("isDir = " + file.isDirectory() + ", ")
    println(" " + sFileStr)

//    val fileList: ArrayList<File> = ArrayList()
    val listAllFiles = file.listFiles()

    if (false && listAllFiles != null && listAllFiles.size > 0) {
        for (currentFile in listAllFiles) {
            if (currentFile.name.endsWith(".ini")) {
                // File absolute path
//                println( currentFile.getAbsolutePath())
                // File Name
                println(currentFile.getName())
//                fileList.add(currentFile.absoluteFile)
            }
        }
    }

//    file.walkTopDown().forEach { i++
//        ; println(i + ":" + it) }
    println("\\_______")
}

fun main(args: Array<String>) {
    doSomeTests()
    if (File.separatorChar != '\\') {
        println("Problem: File.separator is not Windows Style: fix that.")
        throw exitProcess(1)
    }
    return
    val folderPath = """G:\My Web Sites\https___autohotkey.com_docs_AutoHotkey.htm\autohotkey.com\docs\"""
//    listAllFiles(folderPath)
    println("\\_______/¯¯¯¯¯¯¯".repeat(6))
//    listFirstFiles(folderPath, 3)
    parseFirstFiles(folderPath, 1)

}

private fun parseFirstFiles(s: String, i: Int) {
    val listAllFiles = File(s).listFiles()
    for ((index, path) in listAllFiles.withIndex())
        if (index <= i) {
//            println("""$index: $path""")
            val file = File(path.absolutePath)
            file.forEachLine { println(it) }
        }
}

fun readFileLineByLineUsingForEachLine(fileName: String) = File(fileName).forEachLine { println(it) }
private fun listFirstFiles(s: String, i: Int) {
    val listAllFiles = File(s).listFiles()
    for ((index, path) in listAllFiles.withIndex())
        if (index < i) println("""$index: $path""")
}

private fun listAllFiles(s: String) {
    File(s).walk().forEach(::println)
}


private fun doSomeTests() {
    println(" File.separatorChar = " + File.separatorChar)
    infoWindowsOS_File("""C:\""")
    infoWindowsOS_File("""C:\Windows""")
    infoWindowsOS_File("""G:\My Web Sites\https___autohotkey.com_docs_AutoHotkey.htm\autohotkey.com\docs\""")
}

//private fun String.replace(c: Char, s: String): Any {
//
//}


private fun String.replace(regex: Regex, notMatched: (String) -> String, matched: (MatchResult) -> String): String {
//    its from https://github.com/http4k/http4k/blob/master/http4k-core/src/main/kotlin/org/http4k/core/UriTemplate.kt
    val matches = regex.findAll(this)
    val builder = StringBuilder()
    var position = 0
    for (matchResult in matches) {
        val before = substring(position, matchResult.range.start)
        if (before.isNotEmpty()) builder.append(notMatched(before))
        builder.append(matched(matchResult))
        position = matchResult.range.endInclusive + 1
    }
    val after = substring(position, length)
    if (after.isNotEmpty()) builder.append(notMatched(after))
    return builder.toString()
}