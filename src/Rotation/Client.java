package Rotation;

public class Client {
    public static void main(String[] args){
        //����״̬
//        State state = new CreateJAAS();
        //��������
        Context context = new Context(true,true,true,true,true);
        //��״̬���õ�������
//        context.setState(state);
        //����
        for (int i = 0; i < 6; i++) {
        	context.request("test");	
        }
        
    }
}
