package com.example.drawerlayout

import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter

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
        TODO("Not yet implemented")
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        TODO("Not yet implemented")
    }

    override fun hasStableIds(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        TODO("Not yet implemented")
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        TODO("Not yet implemented")
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        TODO("Not yet implemented")
    }

}
