package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.example.myapplication.Animal.DEER;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {


        try {
            List<String> list = null;
throw new IllegalArgumentException("IllegalArgumentException");
//            System.out.println("try block");
        } catch (NullPointerException ex) {
            System.out.println("catch block");
        } catch (IllegalArgumentException ex) {
            System.out.println("catch block IllegalArgumentException");
        }

        String value = nonnull();
        if (value!= null) {
            value.concat("");
        }
    }

    @Nullable
    String nonnull() {
        return null;
    }


}