package creationPatterns.Singleton;

//statick block을 이용하여 인스턴스 생성의 제어를 가질 수 있는 초기화 방법.
public class Static_block {
    //getInstance() 와 같은 인스턴스 제공 메서드가 없기에 public 지정
    public static Static_block instance;

    private Static_block(){}

    //static 블럭안에서 초기화되기에 예외 처리와 같은 제어권을 가질 수 있게된다.
    static {
        instance = new Static_block();
    }

}
