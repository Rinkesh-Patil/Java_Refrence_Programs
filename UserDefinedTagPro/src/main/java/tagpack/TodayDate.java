package tagpack;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class TodayDate extends SimpleTagSupport{
  Date today = new Date();
  public void doTag()throws JspException,IOException
  {
  	getJspContext().getOut().print(today);
  }
}
