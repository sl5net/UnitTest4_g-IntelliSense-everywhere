import java.awt.*
import java.awt.event.KeyEvent
import java.io.File
import java.io.IOException
import java.lang.System.out
import java.time.LocalDateTime
import java.util.concurrent.TimeUnit
class Keyboard {

    private var robot: Robot? = null

    @Throws(AWTException::class)
    constructor() {
        this.robot = Robot()
        robot!!.delay(500)
        robot!!.autoDelay = 2
        robot!!.isAutoWaitForIdle = true
    }

    constructor(robot: Robot) {
        this.robot = robot
    }

    fun type(characters: CharSequence) {
        val length = characters.length
        for (i in 0 until length) {
            val character = characters[i]
            type(character)
        }
    }

    fun enter() {
        robot!!.keyPress(KeyEvent.VK_ENTER)
    }

    fun type(character: Char) {
        println(character)
        when (character) {
            'a' -> doType(KeyEvent.VK_A)
            'b' -> doType(KeyEvent.VK_B)
            '@' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_2)
            '#' -> doType(KeyEvent.VK_NUMBER_SIGN)
            'c' -> doType(KeyEvent.VK_C)
            //      case '#': doType(KeyEvent.VK_NUMBER_SIGN); break;
            'd' -> doType(KeyEvent.VK_D)
            'e' -> doType(KeyEvent.VK_E)
            'f' -> doType(KeyEvent.VK_F)
            'g' -> doType(KeyEvent.VK_G)
            'h' -> doType(KeyEvent.VK_H)
            'i' -> doType(KeyEvent.VK_I)
            'j' -> doType(KeyEvent.VK_J)
            'k' -> doType(KeyEvent.VK_K)
            'l' -> doType(KeyEvent.VK_L)
            'm' -> doType(KeyEvent.VK_M)
            'n' -> doType(KeyEvent.VK_N)
            'o' -> doType(KeyEvent.VK_O)
            'p' -> doType(KeyEvent.VK_P)
            'q' -> doType(KeyEvent.VK_Q)
            'r' -> doType(KeyEvent.VK_R)
            's' -> doType(KeyEvent.VK_S)
            't' -> doType(KeyEvent.VK_T)
            'u' -> doType(KeyEvent.VK_U)
            'v' -> doType(KeyEvent.VK_V)
            'w' -> doType(KeyEvent.VK_W)
            'x' -> doType(KeyEvent.VK_X)
            'y' -> doType(KeyEvent.VK_Y)
            'z' -> doType(KeyEvent.VK_Z)
            'A' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_A)
            'B' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_B)
            'C' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_C)
            'D' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_D)
            'E' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_E)
            'F' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_F)
            'G' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_G)
            'H' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_H)
            'I' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_I)
            'J' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_J)
            'K' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_K)
            'L' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_L)
            'M' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_M)
            'N' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_N)
            'O' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_O)
            'P' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_P)
            'Q' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Q)
            'R' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_R)
            'S' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_S)
            'T' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_T)
            'U' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_U)
            'V' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_V)
            'W' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_W)
            'X' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_X)
            'Y' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Y)
            'Z' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Z)
            '`' -> doType(KeyEvent.VK_BACK_QUOTE)
            '0' -> doType(KeyEvent.VK_0)
//            '1' -> doType(KeyEvent.VK_1)
            '1' -> doType(KeyEvent.VK_NUMPAD1)
//            '2' -> doType(KeyEvent.VK_2)
            '2' -> doType(KeyEvent.VK_NUMPAD2)
            '3' -> doType(KeyEvent.VK_NUMPAD3)
            '4' -> doType(KeyEvent.VK_NUMPAD4)
            '5' -> doType(KeyEvent.VK_NUMPAD5)
            '6' -> doType(KeyEvent.VK_NUMPAD6)
            '7' -> doType(KeyEvent.VK_NUMPAD7)
            '8' -> doType(KeyEvent.VK_NUMPAD8)
            '9' -> doType(KeyEvent.VK_NUMPAD9)
            '-' -> doType(KeyEvent.VK_MINUS)
            '=' -> doType(KeyEvent.VK_EQUALS)
            '~' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_QUOTE)
            //      case '!': doType(KeyEvent.VK_EXCLAMATION_MARK); break;
            //        case '!': doType(KeyEvent.VK_EXCLAMATION_MARK); break;
            '!' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_1)
            //        case '@': doType(KeyEvent.VK_AT); break;
            //      case '@': doType(KeyEvent.VK_AT); break;

            '$' -> doType(KeyEvent.VK_DOLLAR)
            '%' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_5)
            '^' -> doType(KeyEvent.VK_CIRCUMFLEX)
            '&' -> doType(KeyEvent.VK_AMPERSAND)
            '*' -> doType(KeyEvent.VK_ASTERISK)
            '(' -> doType(KeyEvent.VK_LEFT_PARENTHESIS)
            ')' -> doType(KeyEvent.VK_RIGHT_PARENTHESIS)
// !"#%*!"#%_+
//            '_' -> doType(KeyEvent.VK_UNDERSCORE)
//            is discussed here: https://stackoverflow.com/questions/50079710/invalid-key-codes-for-above-character
//            !"#%_+
            '_' -> {
                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_MINUS)
            }
            '+' -> doType(KeyEvent.VK_PLUS)
            '\t' -> doType(KeyEvent.VK_TAB)
            '\n' -> doType(KeyEvent.VK_ENTER)
            '[' -> doType(KeyEvent.VK_OPEN_BRACKET)
            ']' -> doType(KeyEvent.VK_CLOSE_BRACKET)
            '\\' -> doType(KeyEvent.VK_BACK_SLASH)
            '{' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_OPEN_BRACKET)
            '}' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_CLOSE_BRACKET)
            '|' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_SLASH)
            ';' -> doType(KeyEvent.VK_SEMICOLON)
            ':' -> doType(KeyEvent.VK_COLON)
            '\'' -> doType(KeyEvent.VK_QUOTE)
            '"' -> doType(KeyEvent.VK_QUOTEDBL)
            ',' -> doType(KeyEvent.VK_COMMA)
            '<' -> doType(KeyEvent.VK_LESS)
            '.' -> doType(KeyEvent.VK_PERIOD)
            '>' -> doType(KeyEvent.VK_GREATER)
            '/' -> doType(KeyEvent.VK_SLASH)
            '?' -> doType(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH)
            ' ' -> doType(KeyEvent.VK_SPACE)
            else -> throw IllegalArgumentException("Cannot type character $character")
        }
    }

    private fun doType(keyCode: Int) {
        try {
            robot!!.keyPress(keyCode)
            robot!!.keyRelease(keyCode)
        } catch (e: Exception) {
            println("Invalid key code(s) for above character")
        }

    }

    private fun doType(keyCode1: Int, keyCode2: Int) {
        try {
            robot!!.keyPress(keyCode1)
            robot!!.keyPress(keyCode2)
            robot!!.keyRelease(keyCode2)
            robot!!.keyRelease(keyCode1)
        } catch (e: Exception) {
            println("Invalid key code(s) for above character")
        }

    }
    ;


    companion object {

        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            var ahkCode = """
            MsgBox,% "hi :) ${LocalDateTime.now()}(" A_LineNumber " " RegExReplace(A_LineFile,".*\\") ")"
                """ var outputFile = doAhk(ahkCode)
            outputFile?.forEachLine { println(it) }

            if (false) {
                val keyboard = Keyboard()
                createLibFristTimeAndOpen2textEditor(keyboard)
            }
        }

        fun doAhk(ahkCode: String): File? {
//            val ahkDir = "E:\\fre\\private\\HtmlDevelop\\AutoHotKey\\"
            val ahkDir = ".\\src\\"
            val ahkNameWithoutExtension = "exec-ahk-commandLineParas"
            val ahkName = "${ahkNameWithoutExtension}.ahk"
            val inputFileName = "${ahkName}.input.inc.ahk"
            val outputFileName = "${ahkName}.output.txt"
            val inputFile = File("$ahkDir$inputFileName")
            if (inputFile.exists())
                inputFile.delete()
            Thread.sleep(100)
            val outputFile = File("$ahkDir$outputFileName")
            inputFile.writeText(ahkCode)
            var i = 0
            while (!inputFile.exists() && i++ < 100)
                Thread.sleep(20)
            if (outputFile.exists())
                outputFile.delete()
            val commandLine = "${ahkDir}${ahkName} ${inputFile.absolutePath} ${outputFile.absolutePath}"
            val p = Runtime.getRuntime().exec("cmd /c " + commandLine)
            println(p.toString())


            i = 0
            while (!outputFile.exists() && i++ < 100)
                Thread.sleep(20)
            var fileExists = outputFile.exists()

            if (!fileExists) {
                println("${outputFile.absolutePath} does not exist.")
            } else {
                println("${outputFile.absolutePath} does exist.")
                //                Thread.sleep(100)
//                outputFile.forEachLine { println(it) }
            }
            return outputFile
        }

        //            keyboard.type("~!@#$%^&*()_+")
        private fun createLibFristTimeAndOpen2textEditor(keyboard: Keyboard) {

            keyboard.type("__")
            Thread.sleep(1_000)  // wait for 1 second
            keyboard.type("1")
        }
    }

}


fun String.runCommand(workingDir: File): String? {
//    . Capturing output as a String
//    An alternative implementation redirecting to Redirect.PIPE instead allows you to capture output in a String:
//    https://stackoverflow.com/questions/35421699/how-to-invoke-external-command-from-within-kotlin-code
    try {
        val parts = this.split("\\s".toRegex())
        val proc = ProcessBuilder(*parts.toTypedArray())
                .directory(workingDir)
                .redirectOutput(ProcessBuilder.Redirect.PIPE)
                .redirectError(ProcessBuilder.Redirect.PIPE)
                .start()

        proc.waitFor(60, TimeUnit.MINUTES)
        return proc.inputStream.bufferedReader().readText()
    } catch (e: IOException) {
        e.printStackTrace()
        return null
    }
}

