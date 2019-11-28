package com.quickbirdstudios.surveykit.backend.views.question_parts

import android.content.Context
import android.text.InputType
import android.view.View
import androidx.annotation.StringRes

internal class IntegerTextFieldPart(context: Context) : TextFieldPart(context) {

    init {
        this.field.inputType = InputType.TYPE_CLASS_NUMBER
        this.textAlignment = View.TEXT_ALIGNMENT_CENTER
    }

    companion object {
        fun withHint(context: Context, @StringRes hint: Int) = IntegerTextFieldPart(
            context
        ).apply {
            field.hint = context.getString(hint)
        }
    }
}