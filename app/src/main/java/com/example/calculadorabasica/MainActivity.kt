package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var operacionesPantalla: EditText
    private lateinit var resultadosPantalla: TextView

    private lateinit var palabrasPantalla: String
    private var posicion = 0
    private var indicador = -1
    private lateinit var array: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Elementos de la vista
        operacionesPantalla = findViewById(R.id.operaciones_pantalla)
        resultadosPantalla = findViewById(R.id.resultados_pantalla)

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
        val botonPotencia = findViewById<Button>(R.id.potencia)
        val botonIgual = findViewById<Button>(R.id.igual)

        operacionesPantalla.showSoftInputOnFocus = false
        operacionesPantalla.requestFocus()

        val calculadora = Calculadora()

        botonUno.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("1", posicion, palabrasPantalla)
            array = calculadora.acciones("1", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonDos.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("2", posicion, palabrasPantalla)
            array = calculadora.acciones("2", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonTres.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("3", posicion, palabrasPantalla)
            array = calculadora.acciones("3", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonCuatro.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("4", posicion, palabrasPantalla)
            array = calculadora.acciones("4", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonCinco.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("5", posicion, palabrasPantalla)
            array = calculadora.acciones("5", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonSeis.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("6", posicion, palabrasPantalla)
            array = calculadora.acciones("6", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonSiete.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("7", posicion, palabrasPantalla)
            array = calculadora.acciones("7", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonOcho.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("8", posicion, palabrasPantalla)
            array = calculadora.acciones("8", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonNueve.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("9", posicion, palabrasPantalla)
            array = calculadora.acciones("9", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonCero.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("0", posicion, palabrasPantalla)
            array = calculadora.acciones("0", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonSumar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("+", posicion, palabrasPantalla)
            array = calculadora.acciones("+", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonRestar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("-", posicion, palabrasPantalla)
            array = calculadora.acciones("-", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonMultiplicar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("x", posicion, palabrasPantalla)
            array = calculadora.acciones("x", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonDividir.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("÷", posicion, palabrasPantalla)
            array = calculadora.acciones("÷", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonParentesis1.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("(", posicion, palabrasPantalla)
            array = calculadora.acciones("(", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonParentesis2.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton(")", posicion, palabrasPantalla)
            array = calculadora.acciones(")", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonPotencia.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("^", posicion, palabrasPantalla)
            array = calculadora.acciones("^", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonPunto.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton(".", posicion, palabrasPantalla)
            array = calculadora.acciones(".", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonIgual.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("=", posicion, palabrasPantalla)
            array = calculadora.acciones("=", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setSelection(array[1].toInt())
            resultadosPantalla.text = array[2]
        }

        botonBorrar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabrasPantalla = operacionesPantalla.text.toString()

            indicador = calculadora.boton("borrar", posicion, palabrasPantalla)
            array = calculadora.acciones("borrar", posicion, palabrasPantalla, indicador)

            operacionesPantalla.setText(array[0])
            operacionesPantalla.setSelection(array[1].toInt())
        }

        botonBorrar.setOnLongClickListener {
            operacionesPantalla.setText("")
            operacionesPantalla.setSelection(0)
            resultadosPantalla.text = ""
            return@setOnLongClickListener true
        }
    }
}