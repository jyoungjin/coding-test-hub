# [Gold IV] 오큰수 - 17298 

[문제 링크](https://www.acmicpc.net/problem/17298) 

### 성능 요약

메모리: 155804 KB, 시간: 1144 ms

### 분류

자료 구조, 스택

### 제출 일자

2023년 11월 16일 14:18:20

### 문제 설명

<p style="user-select: auto;">크기가 N인 수열 A = A<sub style="user-select: auto;">1</sub>, A<sub style="user-select: auto;">2</sub>, ..., A<sub style="user-select: auto;">N</sub>이 있다. 수열의 각 원소 A<sub style="user-select: auto;">i</sub>에 대해서 오큰수 NGE(i)를 구하려고 한다. A<sub style="user-select: auto;">i</sub>의 오큰수는 오른쪽에 있으면서 A<sub style="user-select: auto;">i</sub>보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.</p>

<p style="user-select: auto;">예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다. A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.</p>

### 입력 

 <p style="user-select: auto;">첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에 수열 A의 원소 A<sub style="user-select: auto;">1</sub>, A<sub style="user-select: auto;">2</sub>, ..., A<sub style="user-select: auto;">N</sub> (1 ≤ A<sub style="user-select: auto;">i</sub> ≤ 1,000,000)이 주어진다.</p>

### 출력 

 <p style="user-select: auto;">총 N개의 수 NGE(1), NGE(2), ..., NGE(N)을 공백으로 구분해 출력한다.</p>

