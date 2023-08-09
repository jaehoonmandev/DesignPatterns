package creationPatterns.Factory;

public class FactoryMain {

    public static void main(String[] args){
        //케이스에 맞게 객체를 생성해주는 Factory 선언
        FordFactory fordFactory = new FordFactory();

        //"Mustang" 이라는 인자를 넘겨 Mustang 객체를 생성한다.
        Ford car1 = fordFactory.getFord("Mustang", "Black");

        System.out.println("Model is "+ car1.getModel()
                +" and Color is " + car1.getColor());

        //"Explorer" 이라는 인자를 넘겨 Mustang 객체를 생성한다.
        Ford car2 = fordFactory.getFord("Explorer", "Silver");

        System.out.println("Model is "+ car2.getModel()
                +" and Color is " + car2.getColor());
    }
}
