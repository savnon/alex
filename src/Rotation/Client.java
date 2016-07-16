package Rotation;

public class Client {
    public static void main(String[] args){
        //创建状态
//        State state = new CreateJAAS();
        //创建环境
        Context context = new Context(true,true,true,true,true);
        //将状态设置到环境中
//        context.setState(state);
        //请求
        for (int i = 0; i < 6; i++) {
        	context.request("test");	
        }
        
    }
}
