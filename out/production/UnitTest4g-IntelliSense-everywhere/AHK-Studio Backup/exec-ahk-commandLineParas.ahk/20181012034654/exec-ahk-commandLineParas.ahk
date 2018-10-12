;#Include *i %A_ScriptDir%\inc_ahk\init_global.init.inc.ahk

; #NoEnv  ; Recommended for performance and compatibility with future AutoHotkey releases.
; #Warn  ; Enable warnings to assist with detecting common errors.
; SendMode Input  ; Recommended for new scripts due to its superior speed and reliability.
; SetWorkingDir %A_ScriptDir%  ; Ensures a consistent starting directory.

;/¯¯¯¯ consolesend ¯¯ 181009210225 ¯¯ 09.10.2018 21:02:25 ¯¯\
if(0){
    ; https://autohotkey.com/board/topic/25446-consolesend/
    DllCall("AttachConsole", "int", -1)
    FileAppend, Goodbye`, World!, CONOUT$

    para1 = %1%
    ToolTip2sec(msg " (" A_LineNumber " " RegExReplace(A_LineFile,".*\\") " " Last_A_This)
    DynaRun(para1)
    DynaRun(para1)

}
;\____ consolesend __ 181009210229 __ 09.10.2018 21:02:29 __/

; inputFilePath := A_ScriptDir "\" A_ScriptName ".input.inc.ahk"
; outputFilePath := A_ScriptDir "\" A_ScriptName ".output.txt"
inputFilePath = %1%
outputFilePath = %2%
run,% inputFilePath

text := "rübennase " A_Now "`n"
FileAppend, % text, % outputFilePath
;MsgBox,% para1 " " msg "(" A_LineNumber " " RegExReplace(A_LineFile,".*\\") ")"


#Include *i %A_ScriptDir%\inc_ahk\functions_global.inc.ahk
;~ subroutinen beispielsweise müsen ans Dateiende
#Include *i %A_ScriptDir%\inc_ahk\functions_global_dateiende.inc.ahk
#Include *i %A_ScriptDir%\inc_ahk\UPDATEDSCRIPT_global.inc.ahk 
