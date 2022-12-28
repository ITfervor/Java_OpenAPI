
public class GoodMain {

	public static void main(String[] args) {
		 GoodDAO dao1 = GoodDAOImpl.getInstance();
		 GoodDAO dao2 = GoodDAOImpl.getInstance();
		 GoodDAO dao = GoodDAOImpl.getInstance();

		 
		 System.out.println(System.identityHashCode(dao2));
		 System.out.println(System.identityHashCode(dao1));
		 /*
		 //System.out.println(dao.getAll());
		 System.out.println(dao.getGood("1"));
		 System.out.println(dao.getGood("2"));
		 System.out.println(dao.getGood("3"));
		 
		 Good good = new Good();
		 good.setCode("10");
		 good.setName("과자");
		 good.setManufacture("대만");
		 good.setPrice(50);
		 
		 int r = dao.insertGood(good);
		 if(r == 1) {
			 System.out.println("삽입성공");
		 }else{
			 System.out.println("삽입성공");
		 }
		 */
		 
		 System.out.println(dao.likeGood("국"));
	}

}
