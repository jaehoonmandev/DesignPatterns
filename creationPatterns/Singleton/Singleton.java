package creationPatterns.Singleton;

public class Singleton {
    // 메인 메모리에 상주시킬 하나의 인스턴스.
    // Singleton Pattern의 핵심이라 할 수 있다.
    // volatile과 synchrinized, if로 Double check
    private static volatile Singleton instance = new Singleton();

    //생성자
    private Singleton(){
        System.out.println("Instance Created");
    }

    //인스턴스를 구해오는 메소드
    public static Singleton getInstance(){
        //인스턴스가 기존 생성되어있는지 확인 후 없다면 생성하여 넘겨준다.
        //Lazy initialization 을 이용하여 메모리 효율적으로 리턴이 가능.
        if(instance == null){
            //멀티 스레드 환경에서 race condition에 빠지지 않기위해
            //synchronized 를 이용하여 방지해준다.
            synchronized (Singleton.class){
                //기존에 생성된 인스턴스가 없다면 생성해서 return
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        System.out.println("Singleton instance return");
        return instance;
    }

}
