public class Main {
    public static void main(String[] args) {
        Route route = new Route(RouteInitializer.init("Route.txt"));
        double distance = route.getDistance();
        Transport bus = new Transport(60, 20, 15, TransportKind.BUS);
        Transport car = new Transport(90, 4, 9, TransportKind.CAR);
        Transport bike = new Transport(15, 1, 0, TransportKind.BIKE);
        Transport onFoot = new Transport(3, 1, 0, TransportKind.ON_FOOT);
        Statistics.showStatistics(bus, distance);
        Statistics.showStatistics(car, distance);
        Statistics.showStatistics(bike, distance);
        Statistics.showStatistics(onFoot, distance);
        System.out.println(distance);
    }
}
