package com.example.drawerlayout.Fragments

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.drawerlayout.R

class NotasFrequenciaFragment: Fragment() {

    private lateinit var trNovo: TableRow
    private lateinit var txTurma: TextView
    private lateinit var txCodigo: TextView
    private lateinit var txAv1: TextView
    private lateinit var txAv2: TextView
    private lateinit var txMedia: TextView
    private lateinit var txAvf: TextView
    private lateinit var txMf: TextView
    private lateinit var txFreq: TextView
    private lateinit var txSituacao: TextView
    private lateinit var tabela: TableLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.notas_frequencia_fragment,container,false)


        alimentaTabela(view)



        return view
    }

    private fun alimentaTabela(view: View) {
        for ( i in 1..2) {


            trNovo = TableRow(view.context)
            txTurma = TextView(view.context)
            txCodigo = TextView(view.context)
            txAv1 = TextView(view.context)
            txAv2 = TextView(view.context)
            txMedia = TextView(view.context)
            txAvf = TextView(view.context)
            txMf = TextView(view.context)
            txFreq = TextView(view.context)
            txSituacao = TextView(view.context)
            tabela = view.findViewById(R.id.tabelaNotas)

            //adiciona cada item na coluna
            txTurma.text = "ODO20211"
            txTurma.setTextColor(Color.BLACK)
            txTurma.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            txTurma.gravity = Gravity.CENTER
            txTurma.width = 30
            //adiciona item na linha
            trNovo.addView(txTurma)

            txCodigo.text = "OD2701 - Clinica 1"
            txCodigo.setTextColor(Color.BLACK)
            txCodigo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            txCodigo.gravity = Gravity.CENTER
            txCodigo.width = 30
            trNovo.addView(txCodigo)


            txAv1.text = "7"
            txAv1.setTextColor(Color.BLACK)
            txAv1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            txAv1.gravity = Gravity.CENTER
            trNovo.addView(txAv1)


            txAv2.text = "7"
            txAv2.setTextColor(Color.BLACK)
            txAv2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            txAv2.gravity = Gravity.CENTER
            trNovo.addView(txAv2)


            txMedia.text = "7"
            txMedia.setTextColor(Color.BLACK)
            txMedia.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            txMedia.gravity = Gravity.CENTER
            trNovo.addView(txMedia)


            txAvf.text = ""
            txAvf.setTextColor(Color.BLACK)
            txAvf.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            txAvf.gravity = Gravity.CENTER
            trNovo.addView(txAvf)


            txMf.text = "7"
            txMf.setTextColor(Color.BLACK)
            txMf.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            txMf.gravity = Gravity.CENTER
            trNovo.addView(txMf)


            txFreq.text = "80%"
            txFreq.setTextColor(Color.BLACK)
            txFreq.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            txFreq.gravity = Gravity.CENTER
            trNovo.addView(txFreq)


            txSituacao.text = "MAT"
            txSituacao.setTextColor(Color.BLACK)
            txSituacao.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
            txSituacao.gravity = Gravity.CENTER
            trNovo.addView(txSituacao)

            tabela.addView(trNovo)
        }
    }

}