# Anko vs. XML
A collection of Android layouts in both XML and Anko. 
As there is very little Anko documentation, I have found it is often easiest to search for a solution in XML and translate that to Anko... 
Collecting things here to be able to find them back later and skip the XML step.

+ Layout
  + `TableLayout`
+ View element
  + `Switch`
  + `Spinner`

# Kotlin and Anko
A collection of other Kotlin and Anko things.

## UI
  + **Menu** The menu and menu items need to be created using *XML*.
  Then use Kotlin to inflate the menu and set the `onClickListener`.

## Little Anko things that make life a bit easier
+ Starting an Activity: `startActivity<MainActivity>()`.
+ Creating a Toast: `toast("text")`.
