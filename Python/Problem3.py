'''
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
'''
import numpy as np

def isPrime(n):
	arr = np.array([2])
	for prime in arr:
		if(n % prime == 0):
			return False
	np.append(arr, n)
	return True

def 