# 9.1 여러가지 방식으로 성적 출력하기

성적을 출력하는 기능을 가진 프로그램을 작성하는 상황

1. 입력된 점수를 저장하는 ScoreRecord에는 addScore()가 있고 이 메서드가 실행될때 DataSheetView 객체의 update()를 호출
2. DataSheetView는 ScoreRecord 의 scores를 조회 후 점수를 차례대로 화면에 표시할 수 있음

# 9.2 문제점

1. 성적을 다른 형태로 출력하고 싶다면 어떤 작업을 해야하는가? 예를 들어 성적 목록 출력이 아닌 최댓값, 최솟값을 출력한다면?
2. 여러가지 형태의 성적을 동시 혹은 순차적으로 출력하려면 어떤 변경작업을 해야하는가?

## 9.2.1 성적을 다른 형태로 출력하는 경우

기존의 DataSheetView 대신 MinMaxView를 추가하여 새로 개발이 필요함. 이때 update 역시 새로 정의해야 함 -> OCP 위배

## 9.2.2 동시 혹은 순차적으로 성적을 출력하는 경우

ScoreRecord 에 복수의 DataSheetView 그리고 MinMaxView 필드를 추가해야 함. 그리고 addScore() 에서도 각각의 DataSheetView, MinMaxView의 update()를 호출해야 함 -> 역시 OCP 위배

# 9.3 해결책

문제 해결의 핵심은 성적 통보 대상이 변경되더라도 ScoreRecord 클래스를 그대로 재사용할 수 있어야 한다는 점  
ScoreRecord의 addScore는 통보 대상 객체의 update를 호출할 필요가 있음  
임의의 데이터가 변경되었을 때, 이에 관심을 가지는 모든 대상 객체에 통보하는 경우에도 필요한 기능

이러한 공통 기능을 상위 클래스 및 인터페이스로 일반화하고 이를 활용해 ScoreRecord 를 구현하는 방식으로 설계를 변경!

ScoreRecord를 추상화한 Subject 인터페이스에는 통보 대상을 추가/제거하는 attach()/detach() 메서드와 통보 대상의 update()를 호출하는 notifyObserver() 메서드가 있고 DataSheetView, MinMaxView를 추상화하는 Observer 인터페이스에는 update()가 있음

# 9.4 Observer pattern

데이터의 변경이 발생했을 경우 상대 클래스나 객체에 의존하지 않으면서 데이터 변경을 통보하고자 할 때 유용함!
