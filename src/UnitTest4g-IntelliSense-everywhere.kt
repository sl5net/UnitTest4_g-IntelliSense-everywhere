import Keyboard.Companion.openAndSave_Notepad_NeverUsedBefore_a_totally_new
import java.awt.*
import java.awt.event.KeyEvent
import java.io.File
import java.io.IOException
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.concurrent.TimeUnit

/*
Examples in doku:

<tr id="Floor">
<td><a href="commands/Math.html#Floor">Floor</a></td>
<td>Returns <em>Number</em> rounded down to the nearest integer (without any .00 suffix).</td>
</tr>

<h1>WinGetTitle</h1>
<p>Retrieves the title of the specified window.</p>
 */

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


    companion object {

        private val ahkDirRel = """src\"""
        private val projectRootAbs = File("").absolutePath
        private val ahkDirAbs = File(ahkDirRel).absolutePath
        private val ahkNameWithoutExtension = "exec-ahk-commandLineParas"
        private val ahkName = "${ahkNameWithoutExtension}.ahk"
        private val inputFileName = "${ahkName}.input.inc.ahk"
        private val ahkFile = File("""${ahkDirAbs}\${ahkName}""")
        private val inputFile = File("""${ahkDirAbs}\${inputFileName}""")
        private val outputFileName = "${ahkName}.output.txt"
        //        private val outputFile = File("$ahkDirRel$outputFileName") // <== problem it will not generated 24.10.2018 19:54
        private val outputFile = File("""$ahkDirAbs\$outputFileName""")
//        private val outputFile = File("""c:$outputFileName""")


        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            if (!isWritingToOutputFilePossible()) {
                throw Exception(":( isWritingToOutputFilePossible failed")
            }
//            if (!openAndSave_Notepad_NeverUsedBefore_a_totally_new())
//                throw Exception(":( openAndSave_Notepad_NeverUsedBefore_a_totally_new failed")

            if (!openNotepad())
                throw Exception(":( openNotepad failed")

            Thread.sleep(5500.toLong())

            if (!run_Gi_IntelliSenseEverywhere())
                throw Exception(":( run_Gi_IntelliSenseEverywhere failed")

            val keyboard = Keyboard()
            createLibFristTimeAndOpen2textEditor(keyboard)

//            keyboard.type("__")
//            Thread.sleep(1_000)  // wait for 1 second
//            keyboard.type("1")

            return


            var ahkCode = """
            MsgBox,% "hi :) ${LocalDateTime.now()}(" A_LineNumber " " RegExReplace(A_LineFile,".*\\") ")"
                """

            doAhk(ahkCode)
//            outputFile?.forEachLine { println(it) }

            if (false) {
                val keyboard = Keyboard()
                createLibFristTimeAndOpen2textEditor(keyboard)
            }
        }

        private fun isReturnStringTrue(milliWaitMax: Int = 3000): Boolean {
            val funName = object{}.javaClass.enclosingMethod.name
            println("/¯¯¯¯ $funName(milliWaitMax:$milliWaitMax)")
            val returnString = this.getWait_OutputFile_String(milliWaitMax)
            if (returnString != "true")
                println(":( $returnString            = returnString" )
            else
                println(":) $returnString            = returnString" )
            return (returnString == "true")
        }


        private var timestamp: String? = null

        fun openAndSave_Notepad_NeverUsedBefore_a_totally_new(): Boolean {
            if (!closeAllOpenNotepad())
                throw Exception(":( openNotepad failed")

            if (!openNotepad())
                throw Exception(":( openNotepad failed")

//            var sleepMili = 100
            Thread.sleep(1500.toLong())

//            Speichern unter ahk_class #32770 ; mouseWindowTitle=0xd512a2  ;
//            WinMove,Speichern unter ahk_class #32770 ,, 2788,365, 960,600
            this.timestamp = DateTimeFormatter
                    .ofPattern("yyyy-MM-dd HH_mm_ss_SSSSSS")
                    .withZone(ZoneOffset.UTC)
                    .format(Instant.now())


            val ahkCode = """
                #SingleInstance,Force
                SetTitleMatchMode,2
                tooltip,WinWait (%A_LineFile%~%A_LineNumber%)
                WinWait,ahk_class Notepad,,1

                WinActivate,ahk_class Notepad
                ; Msgbox,(%A_LineFile%~%A_LineNumber%)
                tooltip,WinWaitActive (%A_LineFile%~%A_LineNumber%)
                WinWaitActive,ahk_class Notepad,,1
                ; Msgbox,(%A_LineFile%~%A_LineNumber%)
                ControlSend,,hello world,ahk_class Notepad

                sleep,100

                ; Msgbox,(%A_LineFile%~%A_LineNumber%)
                ; ControlSend,,{CtrlDown}s{CtrlUp},ahk_class Notepad
                ifWinActive,ahk_class Notepad
                    send,^s
                tooltip,WinWaitActive (%A_LineFile%~%A_LineNumber%)
                WinWaitActive, ahk_class #32770 ,,2
                IfWinNotActive, ahk_class #32770
                {
                    returnString := "false"
                    FileAppend, % returnString, % "${outputFile.absolutePath}"
                    ExitApp
                }
                ClipboardBackup := "${timestamp}"
                Clipboard := "${timestamp}"
                sleep,200
                Send,^v{enter}
                tooltip,WinWaitNotActive (%A_LineFile%~%A_LineNumber%)

                WinWaitNotActive, ahk_class #32770 ,,1
                ClipboardBackup := Clipboard

                tooltip,% "WinWaitActive (" A_LineNumber " " RegExReplace(A_LineFile,".*\\") ")"
                WinWaitActive,$timestamp ahk_class Notepad,,1
                tooltip,
                returnString := ( WinExist("$timestamp ahk_class Notepad") ) ? "true" : "false"
                FileAppend, % returnString, % "${outputFile.absolutePath}"
                ExitApp
            """.trimIndent()
            doAhk(ahkCode)
            Thread.sleep(1500.toLong())

            return isReturnStringTrue()

            if (WinWaitActive("${this.timestamp}.ahk"))
                println(":) Active = ${this.timestamp}.ahk")
            else
                println(":( NOT Active = ${this.timestamp}.ahk")


        }


        private fun run_Gi_IntelliSenseEverywhere(): Boolean {
            val funName = object{}.javaClass.enclosingMethod.name
            println("/¯¯¯¯ $funName")
            val path: String = """E:\fre\private\HtmlDevelop\AutoHotKey\global-IntelliSense-everywhere-Nightly-Build\start.ahk"""
            val winTitle: String = """TypingAid.ahk"""
            val ahkCode = """
                #SingleInstance,Force
                run,"$path"
            """.trimIndent()
            doAhk(ahkCode)
            return isWinExistWait(winTitle = winTitle, secondsWait = 9, detectHiddenWindowOnOff = "On")
        }

        private fun isWinExistWait(winTitle: String = """TypingAid.ahk""", detectHiddenWindowOnOff: Boolean = false, secondsWait: Int = 2): Boolean {
            return isWinExistWait(
                    winTitle,
                    (if (detectHiddenWindowOnOff) "On" else "Off"),
                    secondsWait)
        }

        private fun isWinExistWait(winTitle: String = """TypingAid.ahk""", detectHiddenWindowOnOff: String = "Off", secondsWait: Int = 2): Boolean {
            val funName = object{}.javaClass.enclosingMethod.name
            println("/¯¯¯¯ $funName( ... secondsWait: $secondsWait")
            var detectHiddenWindowOnOff2 = detectHiddenWindowOnOff
            when (detectHiddenWindowOnOff) {
                "true" -> detectHiddenWindowOnOff2 = "On"
                "false" -> detectHiddenWindowOnOff2 = "Off"
            }
            val ahkCode = """
                #SingleInstance,Force
                SetTitleMatchMode,2
                DetectHiddenWindows,$detectHiddenWindowOnOff2
                WinWaitActive,$winTitle,,$secondsWait
                returnString := ( WinExist("$winTitle") ) ? "true" : "false"
                FileAppend, % returnString, % "${outputFile.absolutePath}"
                ExitApp
            """.trimIndent()
            doAhk(ahkCode)
            return isReturnStringTrue(milliWaitMax = secondsWait*1000)
        }


        private fun isWinActiveWait(winTitle: String = """TypingAid.ahk""", detectHiddenWindowOnOff: String = "Off", secondsWait: Int = 2): Boolean {
            return WinWaitActive(winTitle, detectHiddenWindowOnOff, secondsWait)
        }

        private fun WinWaitActive(winTitle: String = """TypingAid.ahk""", detectHiddenWindowOnOff: String = "Off", secondsWait: Int = 2): Boolean {
            val ahkCode = """
                #SingleInstance,Force
                SetTitleMatchMode,2
                DetectHiddenWindows,$detectHiddenWindowOnOff
                WinWaitActive,$winTitle,,2
                IfWinActive,$winTitle
                    returnString := "true"
                else
                    returnString := "false"
                FileAppend, % returnString, % "${outputFile.absolutePath}"
                ExitApp
            """.trimIndent()
            doAhk(ahkCode)
            return isReturnStringTrue()
//            var returnString = this.getWait_OutputFile_String()
//            return if (returnString == "true") true else false
        }


        private fun openNotepad(): Boolean {
            val ahkCode = """
                #SingleInstance,Force
                SetTitleMatchMode,2
                run,notepad
                tooltip,WinWaitActive (%A_LineFile%~%A_LineNumber%)
                WinWait,ahk_class Notepad , , 1 , Notepad++
                WinActivate,ahk_class Notepad
                WinWaitActive,ahk_class Notepad, , 1 , Notepad++
                returnString := ( WinExist("ahk_class Notepad", "" , "Notepad++") ) ? "true" : "false"
                FileAppend, % returnString, % "${outputFile.absolutePath}"
                ExitApp
            """.trimIndent()
            doAhk(ahkCode)
            return isReturnStringTrue()
        }

        private fun isWritingToOutputFilePossible(): Boolean {
            val ahkCode = """
                #SingleInstance,Force
                outputFile := "${outputFile.absolutePath}"
                FileAppend, % "true", % outputFile
                ; FileAppend, % "true", % "${ahkDirAbs}temp3.txt"
                 msg := A_LastError " = A_LastError`n"
                 msg .= ErrorLevel " =ErrorLevel"
                ; msgbox, % msg
                ExitApp
            """.trimIndent()
            doAhk(ahkCode)
            return isReturnStringTrue()
        }

        private fun closeAllOpenNotepad(): Boolean {
            var temp = """
                #SingleInstance,Force
SetTitleMatchMode,2
tooltip,WinWait (%A_LineFile%~%A_LineNumber%)
WinWait,ahk_class Notepad , , 1 , Notepad++

WinActivate,ahk_class Notepad , , Notepad++
; Msgbox,(%A_LineFile%~%A_LineNumber%)
tooltip,WinWaitActive (%A_LineFile%~%A_LineNumber%)
WinWaitActive,ahk_class Notepad , , 1 , Notepad++
; Msgbox,(%A_LineFile%~%A_LineNumber%)
ControlSend, , hi ,ahk_class Notepad , , Notepad++
sleep,1500

; Msgbox,(%A_LineFile%~%A_LineNumber%)
; ControlSend,,{CtrlDown}s{CtrlUp},ahk_class Notepad
while(A_Index < 90){
	tooltip, % A_Index
	WinActivate,ahk_class Notepad , , Notepad++
	ifWinActive,ahk_class Notepad , , Notepad++
		send,^s
	tooltip,WinWaitActive (%A_LineFile%~%A_LineNumber%)
; Speichern unter ahk_class #32770
	WinWaitActive,ahk_class #32770 ahk_exe notepad.exe,,2 , Notepad++
	IfWinActive,ahk_class #32770 ahk_exe notepad.exe, , Notepad++
	{
		MsgBox,great
		Break
	}
}
sleep,1500
WinActivate,ahk_class #32770 ahk_exe notepad.exe, , Notepad++
IfWinActive,ahk_class #32770 ahk_exe notepad.exe, , Notepad++
{
	ClipboardBackup := "2018-10-24 21_36_03_798939"
	Clipboard := "2018-10-24 21_36_03_798939"
	sleep,2500
	Send,^v{enter}
	Send,%Clipboard%{enter}
}
IfWinNotActive,% Clipboard
{
	returnString := "false"
	FileAppend, % returnString, % "G:\fre\git\github\UnitTest4_g-IntelliSense-everywhere\src\exec-ahk-commandLineParas.ahk.output.txt"
	ExitApp
}
returnString := "true"
FileAppend, % returnString, % "G:\fre\git\github\UnitTest4_g-IntelliSense-everywhere\src\exec-ahk-commandLineParas.ahk.output.txt"


tooltip,WinWaitNotActive (%A_LineFile%~%A_LineNumber%)
Clipboard := ClipboardBackup

MsgBox

ExitApp
                """
            val ahkCode = """
#SingleInstance,Force
SetTitleMatchMode,2
while(winexist("ahk_class Notepad", "" , "Notepad++") && A_Index < 5 ){
	WinActivate,
	WinWaitActive, , , 1
	WinClose,
	tooltip,WinWait (%A_LineFile%~%A_LineNumber%)
    ; Editor ahk_class #32770 ; mouseWindowTitle=0x44a2386  ;
	WinActivate,ahk_class #32770,,Notepad++
	tooltip,WinWaitActive (%A_LineFile%~%A_LineNumber%)
	WinWaitActive,ahk_class #32770,,1 ; would you save
	IfWinActive
		Send,n ; no
	tooltip,WinWaitClose (%A_LineFile%~%A_LineNumber%)
	WinWaitClose,,ahk_class Notepad,,1
}
returnString := ( WinExist("ahk_class Notepad" , "" , "Notepad++") ) ?  "false" : "true"
                FileAppend, % returnString, % "${outputFile.absolutePath}"
                ExitApp
            """.trimIndent()
            doAhk(ahkCode)
            return isReturnStringTrue()
        }

        fun getWait_OutputFile_String(milliWaitMax: Int = 3000): String {
            val funName = object{}.javaClass.enclosingMethod.name
            println("/¯¯¯¯ $funName(milliWaitMax:$milliWaitMax")
            val fileExists = outputFile.waitFileExist(milliWaitMax)
            if (!fileExists)
                throw Exception(":( ${outputFile.absolutePath} not exist.")

            val outputFileContent = outputFile?.readText()
            return outputFileContent
        }

        private fun File.waitFileExist(milliWaitMax: Int = 3000): Boolean {
            val funName = object{}.javaClass.enclosingMethod.name
            println("/¯¯¯¯ $funName(milliWaitMax: $milliWaitMax)")
            var i = 0
            val sleepMili = 40
            while (!this.exists() && (++i * sleepMili) < milliWaitMax) Thread.sleep(sleepMili.toLong())
            val fileExists = this.exists()
//            println(projectRootAbs)
            if (!fileExists)
                println(":-( ${this.absolutePath.replace(projectRootAbs,"")}         NOT exist. waited: ${i * sleepMili} = $i*$sleepMili")
            else
                println(":-) ${this.absolutePath.replace(projectRootAbs,"")}             exist.")
            return fileExists
        }

        fun test_indexed_multi_ahk(x: Any, y: Any): Unit {
            openAndSave_Notepad_NeverUsedBefore_a_totally_new()
//            todo: just started 22.10.2018 19:28
            val ahk = """
            colors and indexed each Color|rr||ahk|[
                brown
                orange
            )
            """.trimIndent()
            doAhk(ahk)
        }

        //            keyboard.type("~!@#$%^&*()_+")
        private fun createLibFristTimeAndOpen2textEditor(keyboard: Keyboard) {
            keyboard.type("__")
            Thread.sleep(1_000)  // wait for 1 second
            keyboard.type("1")
//            isWinActiveWait() ; todo:
        }

        fun doAhk(ahkCode: String) {
            val funName = object{}.javaClass.enclosingMethod.name
            println("/¯¯¯¯ $funName(...)")
            if (inputFile.exists())
                inputFile.delete()
            Thread.sleep(100.toLong())
            inputFile.writeText(ahkCode)
            inputFile.waitFileExist()
            if (outputFile.exists())
                outputFile.delete()
            Thread.sleep(100.toLong())
            val commandLine = """${ahkFile.absolutePath} ${inputFile.absolutePath} ${outputFile.absolutePath}"""
            val p = Runtime.getRuntime().exec("cmd /c " + commandLine)
            File("${ahkDirRel}fun_doAhk_last_temp.ahk").writeText(ahkCode) // <=== only for testing 24.10.2018 21:44
            Thread.sleep(100.toLong())
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

