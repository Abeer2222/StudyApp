package com.example.studyapp

import androidx.recyclerview.widget.RecyclerView
import com.example.studyapp.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: SheetClickListener
) :
    RecyclerView.ViewHolder(cardCellBinding.root) {
    fun bindSheet(sheet: Sheet) {
        cardCellBinding.cover.setImageResource(sheet.cover)
        cardCellBinding.title.text = sheet.title
        //cardCellBinding.author.text=sheet.author

        cardCellBinding.cardView.setOnClickListener{
            clickListener.OnClick(sheet)
        }

    }
}
