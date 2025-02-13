package tokyo.keyno63.jackinpoint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import tokyo.keyno63.jackinpoint.databinding.ActivityCardListBinding
import tokyo.keyno63.jackinpoint.ui.parts.CardAdapter

class ProductListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCardListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // サンプルデータ
        val items = List(20) { "Card ${it + 1}" }

        // RecyclerView の設定
        binding.recyclerView.layoutManager = GridLayoutManager(this, 2) // 2列表示
        binding.recyclerView.adapter = CardAdapter(items)
    }
}
