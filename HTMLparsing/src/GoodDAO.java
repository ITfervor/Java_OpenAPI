import java.util.List;

//goods 테이블에 수행할 데이터베이스 작업의 원형을 소유할 데이터베이스
public interface GoodDAO {
	//goods 테이블의 전체데이터 가져오기
	//public 리턴타입- 출력데이터를 어떤형식으로 보여주나 이름-상관 없음 (매개변수- 전부 가져오므로 빈칸);
	//리스트 : div, 그래프, 태그 3개의 종류중 1개로 보여줌
	public List<Good> getAll ();
	
	//goods 테이블에서 code를 가지고 데이터를 조회
	//public ? 이름(?);
	public Good getGood(String code);
	
	//goods 테이블에서 name이나 manufacture에 포함된 데이터 조회
	public List<Good> likeGood(String content);

	
	//goods 테이블에 데이터를 삽입하기
	//수정은 모양이 동일
	//삭제는 동일하게 만들어도 되고 매개변수를 기본키로 만들어도 된다.
	public int insertGood(Good good);
	
	
}
