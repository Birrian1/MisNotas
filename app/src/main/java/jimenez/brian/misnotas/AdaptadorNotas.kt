package jimenez.brian.misnotas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class AdaptadorNotas: BaseAdapter {
    var context: Context
    var notas = ArrayList<Nota>()

    constructor(context: Context, notas: ArrayList<Nota>) : super() {
        this.context = context
        this.notas = notas
    }


    override fun getCount(): Int {
        return notas.size
    }

    override fun getItem(p0: Int): Any {
        return notas[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var inflador = LayoutInflater.from(context)
        var vista = inflador.inflate(R.layout.nota_layout, null)
        var nota =  notas[p0]


        var titulo: TextView = vista.findViewById(R.id.tv_titulo_det)
        var contenido: TextView = vista.findViewById(R.id.tv_contenido_det)


        titulo.text = nota.titulo
        contenido.text = nota.contenido

        return vista


    }
}