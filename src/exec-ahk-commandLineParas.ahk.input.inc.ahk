SetTitleMatchMode,2
WinWaitActive,2018-10-18 01_32_54_843544.ahk,,2
IfWinActive,2018-10-18 01_32_54_843544.ahk
    returnString := "true"
else
    returnString := "false"
FileAppend, % returnString, G:\fre\git\github\UnitTest4_g-IntelliSense-everywhere\.\src\exec-ahk-commandLineParas.ahk.output.txt
ExitApp