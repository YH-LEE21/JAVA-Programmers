### 3 x n 타일링

***

#### 문제 설명
가로 길이가 2이고 세로의 길이가 1인 직사각형 모양의 타일이 있습니다. 이 직사각형 타일을 이용하여 세로의 길이가 3이고 가로의 길이가 n인 바닥을 가득 채우려고 합니다.</br>
타일을 채울 때는 다음과 같이 2가지 방법이 있습니다

* 타일을 가로로 배치 하는 경우
* 타일을 세로로 배치 하는 경우

예를들어서 n이 8인 직사각형은 다음과 같이 채울 수 있습니다.</br>
<img src="https://i.imgur.com/zBW7peI.png" alt = "이미지 0">

직사각형의 가로의 길이 n이 매개변수로 주어질 때, 이 직사각형을 채우는 방법의 수를 return 하는 solution 함수를 완성해주세요.

#### 제한사항
* 가로의 길이 n은 5,000이하의 자연수 입니다.
* 경우의 수가 많아 질 수 있으므로, 경우의 수를 1,000,000,007으로 나눈 나머지를 return해주세요.

#### 입출력 예
n	  |result|
|:--|:--
4	  |11    |

#### 입출력 예 설명
입출력 예 #1</br>
다음과 같이 11가지 방법이 있다.</br>
<img src="https://i.imgur.com/nnoT9kL.png" alt = "이미지 1">
<img src="https://i.imgur.com/QTZFrTH.png" alt = "이미지 2">
<img src="https://i.imgur.com/YE1JfJn.png" alt = "이미지 3">
<img src="https://i.imgur.com/QhYvRTr.png" alt = "이미지 4"></br>
<img src="https://i.imgur.com/NKgKTIR.png" alt = "이미지 5">
<img src="https://i.imgur.com/3uobFxe.png" alt = "이미지 6">
<img src="https://i.imgur.com/sEK9oor.png" alt = "이미지 7">
<img src="https://i.imgur.com/u6dpiep.png" alt = "이미지 8"></br>
<img src="https://i.imgur.com/re3C19N.png" alt = "이미지 9">
<img src="https://i.imgur.com/GerdAJB.png" alt = "이미지 10">
<img src="https://i.imgur.com/ITcbWj0.png" alt = "이미지 11">
