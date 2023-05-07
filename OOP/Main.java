package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.io.*;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> herbs = new LinkedHashSet<String>();
        herbs.add("rose");
        herbs.add("parsley");
        herbs.add("camomile");
        System.out.println(herbs.size());
        System.out.println(herbs);
    }
}
