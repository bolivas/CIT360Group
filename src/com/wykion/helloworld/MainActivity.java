package com.wykion.helloworld;

import android.support.v7.app.ActionBarActivity;

import java.util.*;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void arraylist(View view){
    	List a1 = new ArrayList();
        a1.add("Zaraaaa");
        a1.add("Mahnaza");
        a1.add("Ayanaaa");
        Toast.makeText(MainActivity.this,  "Array List\n"+a1 , Toast.LENGTH_LONG).show();
//        System.out.println(" ArrayList Elements");
//        System.out.print("\t" + a1);
    }
        
    public void linkedlist(View view){
        List l1 = new LinkedList();
        l1.add("Zaralll");
        l1.add("Mahnazl");
        l1.add("Ayanlll");
        Toast.makeText(MainActivity.this,  "Linked List\n"+l1, Toast.LENGTH_LONG).show();
//        System.out.println();
//        System.out.println(" LinkedList Elements");
//        System.out.print("\t" + l1);
    }
        
    public void hashset(View view){
        Set s1 = new HashSet(); 
        s1.add("Zarasss");
        s1.add("Mahnazs");
        s1.add("Ayansss");
        Toast.makeText(MainActivity.this,  "Hash Set\n"+s1, Toast.LENGTH_LONG).show();
//        System.out.println();
//        System.out.println(" Set Elements");
//        System.out.print("\t" + s1);
    }
    
    public void hashmap(View view){
        Map m1 = new HashMap(); 
        m1.put("Zarammm", "8");
        m1.put("Mahnazm", "31");
        m1.put("Ayanmmm", "12");
        m1.put("Daisymm", "14");
        m1.put("Daisymm", "14");
        Toast.makeText(MainActivity.this,  "Hash Map\n"+m1, Toast.LENGTH_LONG).show();
//        System.out.println();
//        System.out.println(" Map Elements");
//        System.out.print("\t" + m1);
    }
      
    public void clickFunc(View view){
    	Toast.makeText(MainActivity.this,  "Button Clicked", Toast.LENGTH_SHORT).show();
    	

    }
    
}
