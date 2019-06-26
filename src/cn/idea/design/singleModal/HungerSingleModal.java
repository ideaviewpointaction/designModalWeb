package cn.idea.design.singleModal;

public class HungerSingleModal {

    private static HungerSingleModal single=new HungerSingleModal();
    private HungerSingleModal(){

    }

    public static HungerSingleModal getSingle(){
        return single;
    }


}
