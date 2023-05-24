package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var operacionesPantalla: EditText
    private lateinit var resultadosPantalla: TextView

    private lateinit var palabras: String
    private var posicion = 0
    private var resultado = 0.0

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

        botonUno.setOnClickListener {
            boton("1")
        }

        botonDos.setOnClickListener {
            boton("2")
        }

        botonTres.setOnClickListener {
            boton("3")
        }

        botonCuatro.setOnClickListener {
            boton("4")
        }

        botonCinco.setOnClickListener {
            boton("5")
        }

        botonSeis.setOnClickListener {
            boton("6")
        }

        botonSiete.setOnClickListener {
            boton("7")
        }

        botonOcho.setOnClickListener {
            boton("8")
        }

        botonNueve.setOnClickListener {
            boton("9")
        }

        botonCero.setOnClickListener {
            boton("0")
        }

        botonSumar.setOnClickListener {
            boton("+")
        }

        botonRestar.setOnClickListener {
            boton("-")
        }

        botonMultiplicar.setOnClickListener {
            boton("x")
        }

        botonDividir.setOnClickListener {
            boton("÷")
        }

        botonParentesis1.setOnClickListener {
            boton("(")
        }

        botonParentesis2.setOnClickListener {
            boton(")")
        }

        botonPotencia.setOnClickListener {
            boton("^")
        }

        botonPunto.setOnClickListener {
            boton(".")
        }

        botonIgual.setOnClickListener {
            boton("=")
        }

        botonBorrar.setOnClickListener {
            boton("borrar")
        }

        botonBorrar.setOnLongClickListener {
            operacionesPantalla.setText("")
            resultadosPantalla.text = ""
            operacionesPantalla.setSelection(0)
            true
        }
    }

    private fun boton(string: String){
        posicion = operacionesPantalla.selectionStart
        palabras = operacionesPantalla.text.toString()

        if(string == "+"){
            if(palabras[posicion-1].toString() != string){
                palabras = palabras.substring(0, posicion) + string + palabras.substring(posicion, palabras.length)
                operacionesPantalla.setText(palabras)
                operacionesPantalla.setSelection(posicion + 1)
            }
        }
        else if(string == "-"){
            if(palabras[posicion-1].toString() != string){
                palabras = palabras.substring(0, posicion) + string + palabras.substring(posicion, palabras.length)
                operacionesPantalla.setText(palabras)
                operacionesPantalla.setSelection(posicion + 1)
            }
        }
        else if(string == "x"){
            if(palabras[posicion-1].toString() != string){
                palabras = palabras.substring(0, posicion) + string + palabras.substring(posicion, palabras.length)
                operacionesPantalla.setText(palabras)
                operacionesPantalla.setSelection(posicion + 1)
            }
        }
        else if(string == "÷"){
            if(palabras[posicion-1].toString() != string){
                palabras = palabras.substring(0, posicion) + string + palabras.substring(posicion, palabras.length)
                operacionesPantalla.setText(palabras)
                operacionesPantalla.setSelection(posicion + 1)
            }
        }
        else if(string == "^"){
            if(palabras[posicion-1].toString() != string){
                palabras = palabras.substring(0, posicion) + string + palabras.substring(posicion, palabras.length)
                operacionesPantalla.setText(palabras)
                operacionesPantalla.setSelection(posicion + 1)
            }
        }
        else if(string == "="){
            palabras = palabras.replace("÷", "/")
            palabras = palabras.replace("x", "*")

            val expression = ExpressionBuilder(palabras).build()
            val textoErrores: String

            try{
                resultado = expression.evaluate()
                resultadosPantalla.text = resultado.toString()
            } catch (e: ArithmeticException) {
                textoErrores = "No se puede dividir entre 0"
                resultadosPantalla.text = textoErrores
            } catch (e: IllegalArgumentException) {
                textoErrores = ""
                resultadosPantalla.text = textoErrores
            }

            operacionesPantalla.setSelection(posicion)
        }
        else if(string == "borrar"){
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
        else{
            palabras = palabras.substring(0, posicion) + string + palabras.substring(posicion, palabras.length)
            operacionesPantalla.setText(palabras)
            operacionesPantalla.setSelection(posicion + 1)
        }
    }
}