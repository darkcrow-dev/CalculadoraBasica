package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var operacionesPantalla = findViewById<EditText>(R.id.operaciones_pantalla)
        var resultadosPantalla = findViewById<TextView>(R.id.resultados_pantalla)

        var botonBorrar = findViewById<Button>(R.id.borrar)
        var botonParentesis1 = findViewById<Button>(R.id.parentesis1)
        var botonParentesis2 = findViewById<Button>(R.id.parentesis2)
        var botonDividir = findViewById<Button>(R.id.dividir)

        var botonSiete = findViewById<Button>(R.id.siete)
        var botonOcho = findViewById<Button>(R.id.ocho)
        var botonNueve = findViewById<Button>(R.id.nueve)
        var botonMultiplicar = findViewById<Button>(R.id.multiplicar)

        var botonCuatro = findViewById<Button>(R.id.cuatro)
        var botonCinco = findViewById<Button>(R.id.cinco)
        var botonSeis = findViewById<Button>(R.id.seis)
        var botonRestar = findViewById<Button>(R.id.restar)

        var botonUno = findViewById<Button>(R.id.uno)
        var botonDos = findViewById<Button>(R.id.dos)
        var botonTres = findViewById<Button>(R.id.tres)
        var botonSumar = findViewById<Button>(R.id.sumar)

        var botonCero = findViewById<Button>(R.id.cero)
        var botonPunto = findViewById<Button>(R.id.punto)
        var botonPorcentaje = findViewById<Button>(R.id.porcentaje)
        var botonIgual = findViewById<Button>(R.id.igual)

        var palabras = ""

        operacionesPantalla.showSoftInputOnFocus = false

        botonUno.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "1"
            operacionesPantalla.setText(palabras)
        }

        botonDos.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "2"
            operacionesPantalla.setText(palabras)
        }

        botonTres.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "3"
            operacionesPantalla.setText(palabras)
        }

        botonCuatro.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "4"
            operacionesPantalla.setText(palabras)
        }

        botonCinco.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "5"
            operacionesPantalla.setText(palabras)
        }

        botonSeis.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "6"
            operacionesPantalla.setText(palabras)
        }

        botonSiete.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "7"
            operacionesPantalla.setText(palabras)
        }

        botonOcho.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "8"
            operacionesPantalla.setText(palabras)
        }

        botonNueve.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "9"
            operacionesPantalla.setText(palabras)
        }

        botonCero.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "0"
            operacionesPantalla.setText(palabras)
        }

        botonPunto.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "."
            operacionesPantalla.setText(palabras)
        }

        botonSumar.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "+"
            operacionesPantalla.setText(palabras)
        }

        botonRestar.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "-"
            operacionesPantalla.setText(palabras)
        }

        botonMultiplicar.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "x"
            operacionesPantalla.setText(palabras)
        }

        botonDividir.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "÷"
            operacionesPantalla.setText(palabras)
        }

        botonParentesis1.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "("
            operacionesPantalla.setText(palabras)
        }

        botonParentesis2.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + ")"
            operacionesPantalla.setText(palabras)
        }

        botonPorcentaje.setOnClickListener {
            palabras = operacionesPantalla.text.toString() + "%"
            operacionesPantalla.setText(palabras)
        }

        botonIgual.setOnClickListener {
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.replace("÷", "/")
            palabras = palabras.replace("x", "*")

            var expression = ExpressionBuilder(palabras).build()

            var resultado = expression.evaluate()

            val longResultado = resultado.toLong()

            if (resultado == longResultado.toDouble()) {
                resultadosPantalla.text = longResultado.toString()
            } else {
                resultadosPantalla.text = resultado.toString()
            }
        }

        botonBorrar.setOnClickListener {
            palabras = operacionesPantalla.text.toString()

            if(palabras.isNotEmpty()){
                palabras = palabras.substring(0, palabras.length - 1)
            }

            operacionesPantalla.setText(palabras)
        }

        botonBorrar.setOnLongClickListener {
            operacionesPantalla.setText("")
            resultadosPantalla.text = ""
            true
        }
    }
}