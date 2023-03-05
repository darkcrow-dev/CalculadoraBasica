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
        operacionesPantalla.requestFocus()

        botonUno.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "1" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonDos.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "2" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonTres.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "3" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonCuatro.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "4" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonCinco.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "5" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonSeis.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "6" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonSiete.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "7" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonOcho.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "8" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonNueve.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "9" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonCero.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "0" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonPunto.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "." + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonSumar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "+" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonRestar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "-" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonMultiplicar.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "x" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonDividir.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "÷" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonParentesis1.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "(" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonParentesis2.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + ")" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }

        botonPorcentaje.setOnClickListener {
            posicion = operacionesPantalla.selectionStart
            palabras = operacionesPantalla.text.toString()
            palabras = palabras.substring(0, posicion) + "%" + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
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
                if(posicion > 0){
                    palabras = palabras.substring(0, posicion -1) + palabras.substring(posicion, palabras.length)
                    operacionesPantalla.setText(palabras)
                    operacionesPantalla.setSelection(posicion - 1)
                }
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