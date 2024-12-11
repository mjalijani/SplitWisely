package com.mjalijani.splitwisely.helper

import android.app.Activity
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

data class PickedContact(val number: String, val name: String?)

class ContactPicker constructor(private val requestCode: Int = 23) : Fragment() {

    private lateinit var onContactPicked: (PickedContact) -> Unit
    private lateinit var onFailure: (Throwable) -> Unit

    companion object {

        private const val TAG = "ContactPicker"

        fun create(
            activity: FragmentActivity,
            onContactPicked: (PickedContact) -> Unit,
            onFailure: (Throwable) -> Unit
        ): ContactPicker? {

            return try {
                val picker = ContactPicker()
                picker.apply {
                    this.onContactPicked = onContactPicked
                    this.onFailure = onFailure
                }

                activity.supportFragmentManager.beginTransaction()
                    .add(picker, TAG)
                    .commitNowAllowingStateLoss()

                picker
            } catch (e: Exception) {
                onFailure(e)
                null
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return null
    }

    fun pick() {
        try {
            Intent().apply {
                data = ContactsContract.CommonDataKinds.Phone.CONTENT_URI
                action = Intent.ACTION_PICK
                startActivityForResult(this, requestCode)
            }
        } catch (e: Exception) {
            onFailure(e)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                this.requestCode -> {
                    var cursor: Cursor? = null
                    try {
                        cursor = data?.data.let { uri ->
                            uri as Uri
                            activity?.contentResolver?.query(uri, null, null, null, null)
                        }
                        cursor?.let {
                            it.moveToFirst()
                            val phoneNumber =
                                it.getString(it.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))
                            val name =
                                it.getString(it.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME))
                            it.close()
                            onContactPicked(PickedContact(phoneNumber, name))
                        }

                    } catch (e: Exception) {
                        onFailure(e)
                        cursor?.close()
                    }
                }
            }
        }
    }
}

fun Activity.showContactPicker(
    onContactPicked: (PickedContact) -> Unit,
    onFailure: (Throwable) -> Unit
) {
    ContactPicker.create(
        activity = this as FragmentActivity,
        onContactPicked = {
            onContactPicked.invoke(it)
        },
        onFailure = {
            onFailure.invoke(it)
        })?.pick()
}