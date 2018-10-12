SetTitleMatchMode,2
WinClose,ahk_class Notepad
WinWaitClose,,ahk_class Notepad,,1
run,notepad
WinWaitActive,ahk_class Notepad,,1
returnString := ( WinExist("ahk_class Notepad") ) ? "true" : "false"
FileAppend, % returnString, G:\fre\git\github\UnitTest4_g-IntelliSense-everywhere\.\src\exec-ahk-commandLineParas.ahk.output.txt
ExitApp