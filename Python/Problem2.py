''' 
Each new term in the Fibonacci sequence is generated by adding 
the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values 
do not exceed four million, find the sum of the even-valued terms.
'''
def evenFib(n):
	termVal = 0
	evenSum = 0
	oneTermPrev = 1
	twoTermPrev = 0

	while termVal < n:
		termVal = oneTermPrev + twoTermPrev
		twoTermPrev = oneTermPrev
		oneTermPrev = termVal
		if termVal % 2 == 0:
			evenSum += termVal
	print(evenSum)

evenFib(4000000)