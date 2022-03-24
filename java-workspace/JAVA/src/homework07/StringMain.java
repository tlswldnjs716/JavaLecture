package homework07;

public class StringMain {
	public static void main(String[] args) {
		//개수 리턴
		StringUtil sentence = new StringUtil();
		String string = sentence.Str();
		char ch = sentence.put();
		int count = StringUtil.check(string, ch);
		System.out.println(count);
		
		String str = StringUtil.removeChar(string, ch);
		System.out.println(str);
	}
}
