import java.io.File

fun info(sFileStr: String) {
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
                println( currentFile.getName())
//                fileList.add(currentFile.absoluteFile)
            }
        }
    }

//    file.walkTopDown().forEach { i++
//        ; println(i + ":" + it) }
    println("\\_______")
}
fun main(args: Array<String>) {
    info("""C:""")
    info("""C:\Windows""")
    info(""""G:\My Web Sites\https___autohotkey.com_docs_AutoHotkey.htm\autohotkey.com\docs\""")
    info(""""G:\My Web Sites\https___autohotkey.com_docs_AutoHotkey.htm\autohotkey.com\docs\""")
    info(""""G:\downloads""")
    info(""""g:\downloads""")
    info(""""g:""")

/*    var sRaw = """"G:\My Web Sites\https___autohotkey.com_docs_AutoHotkey.htm\autohotkey.com\docs\"""
    var sRaw = """"G:\My Web Sites\https___autohotkey.com_docs_AutoHotkey.htm\autohotkey.com\docs\"""
    println("rawPathStr= " + sRaw)

    var preparedPathWithoutDocFolderStr_1 = """"G:\My Web Sites\https___autohotkey.com_docs_AutoHotkey.htm\autohotkey.com\"""
            .replace("\\", "\\\\")
    println("preparedPathStr =" + preparedPathStr)

    var preparedWithoutDocFolderStr = rawPathStr.replace("\\", "\\\\")
    println("s2= " + sWithoutDocs)
//    val replace = s.replace("\\", File.separator)

    val rawPathStrFolder1 = File(rawPathStr)
    val folder2 = File(sWithoutDocs)
//¯¯¯¯ not working: s is dir? false
    println("rawPathStrFolder1 is dir? " + rawPathStrFolder1.isDirectory())
    println("folder2 is dir? " + folder2.isDirectory())
//    s is dir? false
//    s2 is dir? false
//\____ not working: s is dir? false

//¯¯¯¯ not working: empty
    rawPathStrFolder1.walk().forEach { println(it) }
    folder2.walk().forEach { println(it) }
    val f = File(rawPathStr)
    val f2 = File(s2)
    val f3 = File("g:").resolve(relative = sWithoutDocs + "docs")
    println(f3.absoluteFile)
    f3.walk().forEach { println(it) }
//    File(sWithoutDocs).resolve(relative = "docs\\").walk().forEach  { println(it) }
    File(rawPathStr).walk().forEach { println(it) }
    File(s2).walk().forEach { println(it) }
//    ;\____ not __ not working: empty

    println("_".repeat(100))

//¯¯¯¯ working examples ¯¯\
//    File("G:\\My Web Sites\\https___autohotkey.com_docs_AutoHotkey.htm\\autohotkey.com\\docs\\").walk().forEach  { println(it) }
//\____ working examples  __/


//    File(s).walkTopDown().forEach { println(it) }
//    File(replace).walkTopDown().forEach { println(it) }
//    ;File(replace).walkTopDown().forEach { -> println(it) }
// .replace('/', File.separatorChar);
*/
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