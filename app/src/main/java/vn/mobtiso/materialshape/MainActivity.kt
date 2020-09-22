package vn.mobtiso.materialshape

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import com.google.android.material.shape.TriangleEdgeTreatment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)

      val shapePathModel = ShapeAppearanceModel.builder()
              .setAllCorners(CornerFamily.ROUNDED, 40.toFloat())
              .setBottomLeftCorner(CornerFamily.CUT,40.toFloat())
              .setAllEdges(TriangleEdgeTreatment(20.toFloat(), false))
              .setTopEdge(TriangleEdgeTreatment(20.toFloat(), false))
              .setBottomEdge(TriangleEdgeTreatment(20.toFloat(), true))
              .build()

      val backgroundDrawable = MaterialShapeDrawable(shapePathModel).apply {
         fillColor = ContextCompat.getColorStateList(this@MainActivity, R.color.colorPrimary) // change color
      }
      btLogin.background = backgroundDrawable
   }
}