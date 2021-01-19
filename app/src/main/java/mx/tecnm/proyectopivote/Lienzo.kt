package mx.tecnm.proyectopivote

import android.graphics.*
import android.media.MediaMetadataRetriever
import android.view.View

class Lienzo (p:MainActivity) : View(p) {

    var cx = 20f
    var cy = 100f
    var radio = 12f
    var fondoBlanco = true

    val sol : Bitmap = BitmapFactory.decodeResource(resources, R.drawable.sol)
    val luna : Bitmap = BitmapFactory.decodeResource(resources, R.drawable.luna)
    val nubeDia : Bitmap = BitmapFactory.decodeResource(resources, R.drawable.nube)
    val estrella : Bitmap = BitmapFactory.decodeResource(resources, R.drawable.estrella)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        var paint = Paint()

        //fondo
        if (fondoBlanco){

            canvas.drawColor(Color.BLUE)
            canvas.drawBitmap(sol, 80f, 40f, paint)

            canvas.drawBitmap(nubeDia,cx,cy,paint)
            canvas.drawBitmap(nubeDia,cx+160, cy+30, paint)
            canvas.drawBitmap(nubeDia,cx+250, cy-100, paint)

        }else{

            canvas.drawColor(Color.BLACK)
            canvas.drawBitmap(luna,80f,40f,paint)

            canvas.drawBitmap(estrella,cx+20,cy+40,paint)
            canvas.drawBitmap(estrella,cx+150,cy+80,paint)
            canvas.drawBitmap(estrella,cx+220,cy+120,paint)

        }//if-else

    }//onDraw

}//class