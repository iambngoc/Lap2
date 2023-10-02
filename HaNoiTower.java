package Lab2;

public class HaNoiTower {
	static int count = 0;

	public static void MoveTower(int disk, String source, String dest, String spare) {
		if (disk == 1) {
			System.out.println("move 1 from " + source + " to " + dest);
		} else {
			MoveTower(disk - 1, source, spare, dest);
			System.out.println("move "+ disk +" from " + source + " to " + dest);
			MoveTower(disk - 1, spare, dest, source);
		}
		count++;
	}

	public static void main(String[] args) {
		MoveTower(3, "A", "C", "B");
	}
}
