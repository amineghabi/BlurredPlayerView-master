# BlurredPlayerView

Blurred Android music player view with Material design Concept .

# Screen
![alt tag](http://i59.tinypic.com/n1z8ty.png)

# Usage(XML)

Define it in your xml file.

```xml
 <com.amineghabi.library.BlurredPlayerView
            android:id="@+id/bpv"
            android:layout_width="230dp"
            android:layout_height="230dp"
            app:imageCover="@drawable/imagetest"
            app:emptyColor="#aaffffff"
            app:loadedColor="@color/blue_color"
            app:selectedAction1="@drawable/shuffle_selected"
            app:selectedAction2="@drawable/like_selected"
            app:selectedAction3="@drawable/replay_selected"
            app:unselectedAction1="@drawable/shuffle_unselected"
            app:unselectedAction2="@drawable/like_unselected"
            app:unselectedAction3="@drawable/replay_unselected" />
```

**IMPORTANT** :I designed shuffle, like and replay icons for my demo app. You can create your by using
[Flat Icon](http://flaticon.com) website.


Inject view by adding this line  ```@Bind(R.id.bpv) BlurredPlayerView bpv;``` and this line ```ButterKnife.bind(this);```  and set necessary values.

```java

bpv.setMax(123); // music duration in seconds.
bpv.setOnActionClickedListener(new OnActionClickedListener() {
            @Override
            public void onActionClicked(int id) {
                switch (id){
                    case 1:
                        // do something
                        break;
                    case 2:
                        // do something
                        break;
                    case 3:
                        // do something
                        break;
                    default:
                        break;
                }
            }
        });
```

Start and stop depends on your player.

```java
bpv.start();
bpv.stop();
```

# Usage (Java)

```java
bpv.setCoverDrawable(R.drawable.imagetest);
bpv.setActionOneImage(R.drawable.shuffle_selected, R.drawable.shuffle_unselected);
bpv.setActionTwoImage(R.drawable.like_selected, R.drawable.like_unselected);
bpv.setActionThreeImage(R.drawable.replay_selected, R.drawable.replay_unselected);
bpv.setProgressEmptyColor(Color.WHITE);
bpv.setProgressEmptyColor(Color.BLUE);
```

# Useful methods

```java
//Loads image from url (By Picasso)
ipv.setCoverURL("http://abc.xyz/1.png");
```

```java
//edit your current progress
ipv.setProgress(12);
int currentProgress = bpv.getProgress();
```

```java
//Check if any action selected or not. Or edit.
boolean isSelected = bpv.isAction1Selected();
ipv.setAction1Selected(true);
```

```java
//Check if bpv is playing
bpv.isPlaying();
```

# Design Owner

Design is created by [Amin Ghabi] (https://amineghabi.parseapp.com)


# Library used

[Butterknife Injection](https://github.com/JakeWharton/butterknife)
[Picasso by Square](http://square.github.io/picasso/)


License
--------


    Copyright 2015 Amin Ghabi.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


