package overRide.internal;

public class LuxuryRoomService extends RoomService {
    public LuxuryRoomService() {
        System.out.println("no arg constructor of LuxuryRoomService");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in LuxuryRoomService");
    }
    public void serviceName() {
        System.out.println("serviceName running in LuxuryRoomService");
    }
}
