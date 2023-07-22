# Questions
// Data Class value saxlamaq, tutmaq üçün istifadə olunan classdir. Data Class APİ lerden melumat çəkərkən, həmin məlumatları emal edərkən məlumatları saxlamaq üçün istifadə olunur. Adi classdan fərqlidir. Classin Data Class olması üçün
1. Istifade olunan paramterler var ve ya val ile declare olunur. Abstract, open, selaed ola bilmez. Primary Constructorun icinde minimum 1 parametr olmalidir. Data classlar butun model filellari ilk novbede ise API model filellari ucun cox vacibdir. Data Classda getter(), setter(), hashCode(), toString() methodlarini yazmaga ehtiyac yoxdur.  data class Student{
   val name: String, val surname: String, val age:Int, val city:String} bunlara default valuelar da assign oluna biler.  data class Student{
   val name: String= "Rubabe", val surname: String = "Hajiyeva", val age:Int = 21, val city:String = "Baku"}*/

//What is difference between var and val?
//var is mutable, val is immutable.
//8. What is variable declaration with ? mark
//- ? Variablein nullable oldugunu gosterir. O variablein her hansi typein (Int, String ve s.) valuesunu saxlaya bildiyini ve null ola bildiyini gosterir.
/*var nullableInt: Int? = 15
nullableInt = null // Valid assignment because the variable is nullable

// Using a nullable Int variable requires null-checking to avoid NullPointerException
if (nullableInt != null) {
    println(nullableInt)
} else {
    println("The variable is null.")
}
*/

/*11. Lifecycle of Activity
onCreate() - Activity ilk yaradilanda cagrilir
onStart() - Method, activity görünəndə yerinə yetirilməsi lazım olan hər hansı bir işi yerinə yetirmək üçün istifadə olunur
onResume() - Activity foreground olduqda və istifadəçi ilə qarşılıqlı əlaqəyə hazır olduqda, onResume() metodu çağırılır.
onPause() - Method, activity görünməyən zaman lazım olmayan resursları pause  və ya release etmek üçün istifadə olunur.
onStop() - Activity artıq istifadəçiyə görünmədikdə, ya başqa bir activitynin başlaması və ya activitynin destroy olmasina səbəbindən onStop() metodu çağırılır.
onRestart()- Activity dayandırılıbsa və sonra yenidən başladılırsa, onRestart() metodu onStart()-dan əvvəl çağırılır.
onDestroy()- Activity destroy edildikde (istər sistem tərəfindən, ya da finish() çağırılmaqla), onDestroy() metodu çağırılır.
*/


/*12. Application baslamazdan evvel  o, proqrama daxil olan AndroidManifest.xml fileni oxuyur ve hansi komponentlerden istifade olunacagini oyrenir. Proqram haqqinda muxtelif melumatlat verdiyi ucun Manifest filei vacibdir. Her bir projectin eyni adli Manifest filei olmalidir. Manifest filelari Android applerde kitablardaki giris bolmesi ile eyni funksiyani yerine yetirir. App ucun lazim olan user permissionlar mueyyen edilir. Kontaktlara iczae vermek ve kamerani sesi acmaq kimi permissionlar burada verilir. Appin icon, name de burda qeyd edilir. <manifest> AndroidManifest.xml filenin root tagidir. Diger taglar bunun daxilinde qeyd edilir.*/
//13. What is an intent?
Android sisteminin başqa proqram komponentindən hərəkət tələb etmək və ya Android tətbiqi daxilində müxtəlif komponentlər arasında əlaqə yaratmaq üçün istifadə olunan mesajlaşma obyektidir. Iki type i var Explicit Intent - Eyni proqram daxilinde iki activity arasinda elaqe yaradir, Implicit Intent- muxtelif proqramlarin iki activitysi arasinda elaqe yaradir.
/*Explicit Intent
val intent = Intent(this, SecondActivity::class.java)
startActivity(intent)

Implicit Intent
val emailIntent = Intent(Intent.ACTION_SEND)
emailIntent.type = "text"
emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("recipient@example.com"))
emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject of the email")
emailIntent.putExtra(Intent.EXTRA_TEXT, "Body of the email")

if (emailIntent.resolveActivity(packageManager) != null) {
    startActivity(Intent.createChooser(emailIntent, "Choose an email client:"))
} else {
    // If there is no app to handle the email intent, show a toast or handle the situation accordingly.
    Toast.makeText(this, "No email app found.", Toast.LENGTH_SHORT).show()
}*/



//14. Which layouts do you know?
/*ConstraintLayout, LinearLayout, FrameLayout, RelativeLayout, CardView, GridLayout, TableLayout
ConstraintLayout complex user interfaceleri yaratmaq ucun flexible layoutdur.
CardView layout contenti carda benzeyne formatda gosteren container viewdur.
FrameLayout viewlari bir yere yigmaga imkan veren basic ve simple layoutdur.
GridLayout grid formatinda datani gostermeye imkan veren layoutdur.
TableLayout row ve columns(table) formatinda viiewlari ozunde saxlayan layoutdur.
RelativeLayout muxtelif yollarla viewlari yerlesdirmeye imkan veren layoutdur.
LinearLayout viewlarin linear formasinda duzulduyu simple layoutdur.


