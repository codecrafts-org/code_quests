public class Triangle extends Figure {
    public Triangle(double sizeA, double sizeB, double sizeC) {
        super(sizeA, sizeB, sizeC);
    }

    public void inputSize() {
        double aSize = 0;
        double bSize = 0;
        double cSize = 0;
        double temp;
        aSize = chekEnter("Введите длину стороны A",aSize);
        bSize = chekEnter("Введите длину стороны B",bSize);
        cSize = chekEnter("Введите длину стороны С",aSize,bSize,cSize);
        chekAndSend(aSize,bSize,cSize);
    }
    public void chekAndSend (double aSize, double bSize, double cSize) {
        double temp;
        double min;
        double max;
        if (aSize < bSize) {
            temp = aSize;
            aSize = bSize;
            bSize = temp;
        }
        min = aSize - bSize;
        max = aSize + bSize;
        if (aSize <= 0 || bSize <= 0 || cSize <= 0) {
            System.out.println("Значения не могут быть меньше 0");
            setSizeA(0);
            setSizeB(0);
            setSizeC(0);
        } else if (cSize <= min || cSize >= max) {
            System.out.println("Значение длины стороны С должно быть в пределах от " + min + " до " + max);
            setSizeA(0);
            setSizeB(0);
            setSizeC(0);
        } else {
            setSizeA(aSize);
            setSizeB(bSize);
            setSizeC(cSize);
        }
    }
    public double areaFind() {
        double areaOfATriangle = 0;
        if (getSizeA() > 0 && getSizeB() > 0 && getSizeC() > 0) {
            double triangleSemiperimeter = (getSizeA() + getSizeB() + getSizeC()) / 2;
            areaOfATriangle = Math.sqrt(triangleSemiperimeter * (triangleSemiperimeter - getSizeA()) * (triangleSemiperimeter - getSizeB()) * (triangleSemiperimeter - getSizeC()));
            System.out.println("Площадь треугольника равна " + areaOfATriangle);
        }
       return  areaOfATriangle;
    }
    @Override
    public double getSquare() {
        System.out.println("Площадь тругольника равна 0");
        return 0;
    }
    public double getSquare(int multipliyer) {
        System.out.println("Площадь треугольника введеная пользователем равна " + multipliyer);
        return multipliyer;
    }
    public void makeClassExpirement(){
        Triangle exp = new Triangle(2,3,4);
        System.out.println("hashCode - " + exp.hashCode());
        System.out.println("toString - " + exp.toString());
        Triangle pxe = exp;
        System.out.println("equals - " + exp.equals(pxe));
    }
}