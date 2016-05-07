#!/usr/bin/env python3
op1 = open("../testcases/"+argv[0]+".test.out", "r")
op2 = open("../testcases/"+argv[1]+".out", "r")

while True:
    line1 = op1.readline()
    line2 = op2.readline()
    if line1 == "" and line2 == "":
        print("Correct Answer")
    elif line1 == "" or line2 == "" or line1!=line2:
        print("Incorrect Answer")
