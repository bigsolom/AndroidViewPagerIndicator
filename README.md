AndroidViewPagerIndicator
=========================

ViewPager Indicator for android nexus-5 launcher style inspired by the work of JakeWharton [Android-ViewPagerIndicator](https://github.com/JakeWharton/Android-ViewPagerIndicator/) if you're looking for more of a complete set of indicators; circular, vertical, ... etc. you can go there.

## How to use:


You can find a sample working project in the sample folder

1. Include the project in the library folder as a library project in eclipse
2. Add this project to your project dependencies
3. In the layout where you'll use the indicator    
    3.1. Add xmlns attribute to the root element of your view

        xmlns:custom="http://schemas.android.com/apk/res-auto"
    3.2. Add the custom view below your view pager, the available attributes are: `radius` that specifies the radius of the circles and `color` to specify the color of them

        <com.efoad.views.ViewPagerIndicator
            android:id="@+id/viewpager_indicator"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:layout_marginBottom="5dp"
            android:padding="5dp"
            custom:radius="3dp"
            custom:color="@android:color/darker_gray" />
4. In your Activity class set the view pager into the ViewPagerIndicatorView

		((ViewPagerIndicator)findViewById(R.id.viewpager_indicator)).setViewPager(mPager);

## Credits

Developed by Eslam Foad <eslam.foad@gmail.com>

Any comments or contributions are welcomed