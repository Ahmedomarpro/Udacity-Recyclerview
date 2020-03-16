package com.ao.udacityrecyclerview.test
/*


fun EditText.text(): String = this.text.toString()

fun View.visible(){
    this.visibility = View.VISIBLE
}

fun View.gone(){
    this.visibility = View.GONE
}

fun AppCompatActivity.toast(message: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

fun Fragment.toast(message: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this.context, message, duration).show()
}

fun TextView.setHtmlText(text: String?) {
    if (text != null) {
        this.text = HtmlCompat.fromHtml(text, HtmlCompat.FROM_HTML_MODE_LEGACY)
        this.movementMethod = LinkMovementMethod.getInstance()
    }
}
fun ImageView.loadUrl(url: String) {
    Picasso.get().load(url).into(this)
}

fun ImageView.loadRoundedUrl(url: String) {
    val radius = 50
    val transformation = RoundedCornersTransformation(radius, 0)

    Picasso.get().load(url).transform(transformation).into(this)
}

fun ImageView.loadCircleUrl(url: String, drawable: Int? = null) {
    if (!url.isEmpty()) {
        Picasso.get().load(url).transform(CropCircleTransformation()).into(this)

    } else if (drawable != null) {
        Picasso.get().load(drawable).error(drawable).into(this)
    }
}

fun AppCompatActivity.snackBar(message: String, onClickListener: View.OnClickListener? = null, stringAction: String? = null, length: Int = Snackbar.LENGTH_LONG) {
    //val snack = Snackbar.make(parentLayout, message, Snackbar.LENGTH_LONG)
    val snack = Snackbar.make(findViewById(android.R.id.content),  HtmlCompat.fromHtml(message, HtmlCompat.FROM_HTML_MODE_LEGACY), length)

    // Custom Snackbar
    val layout = snack.view as Snackbar.SnackbarLayout

    // Background
    layout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent))

    // TextColor
    // val textView = layout.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
    // textView.setTextColor(ContextCompat.getColor(this, R.color.white))

    // Action
    //if (stringAction != null) {
    //    snack.setAction(stringAction, onClickListener)
    //    snack.setActionTextColor(ContextCompat.getColor(this, R.color.gray))
    //}
    snack.show()
}

interface SnackbarTopListener {
    fun onSnackbarAnimationFinish()
}*/
