package creationPatterns.Factory;

//Ford Interface를 구현하여 생성할 Explorer 클래스
public class Explorer implements Ford{
    //지역 변수
    String model,color;

    //초기화
    Explorer(String model, String color){
        this.model = model;
        this.color = color;
    }
    //Ford Interface 구현
    @Override
    public String getModel(){
        return this.model;
    }

    @Override
    public String getColor(){
        return this.color;
    }

}
