package tagpack;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class convertString extends SimpleTagSupport {
public String val;

public String getVal() {
	return val;
}

public void setVal(String val) {
	this.val = val;
}
public void doTag()throws JspException,IOException
{
	//char[] ch = val.toCharArray();
	int len = val.length();
	int i = 0;
	String ans = "";
	while(i<len) {
		char ch = val.charAt(i);  
		if(ch <= 'z' && ch>= 'a') {
			ch =(char)((int)(ch-32));
		}
		else
			ch =(char)((int)(ch+32));
		ans += ch;
		i++;
	}
	getJspContext().getOut().print(ans);
	
}
}
