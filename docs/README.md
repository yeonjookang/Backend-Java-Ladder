# To Do List

## 1. 하드 코딩 상수 변경(static final 이용 or Enum 클래스 이용)
    :예) 할인율과 관련된 로직이나 상태를 Enum 클래스로 묶기(재사용성,확장성 높음)
1. Direction
2. ErrorMessage

## 2. 원시값 포장
1. NumberOfRow, numberOfPerson -> NaturalNumber
   :NaturalNumber 클래스를 만들어서 게임에서 사용하는 행과 사람의 수를 이 클래스로 표현
2. 배열 인덱스 -> Position 클래스 포장
   :배열 인덱스를 직접 사용하지 말고, Position 클래스로 감싸서 사용  
3. Row 클래스 내 int [] -> Node 배열로 변경
    :Node 클래스는 해당 위치에 사다리의 상태를 나타내는 데에 사용

## 3. 클래스 분리 (게임의 로직을 더 명확하게 이해하고 관리)
1. LadderRunner 사다리 움직임 담당
2. LadderCreator 사다리 생성 담당
3. LadderGame 사다리 게임 전체 흐름을 담당

# 객체지향적인 설계의 의의
객체지향적인 설계는 코드의 가독성과 유지 보수성이 향상되며, 코드의 재사용성도 증가한다!