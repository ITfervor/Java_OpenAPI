import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParsing {

	public static void main(String[] args) {
		//1. 웹에서 필요한 문자열 가져오기
		//API Server에서 데이터를 받아오는 부분은
		//전송방식 , 파라미터 부분을 제외하면 동일
		
		String html = null;
		try {
			//URL생성
			URL url = new URL("https://www.hani.co.kr/");
			//다운로드 옵션 설정 - 전송방식이나 파라미터 설정
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			//파라미터 설정
			
			//결과 다운로드
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder sb = new StringBuilder();
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//파싱을 할 떄는 \n은 의미가 없다.
				//데이터를 확인하고자 할 떄 보기좋게 출력하기 위해서 삽입
				sb.append(line+"\n");
				
			}
			html = sb.toString();
			System.out.println(html);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		
		//2. 문자열에서 원하는 데이터 추출하기 - Parsing
		//데이터 형식에 따라 json, xml, csv, html에 따라 다름
		if(html != null) {
			try {
				//html문자열을 메모리에 DOM형태로 펼치기
				Document document = Jsoup.parse(html);
				/*
				//태그 가지고 찾기
				Elements elements = document.getElementsByTag("a");
				//태그는 여러개 이므로 순회
				for(int i = 0; i <elements.size(); i++) {
					//한개 찾아오기
					Element element =elements.get(i);
					
					//텍스트 확인
					//System.out.println(element.text());
					
					//속성 확인
					//System.out.println(element.attr("href"));
				}
            */
			//선택자 이용	
			Elements elements = document.select("");
			for(int i = 0; i <elements.size(); i++){
				
			}
				
				
				
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());			}
		}

	// 3. 데이터를 사용
}

}
