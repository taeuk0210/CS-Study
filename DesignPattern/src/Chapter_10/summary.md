# 10.1 도로 표시 방법 조합하기

네비게이션 SW에 도로를 표시하는 기능을 개발하는 상황, 기본적으로 도로 표시를 제공하는 RoadDisplay 클래스와 기본 도로 표시에 추가적으로 차선을 표시하는 RoadDisplayWithLane 클래스를 설계할 수 있음. 특히 RoadDisplayWithLane 은 RoadDisplay를 상속받는 하위 클래스로 설계할 수 있음

즉 RoadDisplay의 draw()를 RoadDisplayWithLane이 Override 함

# 10.2 문제점

1. 또 다른 기능을 추가로 구현하고 싶다면 어떻게 해야하는가?
2. 여러 가지 추가 기능을 조합해 제공하고 싶다면 어떻게 해야하는가?

## 10.2.1 또 다른 기능을 추가로 구현하는 경우

RoadDisplayWithLane 과 같이 RoadDisplay를 상속받는 RoadDisplayWithTraffic 하위 클래스를 새로 작성

## 10.2.2 여러 가지 추가 기능을 조합해야 하는 경우

RoadDisplay를 상속받고 각각의 기능이 조합된 경우의 수 만큼 하위 클래스를 새로 작성해야함 -> 엄청난 코드이 중복!

# 10.3 해결책

상속을 이용한 추가 기능은 추가되는 기능의 조합별로 하위 클래스를 구현해야 하는 문제가 있음

즉 추가 기능별로 개별적인 클래스를 설계하고 기능을 조합할 대 각 클래스의 객체 조합을 이용해야 함

계층구조를 적자면

Display

- RoadDisplay
- DisplayDecorator
  - LaneDecorator
  - TrafficDecorator

의 상속 구조를 가짐 Display에는 추상 메서드 draw()가 있고 DisplayDecorator에는 Display 필드가 있음 즉 이 Display 필드에 상위 객체(RoadDisplay)를 입력하여 메서드를 조합하여 사용할 수 있음(합성 함수 느낌으로 생각하면 간단한 듯)

이러한 방법으로 구현하면 상속을 받아서 구현하는 경우 기능의 조합을 효율적으로 설계할 수 있음

# 10.4 Decorator pattern

기본 기능에 추가할 수 있는 기능의 종류가 많은 경우에 각 추가 기능을 Decorator 클래스로 정의한 후 필요한 Decorator 객체를 조합함으로써 추가 기능의 조합을 설계하는 방식  
즉, 기본 기능에 추가할 수 있는 많은 종류의 부가 기능에서 파생되는 다양한 조합을 구현할 수 있는 패턴임!

상황에 맞게 동적으로 기능을 조합할 수도 있음
