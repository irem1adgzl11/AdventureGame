import java.util.Scanner;

public class Player {

	private int damage, healthy, money, rHealthy;
	private String name, cName;
	private İnventory inv;
	
	Scanner scan = new Scanner(System.in);
	
	public Player(String name) {
	    this.name = name;
	    this.inv = new İnventory();
	}
	
	public void selectCha() {
  switch (chaMenu()) {
  case 1:  // Samuray seçildi
	  initPlayer("Samuray", 5, 21, 15);
	   break;
  case 2:// Okçu seçildi
	  initPlayer("Okçu", 7, 18, 20);
	  break;
  case 3:// Şövalye seçildi
	  initPlayer("Şövalye", 8, 24, 5);
	  break;
 default:// Samuray verildi
	 initPlayer("Samuray", 5, 21, 15);
	  break;
		  
  }
 System.out.println("Karakter: " + getcName() + ", Hasar: " + getDamage() + ", Sağlık: " + getHealthy() + ", Para: " + getMoney());
	}
	
	public int chaMenu() {
		System.out.println("Lütfen bir karakter giriniz: "); // \t arada uzunca bir boşluk bırakır
		System.out.println("1- Samuray \t Hasar: 5 \t Sağlık: 21 \t Para: 15");
		System.out.println("2- Okçu \t Hasar: 7 \t Sağlık: 18 \t Para: 20");
		System.out.println("3 - Şövalye \t Hasar: 8 \t Sağlık: 24 \t Para: 5");
	System.out.println("Karakter Seçiminiz: ");
	int chaID = scan.nextInt();
	
	while(chaID < 1 || chaID > 3) {
		System.out.println("Lütfen geçerli bir karakter seçiniz: ");
		 chaID = scan.nextInt();
	}
	
	return chaID;
	}
	public int getTotalDamage() {
		return this.getDamage() + this.getInv().getDamage();
	}
	
	
	public void initPlayer(String cName, int dmg, int hlthy, int mny) {
		setcName(cName);
		  setDamage(dmg);
		  setHealthy(hlthy);
		  setMoney(mny);
		  setrHealthy(hlthy);
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealthy() {
		return healthy;
	}
	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public İnventory getInv() {
		return inv;
	}
	public void setInv(İnventory inv) {
		this.inv = inv;
	}

	public int getrHealthy() {
		return rHealthy;
	}

	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}
	
}
