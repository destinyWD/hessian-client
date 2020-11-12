package core.common;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;


public class BaseExecuteResult<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private int isSuccess = 0;// 0:未成功 1:成功，仅表示接口是否调用成功，不判断接口返回信息
	private String errorCode;
	private String errorMsg;
	private boolean needTerminate = false;
	/**
	 * 执行结果类别
	 */
	private String executeType;
	private T result;

	public BaseExecuteResult() {
		super();
	}

	public BaseExecuteResult(String executeType) {
		this.executeType = executeType;
	}

	public BaseExecuteResult(int isSuccess, T result) {
		this.isSuccess = isSuccess;
		this.result = result;
	}
	
	public BaseExecuteResult(int isSuccess, String errorCode, String errorMsg) {
		super();
		this.isSuccess = isSuccess;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public String getExecuteType() {
		return executeType;
	}

	public int getIsSuccess() {
		return isSuccess;
	}

	public T getResult() {
		return result;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public void setExecuteType(String executeType) {
		this.executeType = executeType;
	}

	public void setIsSuccess(int isSuccess) {
		this.isSuccess = isSuccess;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public boolean isNeedTerminate() {
		return needTerminate;
	}

	public void setNeedTerminate(boolean needTerminate) {
		this.needTerminate = needTerminate;
	}

	@Override
	public String toString() {
		return "BaseExecuteResult [isSuccess=" + isSuccess + ", errorCode=" + errorCode + ", errorMsg=" + errorMsg
				+ ", needTerminate=" + needTerminate + ", executeType=" + executeType + ", result=" + result + "]";
	}
	
	public String toJson(){
		return JSONObject.toJSONString(this);
	}
}
