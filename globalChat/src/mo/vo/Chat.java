package mo.vo;

import java.sql.Date;

public class Chat implements java.io.Serializable{
	private final static long serialVersionUID = 3242423L;
	private String name;
	private String content;
	private Date time;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Chat [name=" + name + ", content=" + content + ", time=" + time + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public Chat(String name, String content, Date time) {
		super();
		this.name = name;
		this.content = content;
		this.time = time;
	}
	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
