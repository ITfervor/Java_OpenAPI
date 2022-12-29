import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MariaDB {

	public static void main(String[] args) {
		// 데이터베이스 접속에 필요한 정보 불러오기
		String driver = null;
		String url = null;
		String id = null;
		String password = null;

		// 읽어올 파일 생성
		File file = new File("./db.properties");

		try (FileInputStream is = new FileInputStream(file);) {
			// 파일의 내용을 properties에 저장
			Properties properties = new Properties();
			properties.load(is);

			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			id = properties.getProperty("id");
			password = properties.getProperty("password");

		} catch (Exception e) {
			// TODO: handle exception
		}

		// 1. 데이터 베이스 드라이버 로드 - 한번만 진행하면 됨
		// 드라이버 의존성을 성정하지 않거나 크랠스 이름이 틀리면 예외 발생
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		// 2.데이터 베이스 접속 - java.sql.Connection
		// 정보를 "" 안에 직접삽입해주어도 사용 가능 보안문제로 인해 직접 삽입하지는 않음
		try (Connection con = DriverManager.getConnection(url, id, password)) {
			System.out.println(con);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
