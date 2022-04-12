class Lamp {

    //property (data member)
    private var isOn: Boolean = false

    //member function
    fun turnOn(){
        isOn = true
    }

    //member function
    fun turnOff(){
        isOn = false
    }

    fun displayLightStatus(lamp: String){

        val l1 = Lamp() // membuat objek l1 dari class Lamp
        val l2 = Lamp() // membuat objek l2 dari class Lamp

        l1.turnOn()
        l2.turnOff()

        l1.displayLightStatus("l1")
        l2.displayLightStatus("l2")
    }
}