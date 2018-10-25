#SingleInstance,Force
SetTitleMatchMode,2
DetectHiddenWindows,On
WinWait,TypingAid,,15
returnString := ( WinExist("TypingAid") ) ? "true" : "false"
FileAppend, % returnString, % "G:\fre\git\github\UnitTest4_g-IntelliSense-everywhere\src\exec-ahk-commandLineParas.ahk.output.txt"
MsgBox,262209,returnString=%returnString%,returnString=%returnString%,5
ExitApp