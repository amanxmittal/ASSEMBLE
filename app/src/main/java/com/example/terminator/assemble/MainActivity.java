package com.example.terminator.assemble;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButtonHulk, imageButtonIron, imageButtonCaptian, imageButtonHawk, imageButtonThor, imageButtonSpider;
    TextView subjectName, realName, description, affiliaton, aliases, currentStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Emergency Protocol 404 Activated", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        imageButtonCaptian = (ImageButton) findViewById(R.id.imageButtonCaptain);
        imageButtonHawk = (ImageButton) findViewById(R.id.imageButtonHawk);
        imageButtonHulk = (ImageButton) findViewById(R.id.imageButtonHulk);
        imageButtonIron = (ImageButton) findViewById(R.id.imageButtonIron);
        imageButtonThor = (ImageButton) findViewById(R.id.imageButtonThor);
        imageButtonSpider = (ImageButton) findViewById(R.id.imageButtonSpider);

        subjectName = (TextView) findViewById(R.id.subjectName);
        realName = (TextView) findViewById(R.id.realName);
        description = (TextView) findViewById(R.id.description);
        aliases = (TextView) findViewById(R.id.aliases);
        affiliaton = (TextView) findViewById(R.id.affiliation);
        currentStatus = (TextView) findViewById(R.id.currentStatus);

    }

    public void iron (View view){

        imageButtonHawk.setImageResource(R.drawable.he);
        imageButtonCaptian.setImageResource(R.drawable.ca);
        imageButtonHulk.setImageResource(R.drawable.hulk);
        imageButtonThor.setImageResource(R.drawable.th);
        imageButtonSpider.setImageResource(R.drawable.sm);

        imageButtonIron.setImageResource(R.drawable.im2);
        subjectName.setText("IRON MAN\n");
        realName.setText(" - Anthony Edward Stark\n");
        description.setText(" - DESCRIPTION : \n  Anthony Edward \"Tony\" Stark is an eccentric self-described genius, billionaire, playboy and philanthropist and the former head of Stark Industries. Using his own great wealth and exceptional technical knowledge, Stark enjoyed the playboy lifestyle for many years until he was kidnapped by the Ten Rings. With his life on the line, Stark created an armored suit which he used to escape his captors, returning home and becoming the armored superhero known as Iron Man, battling against terrorists as well as his own former business partner Obadiah Stane. Stark enjoyed the fame that came with his new secret identity and decided to share it with the world, publicly announcing himself as Iron Man.\n");
        aliases.setText(" - ALIASES : \n • Tony Stark\n • Iron Man\n • The Futuristic\n • The Da Vinci of Our Time\n");
        affiliaton.setText(" - AFFILIATION : \n • Stark Industries\n • S.H.I.E.L.D\n • Avengers\n • Damage Control\n");
        currentStatus.setText(" - CURRENT STATUS : Alive\n\n\n\n");
    }

    public void hulk (View view){

        imageButtonIron.setImageResource(R.drawable.im);
        imageButtonHawk.setImageResource(R.drawable.he);
        imageButtonCaptian.setImageResource(R.drawable.ca);
        imageButtonThor.setImageResource(R.drawable.th);
        imageButtonSpider.setImageResource(R.drawable.sm);

        imageButtonHulk.setImageResource(R.drawable.hulk2);
        subjectName.setText("HULK\n");
        realName.setText(" - Robert Bruce Banner\n");
        description.setText(" - DESCRIPTION : \n  Doctor Robert Bruce Banner is a renowned scientist in the fields of Biochemistry, Nuclear Physics, and Gamma Radiation. He is one of the scientists who tried to recreate the Super Soldier Serum which originated Captain America in World War II, but when an exposure to high levels of Gamma Radiation instead of Vita Radiation went awry, the mild-mannered scientist found himself plagued with a peculiar condition; when angered or provoked, he would transform into the huge rage-fueled and nearly mindless green-skinned monster known as the Hulk.\n" +
                "\n" +
                "Fearful of the damage that Hulk could inflict, Banner chose to live a discreet life in remote parts of the world, working to cure the sick and help the poor while trying to elude those who would take advantage of his ability to change into the enormous green menace. \n");
        aliases.setText(" - ALIASES : \n • Bruce Banner\n • The Incredible Hulk\n • Mr. Green\n • The Big Guy\n");
        affiliaton.setText(" - AFFILIATION : \n • Culver University\n • S.H.I.E.L.D\n • Avengers\n • Agents Of Smash\n");
        currentStatus.setText(" - CURRENT STATUS : Alive\n\n\n\n");
    }

    public void captain (View view){

        imageButtonIron.setImageResource(R.drawable.im);
        imageButtonHawk.setImageResource(R.drawable.he);
        imageButtonHulk.setImageResource(R.drawable.hulk);
        imageButtonThor.setImageResource(R.drawable.th);
        imageButtonSpider.setImageResource(R.drawable.sm);

        imageButtonCaptian.setImageResource(R.drawable.ca2);
        subjectName.setText("CAPTAIN AMERICA\n");
        realName.setText(" - Steven Grant Rogers\n");
        description.setText(" - DESCRIPTION : \n  Captain Steven \"Steve\" Grant Rogers is a Super Soldier World War II veteran and was the world's first superhero. Born in Brooklyn, New York City, the young Steve Rogers suffered numerous health problems, and upon America's entry into the Second World War, was rejected from military service despite several attempts to enlist. Determined to serve, he ultimately volunteered for a top-secret Super-Soldier program, and the frail Steve Rogers was transformed into the powerful and heroic Captain America. His famous World War II exploits made him a living legend. Rogers attacked multiple HYDRA quarters with the Howling Commandos to the dismay of his greatest enemy, the Red Skull, while also developing a relationship with Agent Peggy Carter. Despite losing his closest friend, Bucky Barnes during a mission, Rogers carried on to help the Allies win the war, but crashed into the Arctic during his final mission. Awakening in the 21st century, Rogers learned that he had spent 67 years trapped in the glacial ice.  \n");
        aliases.setText(" - ALIASES : \n • Steve Rogers\n • Wing Head\n • Super Soldier\n • The Old Man\n • The World's First Super Hero\n");
        affiliaton.setText(" - AFFILIATION : \n • United States Army\n • United Service Organization\n • United State Department of Treasury\n • SSR\n • Howling Commandos\n • S.H.I.E.L.D\n • Avengers\n");
        currentStatus.setText(" - CURRENT STATUS : Alive\n\n\n\n");
    }

    public void spider (View view){

        imageButtonIron.setImageResource(R.drawable.im);
        imageButtonHawk.setImageResource(R.drawable.he);
        imageButtonCaptian.setImageResource(R.drawable.ca);
        imageButtonHulk.setImageResource(R.drawable.hulk);
        imageButtonThor.setImageResource(R.drawable.th);

        imageButtonSpider.setImageResource(R.drawable.sm2);
        subjectName.setText("SPIDER MAN\n");
        realName.setText(" - Peter Benjamin Parker\n");
        description.setText(" - DESCRIPTION : Peter Benjamin Parker is a high school student and a superhero who possesses spider-like abilities and uses his superpowers to fight crime under the alter ego of Spider-Man. Despite his best efforts to keep his identity secret from the world, he was found and recruited by Tony Stark to join the Avengers Civil War, gaining a new suit and technology in exchange.\n" +
                "\n" +
                "Following the Clash of the Avengers, Stark allowed Parker to keep the suit and to continue operating as Spider-Man, provided he remained below the radar. Agreeing to the proposition, Parker forged a name for himself in New York City and became well-known as a local neighborhood hero. After stumbling into a group of criminals who were creating weapons from Avengers battles, due to a desire by the group's leader Vulture to gain revenge on Tony Stark, Parker went on a quest to defeat him in order to prove to Stark that he was worthy of being an Avenger. \n");
        aliases.setText(" - ALIASES : \n • Peter Parker\n • Friendly Neighborhood Spider-Man\n • Web Slinger\n • The Kid\n");
        affiliaton.setText(" - AFFILIATION : \n • Midtown School of Science and Technology\n • S.H.I.E.L.D\n • Avengers\n • Web Warriors\n");
        currentStatus.setText(" - CURRENT STATUS : Alive\n\n\n\n");
    }

    public void thor (View view){

        imageButtonIron.setImageResource(R.drawable.im);
        imageButtonHawk.setImageResource(R.drawable.he);
        imageButtonCaptian.setImageResource(R.drawable.ca);
        imageButtonHulk.setImageResource(R.drawable.hulk);
        imageButtonSpider.setImageResource(R.drawable.sm);

        imageButtonThor.setImageResource(R.drawable.th2);
        subjectName.setText("THOR\n");
        realName.setText(" - Thor Odinson\n");
        description.setText(" - DESCRIPTION : \n  Thor Odinson is the prince of Asgard and a former member of the Avengers. When all of his irresponsible behavior threatened his homeland, he was stripped of his power and banished by his father Odin to Earth. While exiled on Earth, Thor learned humility, found love in Jane Foster, and helped to save his new friends from a destructive threat sent by his jealous adoptive brother Loki. In the process, Thor redeemed himself in the eyes of his father and was granted access to his power once more.\n" +
                "\n" +
                "After being welcomed back to Asgard as a hero, Thor visited Earth to retrieve Loki after Loki began his attempt to take over the world. He joined the Avengers and fought with them against the Chitauri during the Battle of New York. After he returned to Asgard he helped the Asgardian armies restore peace to the Nine Realms. He fought against the Dark Elves during the Second Dark Elf Conflict, killing their leader, Malekith, and ending the threat. During these events, he was reunited with Jane Foster after she became host to the Aether and became a target of the Dark Elves. Eventually, the Aether was removed from her body and the Dark Elves were defeated. Thor renounced his claim to the throne and left Asgard for Earth so he could stay with Foster.\n" +
                "\n" +
                "During his stay, Thor helped the Avengers once again, this time fighting against HYDRA. Following HYDRA's defeat, the team had to stop Ultron, a rogue invention created by Tony Stark. Once Ultron was defeated, Thor went back to Asgard to investigate the visions he saw when being manipulated by Scarlet Witch, which showed him the Infinity Stones. In his investigations, Thor realized that Loki still lived and had usurped Odin's throne. To aid in both pursuing his brother and finding his father, Thor sought help from Doctor Strange and the Masters of the Mystic Arts. \n");
        aliases.setText(" - ALIASES : \n • God of Thunder\n • Prince of Asgard\n • Son of Odin\n • The Thunderer\n");
        affiliaton.setText(" - AFFILIATION : \n • Asgardian\n • Avengers\n • League of Realms\n");
        currentStatus.setText(" - CURRENT STATUS : Alive\n\n\n\n");
    }

    public void hawk (View view){

        imageButtonIron.setImageResource(R.drawable.im);
        imageButtonCaptian.setImageResource(R.drawable.ca);
        imageButtonHulk.setImageResource(R.drawable.hulk);
        imageButtonThor.setImageResource(R.drawable.th);
        imageButtonSpider.setImageResource(R.drawable.sm);

        imageButtonHawk.setImageResource(R.drawable.he2);
        subjectName.setText("HAWKEYE\n");
        realName.setText(" - Clinton Francis Barton\n");
        description.setText(" - DESCRIPTION : Clinton Francis \"Clint\" Barton, better known as Hawkeye, is a former special agent of S.H.I.E.L.D., where he worked under the supervision of Phil Coulson. Assigned by Nick Fury to watch over the Tesseract, he was brainwashed by Loki during the destruction of Project P.E.G.A.S.U.S. However, after the Attack on the Helicarrier, he was freed from Loki's mental control by Black Widow and joined the Avengers to fight against Loki's alien army in the Battle of New York, ending the Chitauri Invasion.\n" +
                "\n" +
                "He then continued to work for S.H.I.E.L.D. until its collapse, after which he and the Avengers worked to bring down the remnants of the terrorist group HYDRA and the psychotic artificial intelligence, Ultron. After the Ultron Offensive, Barton chose to leave the Avengers to return to his wife and children. However, he was soon recruited by Captain America to aid him in his fight against the Sokovia Accords. Barton was briefly imprisoned at the Raft, but was secretly freed by Rogers. \n");
        aliases.setText(" - ALIASES : \n • Clint Barton\n • The Hawk\n • Golden Archer\n • Legolas\n");
        affiliaton.setText(" - AFFILIATION : \n • S.H.I.E.L.D\n • Strike Team Delta\n • Avengers\n");
        currentStatus.setText(" - CURRENT STATUS : Alive\n\n\n\n");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.l1) {
            Toast.makeText(MainActivity.this, "Lock Down",Toast.LENGTH_SHORT).show();
            Intent lockDownIntent = new Intent(this,FullscreenActivity.class);
            startActivity(lockDownIntent);
            return true;
        }
        else if (id == R.id.aa) {
            Toast.makeText(MainActivity.this, "feedback",Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (id == R.id.r1) {
            Toast.makeText(MainActivity.this, "ASSEMBLING",Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (id == R.id.c1) {
            Toast.makeText(MainActivity.this, "call",Toast.LENGTH_SHORT).show();
            Intent contactIntent = new Intent(this,Main2Activity.class);
            startActivity(contactIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
