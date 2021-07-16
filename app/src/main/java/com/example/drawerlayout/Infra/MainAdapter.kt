package com.example.drawerlayout.Infra

import android.graphics.Color
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import android.widget.Toast

class MainAdapter(grupos: MutableList<String>, filhos: HashMap<String, List<String>>) : BaseExpandableListAdapter() {

    var listaGrupo = grupos
    var listaFilhos = filhos



    override fun getGroupCount(): Int {
        //retorna o numero de grupos
        return listaGrupo.size
    }


    override fun getChildrenCount(groupPosition: Int): Int {
        //retorna o numero de filhos
        return listaFilhos.get(listaGrupo.get(groupPosition))!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return listaGrupo.get(groupPosition)
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return listaFilhos.get(listaGrupo.get(groupPosition))!!.get(childPosition)
    }

    override fun getGroupId(groupPosition: Int): Long {
        return 0
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return 0
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    //pega o layout de grupo
    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        //inicializa a view
        var view = LayoutInflater.from(parent!!.context).inflate(android.R.layout.simple_expandable_list_item_1, parent , false)
        //inicializa a variavel e associa o id
        var textView: TextView = view.findViewById(android.R.id.text1)
        //inicializa String
        var sGroup: String = getGroup(groupPosition).toString()
        //seta o nome do grupo no textViewCriado
        textView.text = sGroup
        //seta o estilo do texto
        textView.setTypeface(null, Typeface.BOLD)
        //cor
        textView.setTextColor(Color.BLACK)
        return view
    }

    // mesmo processo do getGroupView
    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(parent!!.context).inflate(android.R.layout.simple_selectable_list_item, parent , false)
        var textView: TextView = view.findViewById(android.R.id.text1)
        var sChild: String = getChild(groupPosition, childPosition).toString()
        textView.text = sChild


        textView.setOnClickListener {
                Toast.makeText(parent.context, sChild , Toast.LENGTH_SHORT).show()
        }
        return view
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return false
    }

}
