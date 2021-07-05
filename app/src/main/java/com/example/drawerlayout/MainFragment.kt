package com.example.drawerlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

//fragmento é uma parte de um layout q eu posso carregar dentro de uma activity
class MainFragment : Fragment() {


    //dando override no oncreate para dizer qual layout de fragmento abrir
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.mainfragment, container, false)

        val btnInfoAca: Button = view.findViewById(R.id.btnInfoAcademico)
        val btnNotas: Button = view.findViewById(R.id.btnNotas)
        val btnCalendario: Button = view.findViewById(R.id.btnCalendario)
        val btnRematricula: Button = view.findViewById(R.id.btnRematricula)


        //eventos de botoes
        btnInfoAca.setOnClickListener {
            eventoInfo()
        }
        btnCalendario.setOnClickListener {
            eventoCalendario()
            //TODO tela calendario
        }
        btnNotas.setOnClickListener {
            eventoNota()
        }
        btnRematricula.setOnClickListener {
            eventoRematricula()
            //TODO tela rematricula
        }



        return view
    }

    //funçao para novo fragmento
    fun eventoInfo() {
        val tx = fragmentManager?.beginTransaction()
        if (tx != null) {
            tx.replace(R.id.container_fragment, InformacoesAcaFragment())
        }
        if (tx != null) {
            tx.commit()
        }

    }

    fun eventoCalendario() {
        val tx = fragmentManager?.beginTransaction()
        if (tx != null) {
            tx.replace(R.id.container_fragment, InformacoesAcaFragment())
        }
        if (tx != null) {
            tx.commit()
        }
    }

    fun eventoNota() {
        val tx = fragmentManager?.beginTransaction()
        if (tx != null) {
            tx.replace(R.id.container_fragment, NotasFrequenciaFragment())
        }
        if (tx != null) {
            tx.commit()
        }
    }

    fun eventoRematricula() {
        val tx = fragmentManager?.beginTransaction()
        if (tx != null) {
            tx.replace(R.id.container_fragment, InformacoesAcaFragment())
        }
        if (tx != null) {
            tx.commit()
        }
    }


}