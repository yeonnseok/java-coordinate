# 기능 목록

- 좌표(Coordinate) 값 입력받기
  - 괄호() 안에 콤마(,)로 구분된 숫자 2개인지 확인
  - 괄호 안의 숫자가 0-24의 범위에 속하는지 확인
  - 괄호 안에 숫자가 있는지 확인
  - 하이픈(-)을 기준으로 나누기

- Coordinate : (x, y)의 좌표 하나를 나타내는 클래스

- Coordinates : 입력 받은 모든 좌표 정보를 담고 있는 클래스

- 도형을 추상화한 Figure 추상클래스 구현
    - Factory Pattern을 이용해 좌표의 수에 따라 인스턴스 생성

- 도형의 길이와 넓이를 구하는 Calculate 인터페이스 구현

- 도형 객체 생성
    - 좌표가 한 개인 경우 : Point
    - 좌표가 두 개인 경우 : Line
    - 좌표가 세 개인 경우 : Triangle
    - 좌표가 네 개인 경우 : Rectangle

- 콘솔창에서 전체 좌표의 한 줄을 나타내는 MapLine클래스
    - 0~24까지의 위치를 boolean으로 가지고 있어 좌표가 찍히면 true로 변경

- MapLine 인스턴스의 리스트를 가지고 있어 전체 좌표 지도 정보를 가지는 Map 클래스

- UserInputView : 콘솔로 사용자에게 입력을 받아 좌표 정보를 리턴하는 클래스 구현
    - 예외 상황에 대한 확인을 한 뒤 좌표 정보를 담은 Coordinates 클래스 리턴

- UserOutputView
    - Map 인스턴스에 담긴 좌표 정보를 출력
    - 도형에 따라 길이와 넓이를 출력