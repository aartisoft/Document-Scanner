Document scanner

Aplicatia isi propune sa serveasca drept un scanner.
Userul poate alege intre a scana o poza din libraria foto deja existenta sau poate deschide camera pentru o noua captura.
Atunci cand poza a fost selectata sau realizata, userul poate ajusta marginile documentului manual pentru eventuale retusuri, sau poate lasa aplicatia sa se ocupe de una singura.
Dupa ce procesul s-a incheiat, userul poate salva documentul scanat, cat si poza originala, in functie de nevoile sale.
Daca userul nu respecta pasii corect, aplicatia vine in ajutorul sau cu erori care sa il indrume.

In realizarea aplicatiei, am implementat si folosit:
- clasa DocumentScanActivity 
  -> rotateBitmap - aceasta functie isi propune indreptarea scanului, in cazul in care poza realizata nu este perfect dreapta
  -> getEdgePoints - furnizeaza punctele din colturile documentului
  -> getCroppedImage - inlocuieste poza initiala cu documentul din poza

Aceste medote din clasa DocumentScanActivity folosesc urmatoarele helpere si librarii:
- helpere
  -> ImagUtils -> rotateBitmap, bitmapToMat, matToBitmap
  -> MathUtils -> toMatOfPointFloat, angle, scaleRectangle
  -> ScannerConstants -> selectedImageToBitmap, cropText, cropColor, saveStorage

- librarii
  -> NativeClass
  -> PerspectiveTransformation
  -> PolygonView
