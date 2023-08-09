package creationPatterns.Factory;

//인자로 넘겨 받는 model 값에따라 생성하는 객체를 지정하는 Factory
public class FordFactory {

    //Return Type으로 Ford Interface를 지정,
    //Mustang과 Explorer은 Ford Interface를 implements하여 Ford로 return
    public Ford getFord(String model, String color){
        if(model == null || color==null){
            return null;
        }
        //model의 이름이 Mustang이라면.
        if(model.equals("Mustang")){
            return new Mustang(model, color);
        }
        //model의 이름이 Explorer라면.
        if(model.equals("Explorer")){
            return new Explorer(model, color);
        }

        return null;
    }

}
