/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.uoyabause.android.tv;

import android.app.Activity;
import android.os.Bundle;
import android.view.InputDevice;
import android.view.KeyEvent;

import org.uoyabause.android.R;

/*
 * MainActivity class that loads MainFragment
 */
public class GameSelectActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_select);
    }

    @Override
    public boolean dispatchKeyEvent (KeyEvent event){

        InputDevice dev = InputDevice.getDevice(event.getDeviceId());
        if( dev.getName().contains("HuiJia")){
            if( event.getKeyCode() > 200 ){
                return true;
            }

        }
        return super.dispatchKeyEvent(event);
    }
}
