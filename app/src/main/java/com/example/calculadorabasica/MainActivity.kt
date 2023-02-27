package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val operacionesPantalla = findViewById<EditText>(R.id.operaciones_pantalla)
        val resultadosPantalla = findViewById<TextView>(R.id.resultados_pantalla)

        val botonBorrar = findViewById<Button>(R.id.borrar)
        val botonParentesis1 = findViewById<Button>(R.id.parentesis1)
        val botonParentesis2 = findViewById<Button>(R.id.parentesis2)
        val botonDividir = findViewById<Button>(R.id.dividir)

        val botonSiete = findViewById<Button>(R.id.siete)
        val botonOcho = findViewById<Button>(R.id.ocho)
        val botonNueve = findViewById<Button>(R.id.nueve)
        val botonMultiplicar = findViewById<Button>(R.id.multiplicar)

        val botonCuatro = findViewById<Button>(R.id.cuatro)
        val botonCinco = findViewById<Button>(R.id.cinco)
        val botonSeis = findViewById<Button>(R.id.seis)
        val botonRestar = findViewById<Button>(R.id.restar)

        val botonUno = findViewById<Button>(R.id.uno)
        val botonDos = findViewById<Button>(R.id.dos)
        val botonTres = findViewById<Button>(R.id.tres)
        val botonSumar = findViewById<Button>(R.id.sumar)

        val botonCero = findViewById<Button>(R.id.cero)
        val botonPunto = findViewById<Button>(R.id.punto)
        val botonPorcentaje = findViewById<Button>(R.id.porcentaje)
        val botonIgual = findViewById<Button>(R.id.igual)

        var palabras: String
        var posicion: Int
        var resultado: Double

        operacionesPantalla.showSoftInputOnFocus = false

        botonUno.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "1"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonDos.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "2"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonTres.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "3"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonCuatro.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "4"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonCinco.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "5"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonSeis.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "6"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonSiete.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "7"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonOcho.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "8"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonNueve.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "9"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonCero.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "0"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonPunto.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "."
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonSumar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "+"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonRestar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "-"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonMultiplicar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "x"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonDividir.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "÷"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonParentesis1.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "("
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonParentesis2.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + ")"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonPorcentaje.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString() + "%"
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion)
        }

        botonIgual.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.replace("÷", "/")
            palabras = palabras.replace("x", "*")

            val expression = ExpressionBuilder(palabras).build()

            resultado = expression.evaluate()

            val longResultado = resultado.toLong()

            if (resultado == longResultado.toDouble()) {
                resultadosPantalla.text = longResultado.toString()
            } else {
                resultadosPantalla.text = resultado.toString()
            }

            operacionesPantalla.setSelection(posicion)
        }

        botonBorrar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()

            if(palabras.isNotEmpty()){
                palabras = palabras.substring(0, palabras.length - 1)
                operacionesPantalla.setText(palabras)
                operacionesPantalla.setSelection(posicion - 1)
            }
            else{
                operacionesPantalla.setText(palabras)
                operacionesPantalla.setSelection(posicion)
            }
        }

        botonBorrar.setOnLongClickListener {
            operacionesPantalla.setText("")
            resultadosPantalla.text = ""
            operacionesPantalla.setSelection(0)
            true
        }
    }
}