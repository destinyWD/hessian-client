package core.factory;

/**
 * Created by WD on 2018/3/9.
 */
public class ExecutionResult {
    boolean handled;
    Object result;
    public boolean getHandled() {
        return handled;
    }
    public void setHandled(boolean handled) {
        this.handled = handled;
    }
    public Object getResult() {
        return result;
    }
    public void setResult(Object result) {
        this.result = result;
    }
}
