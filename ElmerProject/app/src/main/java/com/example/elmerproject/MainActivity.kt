package com.example.elmerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.reflect.Array.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
        multiplicar()
        hola()
        tirarDado()

    }
    fun main (){
        operario(nombre = "Elmer",pago = 8,hora = 7,horasextra = 2)
    }
     fun operario(nombre:String,pago:Int,hora:Int,horasextra:Int){
        var suma=hora*pago+pago*horasextra
        println("El nombre del operario es: $nombre. Y el pago que recibe por hora es de: $" +
                "$pago y la cantidad de horas trabajadas son de: $hora y las horas extras" +
                "trabajadas son de: $horasextra y el total del pago seria de:$$suma")
    }
    fun multiplicar(valor:Int=5){
        for (i in 1..10){
            var total=valor*i
            println("La multiplicacion de: $valor por $i es $total")
        }
    }

    fun hola(){
        val ElmerOP=Empleado("Elmer",600,"Creatividad","Gerente",
            10)
        println("Nombre: "+ElmerOP.nombre)
        ElmerOP.comprobarSueldo()
        ElmerOP.comprobarAreaCargo()
        println("Años de trabajo: "+ElmerOP.tiempoTrabajo+" años")
    }
    fun tirarDado(){
        val Dadito=Dado(7)
        Dadito.comprobarDado()
        Dadito.GenNum()
    }

}