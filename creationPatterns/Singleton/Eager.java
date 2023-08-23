package creationPatterns.Singleton;

//Eager Initialization 으로 호출 시에 초기화된다.
public class Eager {

    //어디서 사용하더라도 동일한 인스턴스를 넘겨주기 위해 private static final 로 메모리에 상주시킨다.
    private static final Eager instance = new Eager();

    private Eager(){
        //Private 생성자.
    }
    //단일 인스턴스를 호출하기 위해 public static 으로 외부에서 참조할 수 있도록한다.
    public static Eager getInstance(){
        return instance;
    }

}
