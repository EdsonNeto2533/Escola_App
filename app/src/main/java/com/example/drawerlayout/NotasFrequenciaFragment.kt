package com.example.drawerlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableRow
import android.widget.TextView
import androidx.fragment.app.Fragment

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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.notas_frequencia_fragment,container,false)

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

        alimentaTabela()




        return view
    }

    private fun alimentaTabela() {
        TODO("ainda nao implementado")
        /*
        TableRow tbrow = new TableRow(this);
TextView txt_plazo = new TextView(this);
txt_plazo.setText(" Plazo ");
txt_plazo.setTextColor(Color.WHITE);
txt_plazo.setTextSize(16);
txt_plazo.setMinimumHeight(0);
txt_plazo.setBackgroundColor(Color.DKGRAY);
txt_plazo.setGravity(Gravity.CENTER);
tbrow.addView(txt_plazo);

TextView txt_saldoInicial = new TextView(this);
txt_saldoInicial.setText(" Saldo Inicial");
txt_saldoInicial.setTextColor(Color.WHITE);
txt_saldoInicial.setTextSize(16);
txt_saldoInicial.setBackgroundColor(Color.DKGRAY);
txt_saldoInicial.setGravity(Gravity.CENTER);
tbrow.addView(txt_saldoInicial);

TextView txt_parcialidades = new TextView(this);
txt_parcialidades.setText(" Parcialidades ");
txt_parcialidades.setTextColor(Color.WHITE);
txt_parcialidades.setTextSize(16);
txt_parcialidades.setBackgroundColor(Color.DKGRAY);
txt_parcialidades.setGravity(Gravity.CENTER);
tbrow.addView(txt_parcialidades);

TextView txt_interes = new TextView(this);
txt_interes.setText(" Interés ");
txt_interes.setTextSize(16);
txt_interes.setBackgroundColor(Color.DKGRAY);
txt_interes.setGravity(Gravity.CENTER);
txt_interes.setTextColor(Color.WHITE);
tbrow.addView(txt_interes);

TextView txt_total = new TextView(this);
txt_total.setText(" Abono Capital");
txt_total.setTextSize(16);
txt_total.setBackgroundColor(Color.DKGRAY);
txt_total.setGravity(Gravity.CENTER);
txt_total.setTextColor(Color.WHITE);
tbrow.addView(txt_total);

table.addView(tbrow);
Etc ...
         */
    }

}