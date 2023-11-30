package bg.smg;

 public abstract  class DrawableObj {
     private int xCoord;
     private int yCoord;
     private int width;
     private int height;
     public DrawableObj() {
         xCoord = 0;
         yCoord = 0;
        width = 0;
         height = 0;
     }

     public DrawableObj(int xCoord, int yCoord, int width, int height) {
         this.xCoord = xCoord;
         this.yCoord = yCoord;
         this.width = width;
         this.height = height;
     }

     public abstract void draw  ();



     public int getxCoord() {
         return xCoord;
     }

     public void setxCoord(int xCoord) {
         this.xCoord = xCoord;
     }

     public int getyCoord() {
         return yCoord;
     }

     public void setyCoord(int yCoord) {
         this.yCoord = yCoord;
     }

     public int getWidth() {
         return width;
     }

     public void setWidth(int width) {
         this.width = width;
     }

     public int getHeight() {
         return height;
     }

     public void setHeight(int height) {
         this.height = height;
     }
 }
