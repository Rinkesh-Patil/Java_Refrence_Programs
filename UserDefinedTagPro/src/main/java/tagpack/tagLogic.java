package tagpack;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class tagLogic extends SimpleTagSupport {
int first;
int second;
public int getFirst() {
	return first;
}
public void setFirst(int first) {
	this.first = first;
}
public int getSecond() {
	return second;
}
public void setSecond(int second) {
	this.second = second;
}
public void doTag()throws JspException,IOException
{
	getJspContext().getOut().print("Difference : "+(first-second));
}


}
