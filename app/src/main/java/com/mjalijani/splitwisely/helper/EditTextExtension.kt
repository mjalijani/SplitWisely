package com.mjalijani.splitwisely.helper

import android.text.Editable
import android.text.InputFilter
import android.text.InputFilter.LengthFilter
import android.text.TextWatcher
import android.widget.EditText


fun EditText.textChanges(
    onTextChangedCallback: (() -> Unit)? = null,
    afterTextChangedCallback: (String) -> Unit
) {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            afterTextChangedCallback(p0?.toString() ?: "")
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            onTextChangedCallback?.invoke()
        }
    })
}

fun EditText.setMaxLength(length: Int) {
    this.filters = arrayOf<InputFilter>(LengthFilter(length))
}

fun EditText.placeCursorToEnd() {
    this.setSelection(this.text.length)
}
