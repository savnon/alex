package Rotation;

public class Context {
	   //����һ��State���͵Ķ���ʵ��
    private State state;

    private boolean DBAASExist;
    private boolean DBAASReady;
    private boolean DBAASFail;
    private boolean JAASExist;
    private boolean JAASReady;
    private boolean JAASFail;
    private boolean ControlFlag;
    
    public Context(boolean DBAASExist, boolean DBAASReady, boolean DBAASFail, boolean JAASReady, boolean JAASFail) {
    	   this.DBAASExist = DBAASExist;
    	   this.DBAASReady = DBAASReady;
    	   this.DBAASFail = DBAASFail;
//    	   this.JAASExist = JAASExist;
    	   this.JAASReady = JAASReady;
    	   this.JAASFail = JAASFail;
    	   this.ControlFlag = true;
    	    
    }
    /**
     * �û�����Ȥ�Ľӿڷ���
     */
    public void getInstanceStatus() {
 	   this.DBAASExist = true;
 	   this.DBAASReady = false;
 	   this.DBAASFail = true;
// 	   this.JAASExist = JAASExist;
 	   this.JAASReady = true;
 	   this.JAASFail = false;
    }
    
    public void request(String sampleParameter) {
    	
    	if(!DBAASExist) {
    		state = new CreateDBAAS();
    	} else if(DBAASReady&&ControlFlag == true) {
    		state = new CreateJAAS();
    		ControlFlag = false;
    	} else if(DBAASReady&&JAASReady||JAASFail) {
    		state = new DeleteJAAS();
    		ControlFlag = false;
    	} else if(DBAASReady&&ControlFlag == false||DBAASFail) {
    		state = new DeleteDBAAS();
    		ControlFlag = true;
    	} 
    	
        //ת��state������
        state.handle(sampleParameter);
    }
}
