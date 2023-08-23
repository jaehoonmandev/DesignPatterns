package creationPatterns.Singleton;

//필요시에만 인스턴스를 할당하여 메모리 효율적이며, 생성 시점에서 예외처리를 할 수 있다.
public class Lazy {

    private static Lazy instance;

    /* 쓰레드는 각자의 CPU 캐시에 인스턴스를 저장하는데 이로인해 쓰레드마다 값이 불일치할 가능성이 있기에
    * volatile로 메인 메모리에서만 인스턴스를 읽어 오도록 강제한다.*/
    private static volatile Lazy instance_volatile= new Lazy();

    private Lazy(){}

    //인스턴스 참조를 위한 메서드
    public static Lazy getInstance(){
        //null-check 를 통하여 인스턴스 할당이 되어있지 않은 시점에 인스턴스를 할당한다.
        if(instance == null){
            //인스턴스 생성 시 예외처리를 겸할 수 있다.
            instance = new Lazy();
        }
        return instance;
    }

    //멀티쓰레드 환경에서 Race condition 이 발생하는 것을 방지하기 위해 synchronized 처리.
    synchronized public static Lazy getInstance_sync(){
        if(instance == null){
            instance = new Lazy();
        }
        return instance;
    }

    //메서드 자체가 아닌 인스턴스 생성시기에만 synchronized 속성을 부여해 동기처리로 인한 성능 저하 개선.
    public static Lazy getInstance_Double_Check_locking(){
        //생성된 인스턴스가 없을 때만
        if(instance == null){
            //멀티 스레드 환경에서 race condition에 빠지지 않기위해
            //synchronized 를 이용하여 방지해준다.
            synchronized (Lazy.class){
                //내부에서 한 번 더 null check
                if (instance == null){
                    instance = new Lazy();
                }

            }
        }
        return instance;
    }

}
