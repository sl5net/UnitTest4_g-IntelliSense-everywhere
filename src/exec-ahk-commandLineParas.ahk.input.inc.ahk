#SingleInstance,Force
SetTitleMatchMode,2
DetectHiddenWindows,On
WinWaitActive,TypingAid.ahk,,9
returnString := ( WinExist("TypingAid.ahk") ) ? "true" : "false"
FileAppend, % returnString, % "G:\fre\git\github\UnitTest4_g-IntelliSense-everywhere\src\exec-ahk-commandLineParas.ahk.output.txt"
ExitApp