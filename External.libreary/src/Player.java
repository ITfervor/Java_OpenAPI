import java.util.Date;

public class Player {
	private String name;
	private int age;
	private Date birth;
	private String email;
	private String nickname;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String name, int age, Date birth, String email, String nickname) {
		super();
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.email = email;
		this.nickname = nickname;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Date getBirth() {
		return birth;
	}
	public String getEmail() {
		return email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", birth=" + birth + ", email=" + email + ", nickname="
				+ nickname + "]";
	}
}