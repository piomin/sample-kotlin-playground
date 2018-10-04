package pl.piomin.services.test.repository

import pl.piomin.services.test.model.PassengerCar
import pl.piomin.services.test.model.Truck
import pl.piomin.services.test.model.Vehicle

class Repository<T> {

    var l: MutableList<T> = ArrayList()

    fun addAll(objects: MutableList<out T>) {
        l.addAll(objects)
    }

    fun add(o: T) {
        l.add(o)
    }

}

fun main(args: Array<String>) {
    val r = Repository<Vehicle>()
    var l1: MutableList<Truck> = ArrayList()
    l1.add(Truck())
    r.addAll(l1)
    println("${r.l.size}")
    var l2: MutableList<PassengerCar> = ArrayList()
    l2.add(PassengerCar())
    r.addAll(l2)
    println("${r.l.size}")
}