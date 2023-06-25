package com.example.calculadorabasica

import net.objecthunter.exp4j.ExpressionBuilder

class Calculadora {
    private var indicador = 0
    private lateinit var array: Array<String>

    fun boton(simbolo: String, posicionPantalla: Int, palabrasPantalla: String): Int{

        when(simbolo){
            "+" -> {
                if (palabrasPantalla.isNotEmpty()) {
                    if (posicionPantalla > 0) {
                        if (palabrasPantalla[posicionPantalla - 1].toString() != simbolo && (palabrasPantalla[posicionPantalla - 1].isDigit() || palabrasPantalla[posicionPantalla - 1].toString() == ")")) {
                            indicador = 2
                        } else if (palabrasPantalla[posicionPantalla - 1].toString() == "-" || palabrasPantalla[posicionPantalla - 1].toString() == "x" || palabrasPantalla[posicionPantalla - 1].toString() == "÷" || palabrasPantalla[posicionPantalla - 1].toString() == "^") {
                            indicador = 1
                        }
                    }
                } else {
                    indicador = -1
                }
            }
            "-" -> {
                if (posicionPantalla > 0) {
                    if (palabrasPantalla[posicionPantalla - 1].toString() != simbolo && (palabrasPantalla[posicionPantalla - 1].isDigit() || palabrasPantalla[posicionPantalla - 1].toString() == ")")) {
                        indicador = 2
                    } else if (palabrasPantalla[posicionPantalla - 1].toString() == "+" || palabrasPantalla[posicionPantalla - 1].toString() == "x" || palabrasPantalla[posicionPantalla - 1].toString() == "÷" || palabrasPantalla[posicionPantalla - 1].toString() == "^") {
                        indicador = 1
                    }
                } else {
                    indicador = 2
                }
            }
            "x" -> {
                if (palabrasPantalla.isNotEmpty()) {
                    if (posicionPantalla > 0) {
                        if (palabrasPantalla[posicionPantalla - 1].toString() != simbolo && (palabrasPantalla[posicionPantalla - 1].isDigit() || palabrasPantalla[posicionPantalla - 1].toString() == ")")) {
                            indicador = 2
                        } else if (palabrasPantalla[posicionPantalla - 1].toString() == "+" || palabrasPantalla[posicionPantalla - 1].toString() == "-" || palabrasPantalla[posicionPantalla - 1].toString() == "÷" || palabrasPantalla[posicionPantalla - 1].toString() == "^") {
                            indicador = 1
                        }
                    }
                } else {
                    indicador = -1
                }
            }
            "÷" -> {
                if (palabrasPantalla.isNotEmpty()) {
                    if (posicionPantalla > 0) {
                        if (palabrasPantalla[posicionPantalla - 1].toString() != simbolo && (palabrasPantalla[posicionPantalla - 1].isDigit() || palabrasPantalla[posicionPantalla - 1].toString() == ")")) {
                            indicador = 2
                        } else if (palabrasPantalla[posicionPantalla - 1].toString() == "+" || palabrasPantalla[posicionPantalla - 1].toString() == "-" || palabrasPantalla[posicionPantalla - 1].toString() == "x" || palabrasPantalla[posicionPantalla - 1].toString() == "^") {
                            indicador = 1
                        }
                    }
                } else {
                    indicador = -1
                }
            }
            "^" -> {
                if (palabrasPantalla.isNotEmpty()) {
                    if (posicionPantalla > 0) {
                        if (palabrasPantalla[posicionPantalla - 1].toString() != simbolo && (palabrasPantalla[posicionPantalla - 1].isDigit() || palabrasPantalla[posicionPantalla - 1].toString() == ")")) {
                            indicador = 2
                        } else if (palabrasPantalla[posicionPantalla - 1].toString() == "+" || palabrasPantalla[posicionPantalla - 1].toString() == "-" || palabrasPantalla[posicionPantalla - 1].toString() == "x" || palabrasPantalla[posicionPantalla - 1].toString() == "÷") {
                            indicador = 1
                        }
                    }
                } else {
                    indicador = -1
                }
            }
            "=" -> {
                indicador = 3
            }
            "borrar" -> {
                if (palabrasPantalla.isNotEmpty()) {
                    if (posicionPantalla > 0) {
                        indicador = 0
                    }
                } else {
                    indicador = -1
                }
            }
            else -> {
                indicador = 2
            }
        }

        return indicador
    }

    fun acciones(simbolo: String, posicionPantalla: Int, palabrasPantalla: String, indicador: Int): Array<String>{
        val palabras: String

        when (indicador) {
            3 -> {
                palabrasPantalla.replace("÷", "/")
                palabrasPantalla.replace("x", "*")

                val expression = ExpressionBuilder(palabrasPantalla).build()
                val textoErrores: String
                val resultado: Double

                try{
                    resultado = expression.evaluate()
                    array = arrayOf("", posicionPantalla.toString(), resultado.toString())
                } catch (e: ArithmeticException) {
                    textoErrores = "No se puede dividir entre 0"
                    array = arrayOf("", posicionPantalla.toString(), textoErrores)
                } catch (e: IllegalArgumentException) {
                    textoErrores = ""
                    array = arrayOf("", posicionPantalla.toString(), textoErrores)
                }
            }
            2 -> {
                palabras = palabrasPantalla.substring(0, posicionPantalla) + simbolo + palabrasPantalla.substring(posicionPantalla, palabrasPantalla.length)
                array = arrayOf(palabras, (posicionPantalla + 1).toString(), "")
            }
            1 -> {
                palabras = palabrasPantalla.substring(0, posicionPantalla - 1) + simbolo + palabrasPantalla.substring(posicionPantalla, palabrasPantalla.length)
                array = arrayOf(palabras, (posicionPantalla).toString(), "")
            }
            0 -> {
                palabras = palabrasPantalla.substring(0, posicionPantalla - 1) + palabrasPantalla.substring(posicionPantalla, palabrasPantalla.length)
                array = arrayOf(palabras, (posicionPantalla - 1).toString(), "")
            }
            else -> {
                array = arrayOf(palabrasPantalla, posicionPantalla.toString(), "")
            }
        }

        return array
    }
}