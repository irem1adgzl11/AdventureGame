
public class SafeHouse extends normalLoc {

	SafeHouse(Player player) {
		super(player, "Güvenli ev");
		
	}
public boolean getLocation() {
	player.setHealthy(player.getrHealthy());
	System.out.println("Canınız yenilendi.");
	System.out.println("Şuan Güvenli Ev adlı yerdesiniz.");
	return true;
}
}
