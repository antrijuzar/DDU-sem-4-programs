package lab8;

public class Program2 {
	int arg1,arg2;
	String operator;
	public int getArg1() {
		return arg1;
	}
	public void setArg1(int arg1) {
		this.arg1 = arg1;
	}
	public int getArg2() {
		return arg2;
	}
	public void setArg2(int arg2) {
		this.arg2 = arg2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public int getResult() {
		if(operator.equals("*")) {
			return arg1*arg2;
		}
		if(operator.equals("/")) {
			return arg1/arg2;
		}
		if(operator.equals("-")) {
			return arg1-arg2;
		}
		if(operator.equals("+")) {
			return arg1+arg2;
		}
		if(operator.equals("%")) {
			return arg1%arg2;
		}
		return 0;
	}
}
