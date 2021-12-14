package model.vo;

/**
 * @author jyj98
 *
 */
public class BbsVO extends FilterVO{
	private int seq, viewcnt;
	private String subject,content, writer, regdate;
	public BbsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BbsVO(int seq, int viewcnt, String subject, String content, String writer, String regdate) {
		super();
		this.seq = seq;
		this.viewcnt = viewcnt;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "BbsVO [seq=" + seq + ", viewcnt=" + viewcnt + ", subject=" + subject + ", content=" + content
				+ ", writer=" + writer + ", regdate=" + regdate + "]";
	}
	public String info() {
		return "BbsVO [seq=" + seq + ", viewcnt=" + viewcnt + ", subject=" + subject
				+ ", writer=" + writer + ", regdate=" + regdate + "]";
	}
	
	
}
