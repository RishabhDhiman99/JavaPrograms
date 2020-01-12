//3.3
class Room{
	float l;
	float b;
	void getData(float l,float b) {
		this.l = l;
		this.b = b;
	}
}
public class RoomArea {
	public static void main(String args[]) {
		float area;
		Room room = new Room();
		room.getData(10,14);
		area = room.l*room.b;
		System.out.println("area of room: "+area);
	}

}
