package filelib;

public interface BookInterface {
	//도서대여
	public void borrow();
	//도서반납
	public void bookReturn();
	//도서등록
	public void bookAdd();
	//도서삭제
	public void bookDel();
}