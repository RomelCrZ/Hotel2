package Controller

import Entidades.Room
import util.Printer

class RoomsController {
    private val printer = Printer()
    private val roomList = mutableListOf<Room>()

    fun registerRoom() {
        printer.printMsg("Ingrese el precio por noche")
        val pricePerNight = readln().toDouble()
        printer.printMsg("Ingrese la capacidad")
        val capacity: Int = readln().toInt()
        printer.printMsg("Ingrese el numero de habitacion")
        val roomNumber: Int = readln().toInt()
        val isAvailable = true

        val addedRoom = Room(
            pricePerNight,
            capacity,
            roomNumber,
            isAvailable
        )
        roomList.add(addedRoom)
    }

    fun modifyRoom() {}

    fun getRoomByIndex(index: Int): Room {
        return roomList[index]
    }

    fun showRooms() {
        if (roomList.isEmpty()) {
            printer.printMsg("No se encuentran habitaciones registradas")
        } else {
            var counter = 1
            for (room in roomList) {
                printer.printMsg("$counter " + room.getRoomData())
                counter++
            }
        }
    }

    fun areNotRoomsRegistered(): Boolean = roomList.isEmpty()

}