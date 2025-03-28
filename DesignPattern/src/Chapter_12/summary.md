# 12.1 여러가지 방식의 엘리베이터 스케줄링 방법 지원하기

여러대의 엘레베이터가 있는 경우 이를 스케줄링해 엘리베이터를 이동시키는 경우를 가정

예를 들어 목적이 층과 가까우면서 목적지 층의 방향으로 이동 중인 엘리베이터를 선택하는 것도 하나의 전략이 됨

현재 ElevatorManager 객체의 엘레베이터 수만큼의 ElevatorController, 그리고 하나의 ThroughputScheduler가 있음

ThroughputScheduler에서 요청받은 층수로 가기 좋은 엘레베이터를 선택해준다.

# 12.2 문제점

- 현재 ElevatorManager 클래스는 ThroughtputSechduler 클래스를 이용하는데 이는 엘리베이터의 처리량을 최대화시키는 전략임 만약 사용자의 대기시간을 최소화시키는 엘리베이터 전략을 사용한다면?
- 프로그램 실행 중에 스케줄링 전략을 변경, 즉 동적 스케줄링으르 지원해야 한다면? 예를 들어 오전에는 대기시간 최소화, 오후에는 처리량 최대화 전략을 사용한다면?

먼저 대기시간 최소화 전략을 수행하는 스케줄링 클래스가 필요하고 동적을 스케줄러를 변경하기 위해 ElevatorManager의 코드가 수정되야 함

이는 엘리베이터 스케줄링 전략이 추가되거나 동적 스케줄링 방식으로 전략을 선택하도록 변경되면 해당 스케줄링 전략을 지원하는 구체적인 클래스를 생성해야하고 requesetElevator() 메서도 또한 계속 수정되야하는 문제가 있음

# 12.3 해결책

문제를 해결하기 위해 주어진 기능을 실제로 제공하는 적절한 클래스 생성 작업을 별도의 클래스/메소드로 분리시키는 편이 좋음

ElevatorManager 객체가 직접 스케줄러를 생성하는것이 아니라 SchedulerFactory 클래스가 이를 생성하도록 설계

# 12.4 Factory method pattern

객체의 생성 코드를 별도의 클래스/메소드로 분리함으로써 객체 생성의 변화에 대비하는 데 유용함

프로그램이 제공하는 기능은 상황에 따라 변경될 수 있는데 이러한 기능의 변경이나 상황에 따른 기능의 선택은 해당 객체를 생성하는 코드의 변경을 초래함

이러한 경우 객체 생성 코드를 별도의 클래스/메소드로 분리해 이용해 해당 코드만 변경함으로써 변화에 효과적으로 대응할 수 있음 -> 중복 코드에 효과적

추가로 상속 관계를 이용하여 팩토리 메서드 패턴을 설계하는 경우 팩토리 메서드를 이용해 구체적인 클래스의 객체를 생성하는 기능은 일반적으로 하위 클래스에서 오버라이드되게 하기 때문에 팩토리 메서드를 호출하는 상위클래스의 메서드는 템플릿 메서드가 됨
