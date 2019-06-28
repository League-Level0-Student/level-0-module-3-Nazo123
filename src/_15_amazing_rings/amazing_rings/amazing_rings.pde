int X=0;
int x=1000;
int Y=0;
int y=1000;
void setup(){
  size(1000,1000);
  

}
void draw(){
  X++;
  x--;
  Y++;
  y--;
background(#DEDBDB);
 
    for(int i=40;i>-0;i-=1){
  if(i%2==0){
    noFill();
    ellipse(X,500,i*10,i*10);
  }
  else{

    fill(0,0,0);
      noFill();
  ellipse(X,500,i*10,i*10);
  }
}
for(int i=40;i>-0;i-=1){
  if(i%2==0){
    noFill();
    ellipse(x,500,i*10,i*10);
  }
  else{

    fill(0,0,0);
      noFill();
  ellipse(x,500,i*10,i*10);
  }
  
}
  for(int j=40;j>-0;j-=1){
  if(j%2==0){
    noFill();
    ellipse(500,Y,j*10,j*10);
  }
  else{

    fill(0,0,0);
      noFill();
  ellipse(500,Y,j*10,j*10);
  }
}
for(int j=40;j>-0;j-=1){
  if(j%2==0){
    noFill();
    ellipse(500,y,j*10,j*10);
  }
  else{

    fill(0,0,0);
      noFill();
  ellipse(500,y,j*10,j*10);
  }
}
}











  
