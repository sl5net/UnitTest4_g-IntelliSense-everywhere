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
    FileAppend, % returnString, % "G:\fre\git\github\UnitTest4_g-IntelliSense-everywhere\src\exec-ahk-commandLineParas.ahk.output.txt"
    ExitApp
}
ClipboardBackup := "2018-10-24 21_36_03_798939"
Clipboard := "2018-10-24 21_36_03_798939"
sleep,200
Send,^v{enter}
tooltip,WinWaitNotActive (%A_LineFile%~%A_LineNumber%)

WinWaitNotActive, ahk_class #32770 ,,1
ClipboardBackup := Clipboard

tooltip,% "WinWaitActive (" A_LineNumber " " RegExReplace(A_LineFile,".*\\") ")"
WinWaitActive,2018-10-24 21_36_03_798939 ahk_class Notepad,,1
tooltip,
returnString := ( WinExist("2018-10-24 21_36_03_798939 ahk_class Notepad") ) ? "true" : "false"
FileAppend, % returnString, % "G:\fre\git\github\UnitTest4_g-IntelliSense-everywhere\src\exec-ahk-commandLineParas.ahk.output.txt"
ExitApp