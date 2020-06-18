Document scanner

Aplicatia isi propune sa serveasca drept un scanner.
Userul poate alege intre a scana o poza din libraria foto deja existenta sau poate deschide camera pentru o noua captura.
Atunci cand poza a fost selectata sau realizata, userul poate ajusta marginile documentului manual pentru eventuale retusuri, sau poate lasa aplicatia sa se ocupe de una singura.
Dupa ce procesul s-a incheiat, userul poate salva documentul scanat, cat si poza originala, in functie de nevoile sale.
Daca userul nu respecta pasii, aplicatia vine in ajutorul sau cu erori care sa il indrume.

 ------------
| ImageUtils |
 ------------

public class ImageUtils

Metode auxiliare pentru modificarea unui Bitmap.

Metode publice:

    public static Bitmap rotateBitmap(Bitmap original, int angle)

    Roteste un Bitmap.

    Parametrii:

        Bitmap original - Bitmap-ul original.
        int    angle    - Unghiul de rotatie.

    Return:

        Bitmap - Bitmap-ul obtinut dupa aplicarea rotatiei asupra Bitmap-ului original.




    public static Mat bitmapToMat(Bitmap bitmap)

    Convertirea unui Bitmap intr-o matrice.

    Parametrii:

        Bitmap bitmap - Bitmap-ul de convertit.

    Return:

        Mat - Bitmap-ul original convertit intr-o matrice.



    public static Bitmap matToBitmap(Mat mat)

    Convertirea unei matrici intr-un Bitmap.

    Parametrii:

        Mat mat - matricea de convertit.

    Return:

        Bitmap - Matricea convertita intr-un Bitmap.

 -----------
| MathUtils |
 -----------

public class MathUtils

Metode auxiliare pentru operatii matematice.

Metode publice:

    public static MatOfPoint toMatOfPointInt(MatOfPoint2f mat)

    Convertirea unei matrici cu elemente de tipul float intr-o matrice cu elemente de tipul int.

    Parametrii:

        MatOfPoint2f mat - matricea originala.

    Return:

        MatOfPoint - Matricea originala convertita intr-o matrice cu elemente de tipul int.




    public static MatOfPoint2f toMatOfPointFloat(MatOfPoint mat)

    Convertirea unei matrici cu elemente de tipul int intr-o matrice cu elemente de tipul float.

    Parametrii:

        MatOfPoint mat - matricea originala.

    Return:

        MatOfPoint2f - Matricea originala convertita intr-o matrice cu elemente de tipul float.




    public static double angle(Point p1, Point p2, Point p0)

    Calcularea unui unghi format de 3 puncte.

    Parametrii:

        Point p0 - primul punct.
        Point p1 - al 2-lea punct.
        Point p2 - al 3-lea punct.

    Return:

        double - Unghiul format de cele 3 puncte.




    public static MatOfPoint2f scaleRectangle(MatOfPoint2f original, double scale)

    Scalarea unui dreptunghi.

    Parametrii:

        MatOfPoint2f original - matricea ce reprezinta dreptunghiul original.
        double       scale    - scalarul folosit pentru operatie.

    Return:

        MatOfPoint2f - Matricea ce reprezinta dreptunghiul original dupa scalare.

 ------------------
| ScannerConstants |
 ------------------

public class ScannerConstants

Diferite constante ale aplicatiei.

Constante:

    public static Bitmap  selectedImageBitmap                       - Bitmap-ul imaginii selectate.
    public static String  cropText, backText, imageError, cropError - diferite mesaje auxiliare.
    public static String  cropColor, backColor, progressColor       - diferite valori pentru culori.
    public static boolean saveStorage                               - optiune de salvare a imaginilor in dispozitiv.

 ---------------------------
| PerspectiveTransformation |
 ---------------------------

public class PerspectiveTransformation

Metode auxiliare pentru operatii de transformare.

Constante:

    private static final String DEBUG_TAG - tag-ul pentru debugging.

Metode publice:

    public Mat transform(Mat src, MatOfPoint2f corners)

    Transformarea unei matrici.

    Parametrii:

        Mat          src     - matricea originala.
        MatOfPoint2f corners - forma dupa care se va aplica transformarea.

    Return:

        Mat - Matricea originala dupa aplicarea transformarii.

Metode private:

    private Size getRectangleSize(MatOfPoint2f rectangle)

    Calcularea marimii unui dreptunghi.

    Parametrii:

        MatOfPoint2f rectangle - dreptunghiul a carui marime o calculam.

    Return:

        Size - Marimea dreptunghiului.




    private double getDistance(Point p1, Point p2)

    Distanta dintre 2 puncte.

    Parametrii:

        Point p1 - primul punct.
        Point p2 - al 2-lea punct.

    Return:

        double - Distanta dintre cele 2 puncte.




    private MatOfPoint2f getOutline(Mat image)

    Conturul unui dreptunghi.

    Parametrii:

        Mat image - dreptunghiul al carui contur il calculam.

    Return:

        MatOfPoint2f - Conturul dreptunghiului.




    private MatOfPoint2f sortCorners(MatOfPoint2f corners)

    Sortarea colturilor ale unui dreptunghi.

    Parametrii:

        MatOfPoint2f corners - colturile dreptunghiului.

    Return:

        MatOfPoint2f - Colturile sortate.




    private Point getMassCenter(MatOfPoint2f points)

    Calcularea centrului de greutate al unui dreptunghi.

    Parametrii:

        MatOfPoint2f points - dreptunghiul al carui centru de greutate il calculam.

    Return:

        Point - Centrul de greutate.
