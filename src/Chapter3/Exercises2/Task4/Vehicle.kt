package Chapter3.Exercises2.Task4

interface Vehicle {
    fun start();
    fun stop();
    fun getInfo();
    fun calculateFuelEfficiency(distanceKilometers: Double, fuelLiters: Double): Double

}