package tokyo.keyno63.jackinpoint.ui.parts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tokyo.keyno63.jackinpoint.databinding.ItemCardBinding

class CardAdapter(private val items: List<String>) :
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    private lateinit var binding: ItemCardBinding

    class CardViewHolder(val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.binding.textViewTitle.text = items[position]
    }

    override fun getItemCount() = items.size
}
