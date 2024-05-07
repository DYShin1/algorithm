import sys

input_num = int(sys.stdin.readline())
num1 = []
num2 = []

for i in range(input_num):
    num11, num22 = map(int, sys.stdin.readline().split())
    num1.append(num11)
    num2.append(num22)

for i in range(len(num1)):
    print(num1[i] + num2[i])