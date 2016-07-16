package Rotation;

public class DeleteJAAS implements State{
    @Override
    public void handle(String sampleParameter) {
        
        System.out.println("DeleteJAAS handle £º" + sampleParameter);
    }

}
