Set background for view in Android

Download controls background from following website.

http://android-holo-colors.com/

Download all dpi drawables.
(example)apptheme_textfieldsd_activated_holo_light.9.png

Set it as background of view.

<LinearLayout           
android:layout_width="match_parent"
android:layout_height="0dp"
android:layout_weight="10"
android:orientation="horizontal"
android:padding="3dp"
android:background="@drawable/apptheme_textfield_activated_holo_light">
	<TextView
		android:id="@+id/emailIdEditText"
		android:layout_width="match_parent"
		android:layout_height="50dp"
		android:layout_marginTop="30dp"
		android:hint="Email Id"
		android:inputType="textEmailAddress"
		android:textColorHint="@android:color/black"
		android:textSize="20sp"
		android:textStyle="bold"
		android:typeface="serif"
		android:textColor="@android:color/black" />
</LinearLayout>
