# [Silver II] N과 M (12) - 15666 

[문제 링크](https://www.acmicpc.net/problem/15666) 

### 성능 요약

메모리: 15960 KB, 시간: 188 ms

### 분류

백트래킹

### 제출 일자

2023년 12월 1일 09:58:56

### 문제 설명

<p style="user-select: auto;">N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">N개의 자연수 중에서 M개를 고른 수열</li>
	<li style="user-select: auto;">같은 수를 여러 번 골라도 된다.</li>
	<li style="user-select: auto;">고른 수열은 비내림차순이어야 한다.
	<ul style="user-select: auto;">
		<li style="user-select: auto;">길이가 K인 수열 A가 A<sub style="user-select: auto;">1</sub> ≤ A<sub style="user-select: auto;">2</sub> ≤ ... ≤ A<sub style="user-select: auto;">K-1</sub> ≤ A<sub style="user-select: auto;">K</sub>를 만족하면, 비내림차순이라고 한다.</li>
	</ul>
	</li>
</ul>

### 입력 

 <p style="user-select: auto;">첫째 줄에 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)</p>

<p style="user-select: auto;">둘째 줄에 N개의 수가 주어진다. 입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다.</p>

### 출력 

 <p style="user-select: auto;">한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.</p>

<p style="user-select: auto;">수열은 사전 순으로 증가하는 순서로 출력해야 한다.</p>

