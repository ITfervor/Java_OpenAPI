import org.mindrot.jbcrypt.BCrypt;

public class CryptMain {

	public static void main(String[] args) {
		// 복호화가 불가능한 엄호화
		String encryptString = BCrypt.hashpw("abcdefghijklmn", BCrypt.gensalt());
		System.out.println(encryptString);
		
		// 비교 - 평문이 먼저오고 암호화된 문장
		System.out.println(BCrypt.checkpw("abcdefghijklmn", encryptString));
		
		//예외가 발생 - 순서가 바뀌면 안됨
		//System.out.println(BCrypt.checkpw(encryptString, "abcdefghijklmn"));

	}

}
