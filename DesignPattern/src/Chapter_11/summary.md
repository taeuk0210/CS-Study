# 11.1 여러 회사의 모터 지원하기

엘리베이터 제어 시스템에서 모터를 구동시키는 기능을 생각해보자. 예를 들어 현대모터를 이용하는 제어 시스템이라면 HyundaiMotor 클래스에 move 메서드를 정의할 수 있음

HyundaiMotor 클래스는 엘리베이터의 문 Door 클래스와 연관 관계를 맺고 있고 상태와 관련된 MotorStatus, DoorStatus, Direction 이라는 Enumeration 인터페이스를 이용한다.

move() 메서드는 우선 getMotorStatus를 호출하여 모터의 상태를 조회 후 만약 정지중이라면 getDoorStatus를 이용해서 문이 닫혀있는지 조회 마지막에 setMotorStatus를 호출하여 모터의 상태를 MOVING 으로 변경하는 방식으로 구현됨

# 11.2 문제점

HyundaiMotor 클래스 대신 다른 회사 모터를 쓴다면? 즉 LG 모터를 구동시켜야 한다면?

LG모터가 현대모터와 완벽히 같다고 볼 수 없기 때문에 현대 모터의 코드를 복사하고 일부분을 LG 모터에 맞게 수정해야할 필요가 있음

이는 다른 회사 모터를 사용할 때마다 중복 코드가 발생하게 되어 유지보수가 어려울 수 있다.

Motor 클래스를 일반화하여 상속으로 구현한다고 하더라도 어느정도의 중복 코드가 남아있을 수 있음

# 11.3 해결책

상속을 사용하되 메서드가 완전히 동일하지는 않고 부분적으로 동일한 경우 해당 부분을 상속을 활용하여 코드 중복을 피할 수 있음

즉 move 메서드의 공통 부분을 상위 클래스인 Motor로 이동시키고 특정 회사의 모터를 구동시키는 부분의 코드를 하위 클래스에서 재정의하도록 설계한다.

# 11.4 Template Method pattern

전체적으로는 동일하면서 부분적으로는 다른 구문으로 구성된 메서드의 코드 중복을 최소화할 때 유용하다.

HyundaiMotor, LGMotor에서 동일한 기능을 구현하면서도 각 하위 클래스에서 구체적으로 정의할 필요가 있는 부분만 오버라이드하도록 하면 됨!

이러한 경우 상위 클래스의 메서드를 템플릿 메서드라 주로 호출되면서 하위클래스에서 오버라이드될 필요가 있는 메서드를 primitive 또는 hook 메서드라고 부름

정리하자면 템플릿 메서드 패턴은 전체적인 알고리즘은 상위 클래스에서 구현하면서 다른 부분은 하위 클래스에서 구현할 수 있는 패턴으로 코드 재사용에 유용함!
