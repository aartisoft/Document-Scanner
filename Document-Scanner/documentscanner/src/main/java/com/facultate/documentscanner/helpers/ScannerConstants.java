package com.facultate.documentscanner.helpers;

import android.graphics.Bitmap;

public class ScannerConstants {
    public static Bitmap selectedImageBitmap;
    public static String cropText="Salveaza",backText="Renunta",
            imageError="Nu ai selectat imagine. Incearca din nou",
            cropError="Nu putem decupa. Miscati cerculetele pana liniile devin albastre";
    public static String cropColor="#8888bb",backColor="#ff0000",progressColor="#331199";
    public static boolean saveStorage=false;
}
