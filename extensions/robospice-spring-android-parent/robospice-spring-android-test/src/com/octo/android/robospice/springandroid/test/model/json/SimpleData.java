package com.octo.android.robospice.springandroid.test.model.json;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A simple demonstration object we are creating and persisting to the database.
 */
public class SimpleData {

    // id is generated by the database and set on the object automagically
    int id;
    String string;
    long millis;
    Date date;
    boolean even;

    SimpleData() {
        // needed by ormlite
    }

    public SimpleData( long millis ) {
        this.date = new Date( millis );
        this.string = millis % 1000 + "ms";
        this.millis = millis;
        this.even = millis % 2 == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( "id=" ).append( id );
        sb.append( ", " ).append( "string=" ).append( string );
        sb.append( ", " ).append( "millis=" ).append( millis );
        SimpleDateFormat dateFormatter = new SimpleDateFormat( "MM/dd/yyyy HH:mm:ss.S" );
        sb.append( ", " ).append( "date=" ).append( dateFormatter.format( date ) );
        sb.append( ", " ).append( "even=" ).append( even );
        return sb.toString();
    }
}
