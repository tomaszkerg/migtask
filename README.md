Hey, in class Solution you can find aswers for these tasks: 

Exercise 1 

Write a function: 
 class Solution {public int solution(int N);} 
that, given an integer N, returns the number of distinct digits that occur in the decimal representation of N 
(without leading zeros for N<>0). 
For example, given N = 1410 the function should return 3, because there are three distinct digits in the 
representation of N, namely 0, 1 and 4. Given N= 0 the function should return 1, because the only digit that 
occurs in the representation of N is 0. Similarly, given N = 222 the function should return 1, because the only 
digit that occurs in the representation of N is 2. Given N = -1220 the function should return 3. 
Assume that: 
- N is an integer within the range [-2,147,483,648..2,147,483,647]. 
Add code: 
class Solution{ 
 public int solution(int N){ } 
} 

Exercise 2

Compute number of integers divisible by k in range [a..b]. 
Write a function: 
class Solution { public int solution(int A, int B, int K); } 
that, given three integers A, B and K, returns the number of integers within the range [A..B] 
that are divisible by K, i.e.: 
{ i : A ≤ i ≤ B, i mod K = 0 } 
For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are 
three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10. 
Assume that: 
A and B are integers within the range [0..2,000,000,000]; 
K is an integer within the range [1..2,000,000,000]; 
A ≤ B. 
Complexity: 
expected worst-case time complexity is O(1); 
 expected worst-case space complexity is O(1). 
 
 Exercise 3 
 
SQL
Consider the following physical data model: 

Tables: Country, City, Building

Country --> One to many --> City --> One to many --> Building
Write a SQL query that: 
I. Selects countries where a total number of inhabitants (population) in all the cities is greater 
than 400 
II. Selects names of countries that have no buildings at all.
