package com.example.soundbox;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton arrow, bear, bomb, claps, dog, door, elephant, forest, formula1, ghost, keyboard,
                lab, mouse, ocean, rain, rocket, plane, snake, sword, weapon, exit;
    MediaPlayer vectormp [] = new MediaPlayer[20];
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vectormp[0]  = MediaPlayer.create(this, R.raw.arrow);
        vectormp[1]  = MediaPlayer.create(this, R.raw.bear);
        vectormp[2]  = MediaPlayer.create(this, R.raw.bomb);
        vectormp[3]  = MediaPlayer.create(this, R.raw.claps);
        vectormp[4]  = MediaPlayer.create(this, R.raw.dog);
        vectormp[5]  = MediaPlayer.create(this, R.raw.door);
        vectormp[6]  = MediaPlayer.create(this, R.raw.elephant);
        vectormp[7]  = MediaPlayer.create(this, R.raw.forest);
        vectormp[8]  = MediaPlayer.create(this, R.raw.formula1);
        vectormp[9]  = MediaPlayer.create(this, R.raw.ghost);
        vectormp[10] = MediaPlayer.create(this, R.raw.keyboard);
        vectormp[11] = MediaPlayer.create(this, R.raw.lab);
        vectormp[12] = MediaPlayer.create(this, R.raw.mouse);
        vectormp[13] = MediaPlayer.create(this, R.raw.ocean);
        vectormp[14] = MediaPlayer.create(this, R.raw.rain);
        vectormp[15] = MediaPlayer.create(this, R.raw.rocket);
        vectormp[16] = MediaPlayer.create(this, R.raw.smallplane);
        vectormp[17] = MediaPlayer.create(this, R.raw.snake);
        vectormp[18] = MediaPlayer.create(this, R.raw.sword);
        vectormp[19] = MediaPlayer.create(this, R.raw.weapon);

        arrow    = (ImageButton) findViewById(R.id.arrow);
        bear     = (ImageButton) findViewById(R.id.bear);
        bomb     = (ImageButton) findViewById(R.id.bomb);
        claps    = (ImageButton) findViewById(R.id.claps);
        dog      = (ImageButton) findViewById(R.id.dog);
        door     = (ImageButton) findViewById(R.id.door);
        elephant = (ImageButton) findViewById(R.id.elephant);
        forest   = (ImageButton) findViewById(R.id.forest);
        formula1 = (ImageButton) findViewById(R.id.formula1);
        ghost    = (ImageButton) findViewById(R.id.ghost);
        keyboard = (ImageButton) findViewById(R.id.keyboard);
        lab      = (ImageButton) findViewById(R.id.lab);
        mouse    = (ImageButton) findViewById(R.id.mouse);
        ocean    = (ImageButton) findViewById(R.id.ocean);
        rain     = (ImageButton) findViewById(R.id.rain);
        rocket   = (ImageButton) findViewById(R.id.rocket);
        plane    = (ImageButton) findViewById(R.id.plane);
        snake    = (ImageButton) findViewById(R.id.snake);
        sword    = (ImageButton) findViewById(R.id.sword);
        weapon   = (ImageButton) findViewById(R.id.weapon);
        exit     = (ImageButton) findViewById(R.id.exit);

        arrow.setOnClickListener(clickEvent);
        bear.setOnClickListener(clickEvent);
        bomb.setOnClickListener(clickEvent);
        claps.setOnClickListener(clickEvent);
        dog.setOnClickListener(clickEvent);
        door.setOnClickListener(clickEvent);
        elephant.setOnClickListener(clickEvent);
        forest.setOnClickListener(clickEvent);
        formula1.setOnClickListener(clickEvent);
        ghost.setOnClickListener(clickEvent);
        keyboard.setOnClickListener(clickEvent);
        lab.setOnClickListener(clickEvent);
        mouse.setOnClickListener(clickEvent);
        ocean.setOnClickListener(clickEvent);
        rain.setOnClickListener(clickEvent);
        rocket.setOnClickListener(clickEvent);
        plane.setOnClickListener(clickEvent);
        snake.setOnClickListener(clickEvent);
        sword.setOnClickListener(clickEvent);
        weapon.setOnClickListener(clickEvent);
        exit.setOnClickListener(clickEvent);

    }

    public View.OnClickListener clickEvent = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == arrow) {
                if (vectormp[position].isPlaying()) {
                    if (position != 0) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 0;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Arrow: Play", Toast.LENGTH_SHORT).show();

                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Arrow: Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 0;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Arrow: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == bear) {
                if (vectormp[position].isPlaying()) {
                    if (position != 1) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 1;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Bear: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Bear: Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 1;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Bear: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == bomb) {
                if (vectormp[position].isPlaying()) {
                    if (position != 2) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 2;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Bomb: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Bomb: Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 2;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Bomb: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == claps) {
                if (vectormp[position].isPlaying()) {
                    if (position != 3) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 3;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Claps: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Claps: Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 3;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Claps: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == dog) {
                if (vectormp[position].isPlaying()) {
                    if (position != 4) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 4;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Dog: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Dog: Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 4;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Dog: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == door) {
                if (vectormp[position].isPlaying()) {
                    if (position != 5) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 5;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Door: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Door: Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 5;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Door: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == elephant) {
                if (vectormp[position].isPlaying()) {
                    if (position != 6) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 6;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Elephant: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 6;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Elephant: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == forest) {
                if (vectormp[position].isPlaying()) {
                    if (position != 7) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 7;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Forest: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 7;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Forest: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == formula1) {
                if (vectormp[position].isPlaying()) {
                    if (position != 8) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 8;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Formula 1: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 8;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Formula 1: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == ghost) {
                if (vectormp[position].isPlaying()) {
                    if (position != 9) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 9;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Ghost: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 9;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Ghost: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == keyboard) {
                if (vectormp[position].isPlaying()) {
                    if (position != 10) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 10;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Keyboard: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 10;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Keyboard: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == lab) {
                if (vectormp[position].isPlaying()) {
                    if (position != 11) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 11;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Lab: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 11;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Lab: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == mouse) {
                if (vectormp[position].isPlaying()) {
                    if (position != 12) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 12;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Mouse: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 12;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Mouse: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == ocean) {
                if (vectormp[position].isPlaying()) {
                    if (position != 13) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 13;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Ocean: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 13;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Ocean: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == rain) {
                if (vectormp[position].isPlaying()) {
                    if (position != 14) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 14;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Rain: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 14;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Rain: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == rocket) {
                if (vectormp[position].isPlaying()) {
                    if (position != 15) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 15;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Rocket: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 15;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Rocket: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == plane) {
                if (vectormp[position].isPlaying()) {
                    if (position != 16) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 16;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Plane: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 16;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Plane: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == snake) {
                if (vectormp[position].isPlaying()) {
                    if (position != 17) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 17;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Snake: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 17;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Snake: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == sword) {
                if (vectormp[position].isPlaying()) {
                    if (position != 18) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 18;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Sword: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 18;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Sword: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == weapon) {
                if (vectormp[position].isPlaying()) {
                    if (position != 19) {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                        position = 19;
                        vectormp[position].start();
                        Toast.makeText(MainActivity.this, "Weapon: Play", Toast.LENGTH_SHORT).show();
                    } else {
                        vectormp[position].pause();
                        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    position = 19;
                    vectormp[position].start();
                    Toast.makeText(MainActivity.this, "Weapon: Play", Toast.LENGTH_SHORT).show();
                }
            } else if (v == exit) {
                finish();
            }
        }
    };
}
