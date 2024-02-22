package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    String parkingLotId;
    List<List<Slot>> slots;

    ParkingLot(String parkingLotId, int nFloors, int noOfSlotsPerFlr) {
        this.parkingLotId = parkingLotId;

        slots = new ArrayList<>();
        for (int i = 0; i < nFloors; i++) {
            slots.add(new ArrayList<>());
            List<Slot> floorslots = slots.get(i);
            floorslots.add(new Slot("truck"));
            floorslots.add(new Slot("bike"));
            floorslots.add(new Slot("bike"));
            for (int j = 3; j < noOfSlotsPerFlr; j++) {
                slots.get(i).add(new Slot("car"));
            }
        }
    }

    public String parkVehicle(String type, String regNo, String color) {
        Vehicle vehicle = new Vehicle(type, regNo, color);
        for (int i = 0; i < slots.size(); i++) {
            for (int j = 0; j < slots.get(i).size(); j++) {
                Slot slot = slots.get(i).get(j);
                if (slot.type.equals(type) && slot.vehicle == null) {
                    slot.vehicle = vehicle;
                    slot.ticketId = generateTicketId(i + 1, j + 1);
                    return slot.ticketId;
                }
            }
        }
        System.out.println("No slots available");
        return null;
    }

    private String generateTicketId(int flr, int slno) {
        return parkingLotId + "_" + flr + "_" + slno;
    }

    public int getNoOfOpenSlots(String type) {
        int count = 0;
        for (List<Slot> floor : slots) {
            for (Slot slot : floor) {
                if (slot.vehicle == null && slot.type.equals(type)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void displayOpenSlots(String type) {
        for (int i = 0; i < slots.size(); i++) {
            for (int j = 0; j < slots.get(i).size(); j++) {
                Slot slot = slots.get(i).get(j);
                if (slot.vehicle == null && slot.type.equals(type)) {
                    System.out.println("Floor " + (i + 1) + " slot " + (j + 1));
                }
            }
        }
    }

    public void displayOccupiedSlots(String type) {
        for (int i = 0; i < slots.size(); i++) {
            for (int j = 0; j < slots.get(i).size(); j++) {
                Slot slot = slots.get(i).get(j);
                if (slot.vehicle != null && slot.type.equals(type)) {
                    System.out.println("Floor " + (i + 1) + " Slots  " + (j + 1));
                }
            }
        }
    }

    public void unPark(String ticketId) {
        String[] extract = ticketId.split("_");
        int flr_idx = Integer.parseInt(extract[1]) - 1;
        int slot_idx = Integer.parseInt(extract[2]) - 1;

        for (int i = 0; i < slots.size(); i++) {
            for (int j = 0; j < slots.get(i).size(); j++) {
                if (i == flr_idx && j == slot_idx) {
                    Slot slot = slots.get(i).get(j);
                    slot.vehicle = null;
                    slot.ticketId = null;
                    System.out.println("Unparked Vehicle");
                }
            }
        }
    }
}
